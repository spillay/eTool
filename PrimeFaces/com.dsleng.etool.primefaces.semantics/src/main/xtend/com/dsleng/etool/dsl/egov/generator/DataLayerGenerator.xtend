package com.dsleng.etool.dsl.egov.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

import com.dsleng.etool.models.bobjs.BusinessObject
import com.dsleng.etool.models.bobjs.OrgUnit
import com.dsleng.etool.models.bobjs.Attribute
import com.dsleng.etool.models.egov.Page
import com.dsleng.etool.models.bobjs.BobjsFactory
import com.dsleng.etool.models.egov.BOMapper
import com.dsleng.etool.dsl.egov.Lg
import com.dsleng.etool.models.bobjs.DataTypes
import org.eclipse.emf.common.util.EList
import com.dsleng.etool.models.egov.PreDefinedValue
import static extension com.dsleng.etool.dsl.egov.generator.BusinessManagerExt.*

class BaseDL {
	protected String fileSep = "/"
	protected String pkgSep = "."
	protected JavaClass jc
	protected BusinessObject baseObj;

	protected String baseProjectDir = ""
	protected String basePackage = ""
	protected String srcDir = "/src/main/java/"

	new(BusinessObject e, String baseProjectDir, String basePackage) {
		baseObj = e
		this.baseProjectDir = baseProjectDir
		this.basePackage = basePackage
	}

	public def getInterfaceFileName() {
		var fileName = getPackage.replace(".", fileSep);
		fileName += fileSep + getInterfaceName + ".java"
		fileName = baseProjectDir + srcDir + fileName.replace(" ", "_")
	}

	public def getImplFileName() {
		var fileName = getImplPackage.replace(".", fileSep);
		fileName += fileSep + getImplName + ".java"
		fileName = baseProjectDir + srcDir + fileName.replace(" ", "_")
	}

	protected def getInterfaceName() {
		return baseObj.name
	}

	protected def getPackage() {
		return this.basePackage
	}

	protected def getImplName() {
		return baseObj.name
	}

	protected def getImplPackage() {
		return this.basePackage
	}
	public def getImplFQN(){
		val imp = (baseObj.eContainer as OrgUnit).package + ".dao" + baseObj.name + "DAO"
		return baseObj.name
	}
}

class DAOGenerator extends BaseDL {
	new(BusinessObject e, String baseProjectDir, String basePackage) {
		super(e, baseProjectDir, basePackage)
	}

	protected override getInterfaceName() {
		return baseObj.name + "DAO"
	}

	protected override getPackage() {
		return this.basePackage + ".dao"
	}

	protected override getImplName() {
		return baseObj.name + "DAOImpl"
	}

	protected override getImplPackage() {
		return this.basePackage + ".dao"
	}
	
	public override def getImplFQN(){
		val imp = (baseObj.eContainer as OrgUnit).package + ".dao." + getImplName
		return imp
	}
	public def getInterfaceSyntax() {
		var e = BobjsFactory.eINSTANCE.createBusinessObject
		e.name = interfaceName
		jc = new JavaClass(e,"Interface");
		jc.package = implPackage
		jc.addImports(baseObj)
		jc.addExtends("BaseRepository<" + baseObj.name + ",Long>")
		return jc.syntax
	}

	public def getImplSyntax() {
		var e = BobjsFactory.eINSTANCE.createBusinessObject
		e.name = implName
		jc = new JavaClass(e,"Impl");
		jc.addAnnotations("Repository")
		jc.package = implPackage
		jc.addImports(baseObj)
		jc.addImports("java.util.List")
		jc.addImports("java.util.Optional")
		jc.addImports("org.apache.commons.logging.Log")
		jc.addImports("org.apache.commons.logging.LogFactory")
		jc.addImports("org.hibernate.Criteria")
		jc.addImports("org.hibernate.Query")
		jc.addImports("org.hibernate.Session")
		jc.addImports("org.hibernate.SessionFactory")
		jc.addImports("org.hibernate.Transaction")
		jc.addImports("org.hibernate.criterion.Restrictions")
		jc.addImports("org.springframework.beans.factory.annotation.Autowired")
		jc.addImports("org.springframework.stereotype.Repository")
		jc.addImports("org.springframework.transaction.annotation.Transactional")

		jc.addImplements(getInterfaceName)

		var sessFactory = new JavaAttribute("sessionFactory", "SessionFactory")
		sessFactory.addAnnotations("Autowired")
		jc.addAttribute(sessFactory)

		var sess = new JavaAttribute("session", "Session","null")
		var trans= new JavaAttribute("transaction", "Transaction","null")
		jc.addAttribute(sess)
		jc.addAttribute(trans)
		
		
		// Do Operations
		// Delete OP
		var opDel = new JavaOperation("delete","void")
		var opP = new JavaAttribute("deleted",baseObj.name)
		opDel.addParameter(opP)
		opDel.addAnnotations("Override")
		opDel.addAnnotations("Transactional")
		opDel.syntax ='''
		  session = sessionFactory.openSession();  
		  transaction = session.beginTransaction();  
		  session.delete(deleted);
		  transaction.commit();  
		  session.close();
'''		
		jc.addOperation(opDel)
		
		// findAll OP
		var opFindAll = new JavaOperation("findAll","List<" + baseObj.name + ">")
		opFindAll.addAnnotations("Override")
		opFindAll.addAnnotations("Transactional")
		opFindAll.syntax ='''
		  session = sessionFactory.openSession();  
		  transaction = session.beginTransaction();  
		  @SuppressWarnings("unchecked")
		  List<«baseObj.name»> list = (List<«baseObj.name»>) session.createCriteria(«baseObj.name».class).list();
		  transaction.commit();  
		  session.close();
		  return list;
'''		
		jc.addOperation(opFindAll)
		
		
		// findOne OP
		var opFindOne = new JavaOperation("findOne","Optional<" + baseObj.name + ">")
		var opFindOneP = new JavaAttribute("i","Long")
		opFindOne.addParameter(opFindOneP)
		opFindOne.addAnnotations("Override")
		opFindOne.addAnnotations("Transactional")
		opFindOne.syntax ='''
		  session = sessionFactory.openSession();  
		  transaction = session.beginTransaction();  
		  @SuppressWarnings("unchecked")
		  List<«baseObj.name»> list = (List<«baseObj.name»>) session.createCriteria(«baseObj.name».class).list();
		  // Add Restriction
		  transaction.commit();  
		  session.close();
		  return null;
'''		
		jc.addOperation(opFindOne)
		// Save OP
		var opSave = new JavaOperation("save",baseObj.name)
		var opSP = new JavaAttribute("persisted",baseObj.name)
		opSave.addParameter(opSP)
		opSave.addAnnotations("Override")
		opSave.addAnnotations("Transactional")
		opSave.syntax ='''
		  session = sessionFactory.openSession();  
		  transaction = session.beginTransaction();  
		  int i =  (int) session.save(persisted);
		  transaction.commit();  
		  session.close();
		  persisted.setId(i);
		  return persisted;
'''		
		jc.addOperation(opSave)
		
		return jc.syntax
	}
}

class ServiceGenerator extends BaseDL {
	private DAOGenerator dao
	private BusinessObject srvBase
	private JavaClass jb
	new(BusinessObject e, String baseProjectDir, String basePackage, DAOGenerator dao) {
		super(e, baseProjectDir, basePackage)
		this.dao = dao
		setUp
	}
	private def setUp(){
		srvBase = BobjsFactory.eINSTANCE.createBusinessObject
		jb = new JavaClass(srvBase,"Impl");
		
		
		// Do Operations
		// Delete OP
		var opDel = new JavaOperation("delEntity","void")
		var opP = new JavaAttribute("o",baseObj.name)
		opDel.addParameter(opP)
		opDel.addAnnotations("Override")
		opDel.addAnnotations("Transactional")
		opDel.syntax ='''
		   dataDao.delete(o);
'''		
		jb.addOperation(opDel)
		
		
		// Save OP
		var saveOp = new JavaOperation("saveEntity",baseObj.name)
		var saveP = new JavaAttribute("o",baseObj.name)
		saveOp.addParameter(saveP)
		saveOp.addAnnotations("Override")
		saveOp.addAnnotations("Transactional")
		saveOp.syntax ='''
		   return dataDao.save(o);
'''		
		jb.addOperation(saveOp)
		
		// findAll OP
		var opFindAll = new JavaOperation("getEntities","List<" + baseObj.name + ">")
		opFindAll.addAnnotations("Override")
		opFindAll.addAnnotations("Transactional")
		opFindAll.syntax ='''
		 	return dataDao.findAll();
'''		
		jb.addOperation(opFindAll)
		
		
		// findAll OP
		var opFindOne = new JavaOperation("getEntity","Optional<" + baseObj.name + ">")
		var opFindOneP = new JavaAttribute("i","Long")
		opFindOne.addParameter(opFindOneP)
		opFindOne.addAnnotations("Override")
		opFindOne.addAnnotations("Transactional")
		opFindOne.syntax ='''
		 	return dataDao.findOne(i);
'''		
		jb.addOperation(opFindOne)
		
	}
	protected override getInterfaceName() {
		return baseObj.name + "Service"
	}

	protected override getPackage() {
		return this.basePackage + ".service"
	}

	protected override getImplName() {
		return baseObj.name + "ServiceImpl"
	}

	protected override getImplPackage() {
		return this.basePackage + ".service"
	}
	public override def getImplFQN(){
		val imp = (baseObj.eContainer as OrgUnit).package + ".service." + implName
		return imp
	}
	public def getInterfaceSyntax() {
		var e = BobjsFactory.eINSTANCE.createBusinessObject
		e.name = interfaceName
		jc = new JavaClass(e,"Interface");
		jc.addImports(baseObj)
		jc.addImports("java.util.List")
		jc.addImports("java.util.Optional")
		jc.package = implPackage
		jc.baseJC = this.jb
		return jc.getSyntax
	}

	public def getImplSyntax() {
		var e = BobjsFactory.eINSTANCE.createBusinessObject
		e.name = implName
		jc = new JavaClass(e,"Impl");
		var att = new JavaAttribute("dataDao",dao.interfaceName);
		att.addAnnotations("Autowired")
		jc.addAttribute(att)
		jc.package = implPackage
		jc.addImports(baseObj)
		jc.addImportDAO(baseObj)
		jc.addImportService(baseObj)
		jc.addImports("java.util.List")
		jc.addImports("java.util.Optional")
		jc.addImports("org.springframework.beans.factory.annotation.Autowired")
		jc.addImports("org.springframework.stereotype.Service")
		jc.addImports("org.springframework.transaction.annotation.Transactional")
			
		jc.addImplements(getInterfaceName)
		jc.baseJC = this.jb
		return jc.getSyntax
	}
}

class DataLayerGenerator {

	def doGenerate(OrgUnit model, IFileSystemAccess fsa, String baseProjectDir, String pkg) {
		var beanInput = ""
		var annotatedClasses = ""
		for (e : model.businessobjects) {
			val daoGen = new DAOGenerator(e, baseProjectDir, pkg)
			fsa.generateFile(daoGen.interfaceFileName, daoGen.interfaceSyntax)
			fsa.generateFile(daoGen.implFileName, daoGen.implSyntax)
			beanInput += updateBeanInfo(daoGen.interfaceName,daoGen.implFQN)

			val svrGen = new ServiceGenerator(e, baseProjectDir, pkg, daoGen)
			fsa.generateFile(svrGen.interfaceFileName, svrGen.interfaceSyntax)
			fsa.generateFile(svrGen.implFileName, svrGen.implSyntax)
			beanInput += updateBeanInfo(svrGen.interfaceName,svrGen.implFQN)
			annotatedClasses += e.annotatedClass
		}
		// Update Configuration
		var cfg = new ConfigManager(baseProjectDir)
		cfg.processHibernateXML(fsa,beanInput,annotatedClasses)
	}
	def annotatedClass(BusinessObject e){
		var data = "<value>" + e.FQN+ "</value>\n"
		return data
	}
	def updateBeanInfo(String id,String name){
		val bean = '''
		<bean id="«id»" class="«name»"></bean>
		'''
		return bean
	}
	
	private def compile(Attribute e) {
		var nme = e.name
		// Some cleanup to main java naming conventions
		nme = nme.replace("-", "")
		switch e.type {
			case STRING: '''
				String «nme»;
			'''
			case INTEGER: '''
				int «nme»;
			'''
			case BOOLEAN: '''
				boolean «nme»;
			'''
			case DATE: '''
				String «nme»;
			'''
			case DOUBLE: '''
				double «nme»;
			'''
			case DATA_MAP: '''
				Map<String,String> «nme»;
			'''
			default: {
			}
		}

	}

}
