package com.dsleng.etool.dsl.egov.generator

import com.dsleng.etool.model.bobjs.Attribute
import com.dsleng.etool.model.bobjs.BusinessObject
import com.dsleng.etool.model.egov.EService
import com.dsleng.etool.model.egov.EgovPackage
import com.dsleng.etool.model.egov.Page
import java.beans.Introspector
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.generator.IFileSystemAccess
import com.dsleng.etool.dsl.egov.Lg
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.dsleng.etool.model.egov.Admin

class EGovGenerator  {

	//@Inject extension IQualifiedNameProvider
	val fileSep = "/"
	var pagelist = newArrayList
	var baseProjectDir = ""
	val webDir = "/src/main/webapp/"
	
	new(){
		// Using this to make sure that the ecore file is registered need to fix
		EgovPackage.eINSTANCE.eClass();
	}
	def doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		Lg.info("Starting Page Generation")
		this.baseProjectDir = baseProjectDir
		val bo = new BeanGenerator()
		// TODO: Need to work on admin pages
		for (e : input.allContents.toIterable.filter(Page)) {
			if (e.eContainer instanceof EService){
				val pg = e.genFileName
				val ch = e.compile
				fsa.generateFile(pg, e.compile)
				pagelist.add(pg)
				
				for(bm: e.BOMaps){
					var currPkg = "##unknownPackage##"
					if (bm.businessObject.eContainer instanceof com.dsleng.etool.model.bobjs.Package){
						val pkg = bm.businessObject.eContainer as com.dsleng.etool.model.bobjs.Package
						currPkg = pkg.name
					}
					bo.doGenerate(input,fsa,bm.businessObject,baseProjectDir,currPkg,e)
				}
			}
			if (e.eContainer instanceof Admin){
				// Need to process admin pages
			}
		}
		fsa.generateFile(baseProjectDir + webDir + "index.xhtml",welcomePage)
	}
	private def lowerFirstLetter(String s) {
    	return s.substring(0,1).toLowerCase + s.substring(1);
	}
	def processDSL(String fileName,IFileSystemAccess fsa){
    	val resourceSet = new ResourceSetImpl
    	val resource = resourceSet.getResource(URI.createURI(fileName), true)
		//doGenerate(resource,fsa)
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
		var fileName = ""
		if (e.eContainer instanceof EService){
			 fileName = (e.eContainer as EService).businessUnit.name + fileSep + (e.eContainer as EService).name + fileSep + e.name
		} else if (e.eContainer instanceof Admin) {
			var es = e.eContainer.eContainer as EService
			fileName = (es).businessUnit.name + fileSep + (es).name + fileSep + e.name
		}
		//fileName = e.name
		fileName = fileName.replace(" ","_")
		fileName = baseProjectDir + webDir + fileName + ".xhtml"
	}
	private def compile(Page e) ''' 
«PageHead»
		«IF e.eContainer instanceof EService»
«title((e.eContainer as EService).businessUnit.name,(e.eContainer as EService).name)»
		«ENDIF»
<h:body>
       <h:form>
        	«e.BOMaps.get(0).businessObject.compile»
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
  			val link = p.toString.replace(baseProjectDir + webDir,"")
  			links += "<a href=\"" +link+ "\">" + link + "</a><br/>\n"
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