package com.dsleng.etool.dsl.egov.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI

import java.beans.Introspector
import com.dsleng.etool.models.bobjs.BusinessObject
import com.dsleng.etool.models.bobjs.OrgUnit
import com.dsleng.etool.models.bobjs.Attribute

class BOGenerator  {
	
	
	private String fileSep = "/"
	private String pkgSep = "."
	
	var baseProjectDir = ""
	var basePackage = ""
	val srcDir = "/src/main/java/"
	
	
	def doGenerate(Resource resource, IFileSystemAccess fsa,BusinessObject e,String baseProjectDir,String pkg) {
		basePackage = pkg
		this.baseProjectDir = baseProjectDir
		
		fsa.generateFile(e.genFileName, e.compile)
	}
	
	private def capitalizeFirstLetter(String s) {
    	return s.substring(0,1).toUpperCase() + s.substring(1);
	}
	private def genFileName(BusinessObject e){
		var fileName = basePackage.replace(".",fileSep);
		if (e.eContainer instanceof OrgUnit)
		{
			fileName += fileSep + (e.eContainer as OrgUnit).name + fileSep + e.name + "Bean.java"
		}
		//fileName += fileSep + e.name + "Bean.java"
		fileName = baseProjectDir + srcDir + fileName.replace(" ","_")
	}
	private def getPackage(BusinessObject e){
		var pkg = basePackage 
		if (e.eContainer instanceof OrgUnit)
		{
			pkg += pkgSep + (e.eContainer as OrgUnit).name
		}
		pkg = pkg.replace(" ","_")
	}
	private def doAttributesDecl(BusinessObject e){
		var syntax = ""
		for(attr: e.attributes){
			syntax += attr.compile
		}
		return syntax
	}
	private def doAttributesGS(BusinessObject e){
		var syntax = ""
		for(attr: e.attributes){
			syntax += attr.getandset
		}
		return syntax
	}
	private def compile(BusinessObject e)'''
«PageHead(getPackage(e))»
«importStmt("javax.faces.bean.ManagedBean")»
«importStmt("javax.faces.bean.RequestScoped")»
«importStmt("java.io.Serializable")»
«classHead(e)»
«e.doAttributesDecl»
«e.doAttributesGS»
«classTail»
	'''

	private def getandset(Attribute e){
		var nme = e.name
		// Some cleanup to main java naming conventions
		nme = nme.replace("-","")
		nme = capitalizeFirstLetter(nme)
		
		var vnme = e.name
		vnme = vnme.replace("-","")
  		switch e.type {
			case STRING:
				'''
				public String get«nme»(){
					return «vnme»;
				}
				public void set«nme»(String «vnme»){
					this.«vnme»=«vnme»;
				}
				'''
			case INTEGER:
				'''
				public int get«nme»(){
					return «vnme»;
				}
				public void set«nme»(int «vnme»){
					this.«vnme»=«vnme»;
				}
				'''
			case BOOLEAN:
				'''
				public boolean get«nme»(){
					return «vnme»;
				}
				public void set«nme»(boolean «vnme»){
					this.«vnme»=«vnme»;
				}
				'''
			case DATE:
				'''
				public String get«nme»(){
					return «vnme»;
				}
				public void set«nme»(String «vnme»){
					this.«vnme»=«vnme»;
				}
				'''	
			case DOUBLE:
				'''
				public double get«nme»(){
					return «vnme»;
				}
				public void set«nme»(double «vnme»){
					this.«vnme»=«vnme»;
				}
				'''	
			default: {
			}
  			
  		}	
  		
  	}	
	private def compile(Attribute e){
		var nme = e.name
		// Some cleanup to main java naming conventions
		nme = nme.replace("-","")
  		switch e.type {
			case STRING:
				'''
				String «nme»;
				'''
			case INTEGER:
				'''
				int «nme»;
				'''
			case BOOLEAN:
				'''
				boolean «nme»;
				'''
			case DATE:
				'''
				String «nme»;
				'''
			case DOUBLE:
				'''
				double «nme»;
				'''
			default: {
			}
  			
  		}	
  		
  	}	
	
	private def classHead(BusinessObject e)'''
@ManagedBean
@RequestScoped
public class «e.name»Bean implements Serializable {

        private static final long serialVersionUID = 1L;

'''	
	private def classTail()'''
}
	'''
	
	
	private def importStmt(String imp)'''
import «imp»;
	'''
	private def PageHead(String pkg)'''
package «pkg»;

/**
 * @author Suresh Pillay
 *
 */
	'''
}
	