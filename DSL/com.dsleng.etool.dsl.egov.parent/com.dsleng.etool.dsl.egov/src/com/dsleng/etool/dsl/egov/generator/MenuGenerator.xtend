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
import com.dsleng.etool.model.egov.Menu


class MenuGenerator {
	def doGenerate(Resource resource, IFileSystemAccess fsa,String baseProjectDir,String pkg,ControlManager cm) {
		Lg.info("Starting Menu Generation")
		for (m : resource.allContents.toIterable.filter(Menu)) {
			val mm = m as com.dsleng.etool.model.egov.Menu
			// Top Level Menu
			if (mm.parentMenu == null){
				
			}
		}
	}
}