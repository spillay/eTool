package com.dsleng.etool.primefaces.semantics

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.naming.IQualifiedNameProvider

import com.google.inject.Inject
import com.dsleng.etool.models.egov.Page
import com.dsleng.etool.models.egov.Dept
import com.dsleng.etool.models.egov.EService
import com.dsleng.etool.models.egov.BusinessObject
import com.dsleng.etool.models.egov.Attribute
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import com.dsleng.etool.models.egov.EgovPackage
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.util.RuntimeIOException
import java.io.InputStream
import java.beans.Introspector

class EgovGenerator implements IGenerator {

	//@Inject extension IQualifiedNameProvider
	val fileSep = "/"
	var pagelist = newArrayList
	
	new(){
		// Using this to make sure that the ecore file is registered need to fix
		EgovPackage.eINSTANCE.eClass();
	}
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (e : resource.allContents.toIterable.filter(Page)) {
			val pg = e.genFileName
			fsa.generateFile(pg, e.compile)
			pagelist.add(pg)
		}
		fsa.generateFile("index.xhtml",welcomePage)
	}
	private def lowerFirstLetter(String s) {
    	return s.substring(0,1).toLowerCase + s.substring(1);
	}
	def processDSL(String fileName,IFileSystemAccess fsa){
    	val resourceSet = new ResourceSetImpl
    	val resource = resourceSet.getResource(URI.createURI(fileName), true)
		doGenerate(resource,fsa)
	}
	private def genFileName(Page e){
		/*
		var fileName = '''«IF e.eContainer instanceof EService»
			«IF e.eContainer.eContainer instanceof Dept»
				«(e.eContainer.eContainer as Dept).name»«fileSep»«(e.eContainer as EService).name»«fileSep»«e.name»
			«ENDIF»
		«ENDIF»
		'''
		*/
		//fileName = fileName + fileSep + e.name + ".xhtml"
		var fileName = (e.eContainer.eContainer as Dept).name + fileSep + (e.eContainer as EService).name + fileSep + e.name
		//fileName = e.name
		fileName = fileName.replace(" ","_")
		fileName = fileName + ".xhtml"
	}
	private def compile(Page e) ''' 
«PageHead»
		«IF e.eContainer instanceof EService»
			«IF e.eContainer.eContainer instanceof Dept»
«title((e.eContainer.eContainer as Dept).name,(e.eContainer as EService).name)»
			«ENDIF»
		«ENDIF»
<h:body>
       <h:form>
        	«e.businessobject.compile»
        	«dialog»
        </h:form>
</h:body>		
«PageTail»
  	'''
  	private def dialog()'''
<p:dialog header="Greeting" widgetVar="dlg" modal="true" resizable="false">
    <h:panelGrid id="display" columns="1" cellpadding="4">
         <h:outputText value="TestDialog" />
    </h:panelGrid>
</p:dialog>

'''
  	private def compile(BusinessObject e)'''
 <p:panel header="«e.name»">
         <h:panelGrid columns="2" cellpadding="4">
              «FOR att: e.attributes»
                	«att.compile»
               «ENDFOR»
  		 <p:commandButton value="Submit" update="display" oncomplete="PF('dlg').show()" />
         </h:panelGrid>
 </p:panel>
  		
  	'''
  	private def getPages(){
  		var links = ""
  		for(p: pagelist){
  			links += "<a href=\"" +p+ "\">" + p + "</a><br/>\n"
  		}
  		return links
  	}
  	private def compile(Attribute e){
  		var nme = e.name
		// Some cleanup to main java naming conventions
		nme = Introspector.decapitalize(nme)
		var boName = (e.eContainer as BusinessObject).name
		boName = Introspector.decapitalize(boName) + "Bean"
  		switch e.type {
			case STRING:
				'''
<h:outputText value="«e.label»: " />
<p:inputText value="#{«boName».«nme»}" />
				'''
			case INTEGER:
				'''
<h:outputText value="«e.label»: " />
<p:inputText value="#{«boName».«nme»}" />
				'''
			default: {
			}
  			
  		}
  	}
  		
  	// Utility Functions for Page Creation
  	
  	private def title(String dept,String eservice)'''
<h:head>
     <title>«dept» - «eservice»</title>
</h:head>
  		
  	'''
  	private def welcomePage()'''
 «PageHead»
 «pages»
 «PageTail»
 '''
  	private def PageHead()'''
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:h="http://java.sun.com/jsf/html"
    	xmlns:f="http://java.sun.com/jsf/core" xmlns:ui="http://java.sun.com/jsf/facelets"
    	xmlns:p="http://primefaces.org/ui">
'''

	private def PageTail()'''
</html>
'''
}