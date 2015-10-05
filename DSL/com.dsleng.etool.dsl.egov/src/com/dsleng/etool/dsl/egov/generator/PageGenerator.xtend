package com.dsleng.etool.dsl.egov.generator

import com.dsleng.etool.models.Controls.ControlManager
import com.dsleng.etool.models.egov.EgovPackage
import com.dsleng.etool.models.egov.Page
import java.util.ArrayList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension com.dsleng.etool.dsl.egov.generator.ControlManagerExt.*


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
		//SPConsoleManager.instance.Info("Starting Page Generation")
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
			for(bm: p.BOMaps){
				bo.doGenerate(resource,fsa,bm.businessObject,baseProjectDir,pkg)
			}
		}
		val index = new WelComePage(pagelist,baseProjectDir,webDir)
		fsa.generateFile(index.genFileName,index.genContents)
	}	
}