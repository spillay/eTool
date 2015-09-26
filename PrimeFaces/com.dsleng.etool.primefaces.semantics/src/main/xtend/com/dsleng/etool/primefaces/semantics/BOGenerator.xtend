package com.dsleng.etool.primefaces.semantics

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.dsleng.etool.models.egov.BusinessObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import com.dsleng.etool.models.egov.Dept
import com.dsleng.etool.models.egov.Attribute
import java.beans.Introspector

class BOGenerator implements IGenerator {
	
	private String basePackage=""
	private String fileSep = "/"
	private String pkgSep = "."
	
	new(String packageName){
		basePackage = packageName
	}
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (e : resource.allContents.toIterable.filter(BusinessObject)) {
			fsa.generateFile(e.genFileName, e.compile)
		}
	}
	def processDSL(String fileName,IFileSystemAccess fsa){
    	val resourceSet = new ResourceSetImpl
    	val resource = resourceSet.getResource(URI.createURI(fileName), true)
		doGenerate(resource,fsa)
	}
	private def capitalizeFirstLetter(String s) {
    	return s.substring(0,1).toUpperCase() + s.substring(1);
	}
	private def genFileName(BusinessObject e){
		var fileName = basePackage.replace(".",fileSep);
		if (e.eContainer instanceof Dept)
		{
			fileName += fileSep + (e.eContainer as Dept).name + fileSep + e.name + ".java"
		}
		fileName = fileName.replace(" ","_")
	}
	private def getPackage(BusinessObject e){
		var pkg = basePackage
		if (e.eContainer instanceof Dept)
		{
			pkg += pkgSep + (e.eContainer as Dept).name
		}
		pkg = pkg.replace(" ","_")
	}
	
	private def compile(BusinessObject e)'''
«PageHead(getPackage(e))»
«importStmt("javax.faces.bean.ManagedBean")»
«classHead(e)»
«FOR att: e.attributes»
«att.compile»
«ENDFOR»
«FOR att: e.attributes»
«att.getandset»
«ENDFOR»
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
				String get«nme»(){
					return «vnme»;
				}
				void set«nme»(String s){
					«vnme»=s;
				}
				'''
			case INTEGER:
				'''
				int get«nme»(){
					return «vnme»;
				}
				void set«nme»(int i){
					«vnme»=i;
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
			default: {
			}
  			
  		}	
  		
  	}	
	
	private def classHead(BusinessObject e)'''
@ManagedBean
public class «e.name» {
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
	