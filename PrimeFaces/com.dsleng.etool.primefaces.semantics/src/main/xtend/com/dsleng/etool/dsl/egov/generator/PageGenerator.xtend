package com.dsleng.etool.dsl.egov.generator

import com.dsleng.etool.models.Controls.ControlManager
import com.dsleng.etool.models.egov.EgovPackage
import com.dsleng.etool.models.egov.Page
import java.util.ArrayList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension com.dsleng.etool.dsl.egov.generator.ControlManagerExt.*
import com.dsleng.etool.perspective.SPConsoleManager
import org.apache.log4j.Logger

class PageGenerator  {

	//@Inject extension IQualifiedNameProvider
	ArrayList<String> pagelist = newArrayList
	var baseProjectDir = ""
	val webDir = "/src/main/webapp/"
	var ControlManager cm
	
	var ControlManagerUtils uCtrl
	private static final Logger LOGGER = Logger.getLogger(PageGenerator);
	new(){
		// Using this to make sure that the ecore file is registered need to fix
		EgovPackage.eINSTANCE.eClass();
	}
	
	def doGenerate(Resource resource, IFileSystemAccess fsa,String baseProjectDir,String pkg,ControlManager cm) {
		LOGGER.info("Starting Page Generation")
		this.cm = cm
		println(cm.syntax)
		uCtrl = new ControlManagerUtils(cm)
		
		
		this.baseProjectDir = baseProjectDir
		val bo = new BOGenerator()
		val wUtil = new WebManagerUtils(baseProjectDir,webDir,uCtrl)
		for (p : resource.allContents.toIterable.filter(Page)) {
			val pg = wUtil.createPage(p)
			fsa.generateFile(pg.genFileName, pg.genContents)
			pagelist.add(pg.genFileName)
			
			// Create Business Objects
			LOGGER.info("Starting BO Generation")
			for(bm: p.BOMaps){
				bo.doGenerate(resource,fsa,bm.businessObject,baseProjectDir,pkg)
			}
			LOGGER.info("Completed BO Generation")
		}
		LOGGER.info("Starting Welcome Page Generation")
		val index = new WelComePage(pagelist,baseProjectDir,webDir)
		fsa.generateFile(index.genFileName,index.genContents)
		LOGGER.info("Generation Process Completed")
	}	
}