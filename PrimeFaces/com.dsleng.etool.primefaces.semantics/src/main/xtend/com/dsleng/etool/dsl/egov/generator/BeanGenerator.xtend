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

class BeanGenerator  {
	
	
	private String fileSep = "/"
	private String pkgSep = "."
	private JavaClass jc
	
	var baseProjectDir = ""
	var basePackage = ""
	val srcDir = "/src/main/java/"
	private Page page
	
	
	def doGenerate(Resource resource, IFileSystemAccess fsa,BusinessObject e,String baseProjectDir,String pkg,Page p) {
		basePackage = pkg
		this.baseProjectDir = baseProjectDir
		this.page = p
		fsa.generateFile(p.genFileName, p.getSyntax)
	}
	def  getSyntaxPDV(Attribute a,EList<PreDefinedValue> v){
		var syntax ='''
«a.name» = new HashMap<String,String>();
		'''
		for(l: v){
			var input='''
«a.name».put("«l.value»","«l.value»");
			'''
			syntax += input
		}
		return syntax
	}
	private def doPredefinedData(BOMapper bmap) {
		Lg.debug("Processing doPredefinedData")
		for (ba : bmap.attributes) {		
			if (ba.controltype.name == "Selection" && ba.predefinedcontainers.size > 0) {
				Lg.debug("Found Predefined Data: for attribute" + ba.attribute.name)
				// Add an attribute to BO
				var initSyntax = ""
				for(pdc:ba.predefinedcontainers){
					var newAttr = BobjsFactory.eINSTANCE.createAttribute()
					newAttr.name = pdc.name
					newAttr.type = DataTypes.DATA_MAP
					newAttr.dataManagement = true
					//bmap.businessObject.attributes.add(newAttr)
					jc.addAttribute(newAttr)
					initSyntax = newAttr.getSyntaxPDV(pdc.predefinedvalues)
				}
				Lg.debug("No of Business Operations " + bmap.businessObject.operations.size) 
				for(ops: bmap.businessObject.operations){
					Lg.debug("Business Operations " + ops.name) 
				}
				// Add the Initializer
				var op = BobjsFactory.eINSTANCE.createOperation()
				op.name = bmap.businessObject.name + "_" + ba.attribute.name + "_" + "init"
				op.type = DataTypes.VOID
				op.syntax = initSyntax
				var an = BobjsFactory.eINSTANCE.createAnnotation()
				an.name = "PostConstruct"
				op.annotations.add(an)
				jc.addOperation(op)
			}
		}
	}
	private def getSyntax(Page p){
		var e = BobjsFactory.eINSTANCE.createBusinessObject
		e.name = p.name + "Bean"
		jc = new JavaClass(e,"Impl");
		jc.package = basePackage + ".beans"
		for(b:p.BOMaps){
			var pName = (b.businessObject.eContainer as OrgUnit).package
			jc.addAttribute(b.businessObject.name,pName)
			doPredefinedData(b)
		}
		
		jc.addImports("javax.faces.bean.ManagedBean")
		jc.addImports("javax.faces.bean.RequestScoped")
		jc.addImports("java.io.Serializable")
		jc.addImports("java.util.HashMap")
		jc.addImports("java.util.Map")
		jc.addImports("javax.annotation.PostConstruct")
		jc.addImports("javax.faces.application.FacesMessage")
		jc.addImports("javax.faces.bean.ViewScoped")
		jc.addImports("javax.faces.context.FacesContext")
		jc.addAnnotations("ManagedBean")
		jc.addAnnotations("ViewScoped")
		return jc.syntax
	}
	
	
	private def genFileName(Page p){
		var fileName = basePackage.replace(".",fileSep);
		fileName += fileSep + "beans" + fileSep + p.name  + "Bean.java"
		fileName = baseProjectDir + srcDir + fileName.replace(" ","_")
	}
	
	private def getBeanPackage(BusinessObject e){
		var pkg = basePackage 
		if (e.eContainer instanceof OrgUnit)
		{
			pkg += pkgSep + "beans"
		}
		pkg = pkg.replace(" ","_")
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
	