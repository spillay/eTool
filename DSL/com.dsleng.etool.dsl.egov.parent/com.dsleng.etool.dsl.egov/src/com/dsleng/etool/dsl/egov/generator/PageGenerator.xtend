package com.dsleng.etool.dsl.egov.generator

import com.dsleng.etool.model.controls.ControlManager
import com.dsleng.etool.model.egov.EgovPackage
import com.dsleng.etool.model.egov.Page
import java.util.ArrayList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension com.dsleng.etool.dsl.egov.generator.ControlManagerExt.*
import static extension com.dsleng.etool.dsl.egov.generator.BusinessManagerExt.*
import com.dsleng.etool.dsl.egov.Lg

class PageGenerator  {

	//@Inject extension IQualifiedNameProvider
	ArrayList<String> pagelist = newArrayList
	var baseProjectDir = ""
	val webDir = "/src/main/webapp/"
	var ControlManager cm
	
	var ControlManagerUtils uCtrl
	new(){
		// Using this to make sure that the ecore file is registered need to fix
		EgovPackage.eINSTANCE.eClass();
	}
	
	def doGenerate(Resource resource, IFileSystemAccess fsa,String baseProjectDir,String pkg,ControlManager cm) {
		Lg.info("Starting Page Generation")
		this.cm = cm
		println(cm.syntax)
		uCtrl = new ControlManagerUtils(cm)
		
		
		this.baseProjectDir = baseProjectDir
		
		
		
		val bo = new BeanGenerator()
		val wUtil = new WebManagerUtils(baseProjectDir,webDir,uCtrl)
		for (p : resource.allContents.toIterable.filter(Page)) {
			val pg = wUtil.createPage(p)
			val pg2 = wUtil.createCompositionPage(p)
			fsa.generateFile(pg.genFileName, pg.genContents)
			fsa.generateFile(pg2.genFileName, pg2.genContents)
			pagelist.add(pg.genFileName)
			pagelist.add(pg2.genFileName)
			
			// Create Business Objects
			Lg.info("Starting BO Generation")
			for(bm: p.BOMaps){
				bo.doGenerate(resource,fsa,bm.businessObject,baseProjectDir,pkg,p)
			}
			Lg.info("Completed BO Generation")
			Lg.info("Cleaning BO")
			for(bm: p.BOMaps){
				bm.businessObject.cleanUp
			}
		}
		Lg.info("Starting Welcome Page Generation")
		val index = new WelComePage(pagelist,baseProjectDir,webDir)
		fsa.generateFile(index.genFileName,index.genContents)
		Lg.info("Generation Process Completed")
	}	
}