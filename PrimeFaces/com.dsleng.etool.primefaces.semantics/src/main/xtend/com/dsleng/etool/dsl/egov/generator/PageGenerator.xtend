package com.dsleng.etool.dsl.egov.generator

import com.dsleng.etool.models.bobjs.Attribute
import com.dsleng.etool.models.bobjs.BusinessObject
import com.dsleng.etool.models.egov.EService
import com.dsleng.etool.models.egov.EgovPackage
import com.dsleng.etool.models.egov.Page
import java.beans.Introspector
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.generator.IFileSystemAccess
import com.dsleng.etool.models.Controls.ControlManager
import static extension com.dsleng.etool.dsl.egov.generator.ControlManagerExt.*
import java.util.ArrayList

class PageGenerator  {

	//@Inject extension IQualifiedNameProvider
	val fileSep = "/"
	ArrayList<String> pagelist = newArrayList
	var baseProjectDir = ""
	val webDir = "/src/main/webapp/"
	var ControlManager cm
	
	new(){
		// Using this to make sure that the ecore file is registered need to fix
		EgovPackage.eINSTANCE.eClass();
	}
	
	def doGenerate(Resource resource, IFileSystemAccess fsa,String baseProjectDir,String pkg,ControlManager cm) {
		//SPConsoleManager.instance.Info("Starting Page Generation")
		this.cm = cm
		println(cm.syntax)
		this.baseProjectDir = baseProjectDir
		val bo = new BOGenerator()
		for (e : resource.allContents.toIterable.filter(Page)) {
			val pg = new PageManager(e,baseProjectDir,webDir)
			fsa.generateFile(pg.genFileName, pg.genContents)
			pagelist.add(pg.genFileName)
			
			// Create Business Objects
			for(bm: e.BOMaps){
				bo.doGenerate(resource,fsa,bm.businessObject,baseProjectDir,pkg)
			}
		}
		val index = new WelComePage(pagelist,baseProjectDir,webDir)
		fsa.generateFile(index.genFileName,index.genContents)
	}
	
	
	private def compile(Page e) ''' 

		«IF e.eContainer instanceof EService»

		«ENDIF»
<h:body>
       <h:form>
        	«e.BOMaps.get(0).businessObject.compile»
        	«dialog»
        </h:form>
</h:body>		

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

  	private def compile(Attribute e){
  		switch e.type {
			case STRING:
				return cm.getStringType(e)
			case DATE:
				return cm.getDateType(e)
			case INTEGER:
				return cm.getIntegerType(e)
			case BOOLEAN:
				return cm.getBooleanType(e)
			case DOUBLE:
				return cm.getDoubleType(e)
			default: {
			}
  			
  		}
  	}
  		
}