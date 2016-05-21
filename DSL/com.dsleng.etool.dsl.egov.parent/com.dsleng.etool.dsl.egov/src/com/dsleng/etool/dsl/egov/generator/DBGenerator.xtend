package com.dsleng.etool.dsl.egov.generator


import org.eclipse.xtext.generator.IFileSystemAccess
import com.dsleng.etool.model.bobjs.BusinessObject
import com.dsleng.etool.model.bobjs.OrgUnit
import static extension com.dsleng.etool.dsl.egov.generator.BusinessManagerExt.*
import com.dsleng.etool.model.bobjs.BobjsPackage
import java.time.LocalDateTime
import java.util.ArrayList

class DBGenerator {
	private String fileSep = "/"
	private String pkgSep = "."
	
	var baseProjectDir = ""
	var basePackage = ""
	val resDir = "/src/main/resources/"
	
	new(){
		// Using this to make sure that the ecore file is registered need to fix
		BobjsPackage.eINSTANCE.eClass();
	}
	
	def doGenerate(OrgUnit model, IFileSystemAccess fsa,String baseProjectDir,String pkg) {
		basePackage = pkg
		this.baseProjectDir = baseProjectDir
		var hbms = new ArrayList<String>()
		for(p: model.packages){
			for (e : p.businessobjects) {
				var hbm = e.genFileName
				fsa.generateFile(hbm, e.compile)
				hbms.add(e.genCFGHDMFileName)
			}
			if ( p.businessobjects.size > 0 ){
				fsa.generateFile(genCFGFileName(p.businessobjects.get(0)),genCFG(hbms))
			}
		}
		
		
		
	}
	private def genCFGFileName(BusinessObject e){
		return baseProjectDir + resDir + "hibernate.cfg.xml"
	}
	private def genCFGHDMFileName(BusinessObject e){
		var fileName = basePackage.replace(".",fileSep);
		if (e.eContainer instanceof OrgUnit)
		{
			fileName +=  fileSep + e.name + ".hbm.xml"
		}
		//fileName += fileSep + e.name + "Bean.java"
		fileName =  fileName.replace(" ","_")
	}
	private def genFileName(BusinessObject e){
		var fileName = basePackage.replace(".",fileSep);
		if (e.eContainer instanceof OrgUnit)
		{
			fileName +=  fileSep + e.name + ".hbm.xml"
		}
		//fileName += fileSep + e.name + "Bean.java"
		fileName = baseProjectDir + resDir + fileName.replace(" ","_")
	}
	private def getTableAttributes(BusinessObject e){
		var att = ""
		for(a: e.attributes){
			att += a.tableInfo
		}
		return att
	}
	private def getTableReferences(BusinessObject e){
		var ref = ""
		for(r: e.references){
			ref += r.tableReference
		}
		val org = e.eContainer as OrgUnit
		for(p: org.packages){
			for(b: p.businessobjects){
				for(r: b.references){
					if (r.businessobject == e){
						ref += r.revTableReference
					}
				}
			}
		}
		return ref
	}
	private def compile(BusinessObject e){
		return Contents(e)
	}
	private def Contents(BusinessObject e)'''
<?xml version="1.0"?>
<!DOCTYPE hibernate-mapping PUBLIC "-//Hibernate/Hibernate Mapping DTD 3.0//EN"
"http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd">
<!-- Generated « LocalDateTime.now» by  eTool 1.0.0 Author Suresh Pillay-->
<hibernate-mapping>
    <class name="«e.FQN»" table="«e.tableName»" schema="public">
    	<id name="id" type="java.lang.Integer">
            <column name="ID" />
            <generator class="identity"></generator>
        </id>
    «getTableAttributes(e)»
    «getTableReferences(e)»
    </class>
</hibernate-mapping>
	'''
	private def getHBMResources(ArrayList<String> hbms){
		var res = ""
		for(h:hbms){
			res +='''<mapping resource="«h»" />''' + "\n"
		}
		return res
	}
	private def genCFG(ArrayList<String> hbms)'''
<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
"http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
<!-- Generated « LocalDateTime.now» by  eTool 1.0.0 Author Suresh Pillay DBGenerator Source-->
<hibernate-configuration>
    <session-factory>
        <property name="hibernate.connection.driver_class">org.postgresql.Driver</property>
        <property name="hibernate.connection.url">jdbc:postgresql://localhost/bsol</property>
        <property name="hibernate.connection.username">bsol</property>
        <property name="hibernate.connection.password">12test21</property>
 		<property name="hibernate.dialect">org.hibernate.dialect.PostgreSQLDialect</property>
 		<property name="hibernate.hbm2ddl.auto">create-drop</property>
        <property name="hibernate.show_sql">true</property>
        «getHBMResources(hbms)»
    </session-factory>
</hibernate-configuration>

'''
	
}