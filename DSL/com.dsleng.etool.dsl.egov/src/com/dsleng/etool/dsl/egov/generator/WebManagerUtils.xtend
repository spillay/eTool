package com.dsleng.etool.dsl.egov.generator

import static extension com.dsleng.etool.dsl.egov.generator.WebManagerExt.*
import com.dsleng.etool.models.egov.Page

class WebManagerUtils {
	var baseProjectDir = ""
	var webDir = ""
	var ControlManagerUtils uCtrl
	
	new(String baseProjectDir,String webDir,ControlManagerUtils uCtrl){
		this.baseProjectDir = baseProjectDir
		this.webDir = webDir
		this.uCtrl = uCtrl
	}
	def createPage(Page p){
		// Based on the Type of Page we Have create the right structure
		return createFormPage(p)
	}
	private def createFormPage(Page p){
		val pg = new PageManager(p,baseProjectDir,webDir)
		val innerContents ='''
<h:body>
       <h:form>
        	«createBO(p)»
        	«dialog»
        </h:form>
</h:body>		
		''' 
		
		pg.contents = innerContents
		return pg
	} 
		private def createBO(Page p)'''
 <p:panel header="Content">
         <h:panelGrid columns="2" cellpadding="4">
              «p.getContents(uCtrl)»
  		 <p:commandButton value="Submit" update="display" oncomplete="PF('dlg').show()" />
         </h:panelGrid>
 </p:panel>
  		
  	'''
		private def dialog()'''
<p:dialog header="Greeting" widgetVar="dlg" modal="true" resizable="false">
    <h:panelGrid id="display" columns="1" cellpadding="4">
         <h:outputText value="TestDialog" />
    </h:panelGrid>
</p:dialog>

'''
}