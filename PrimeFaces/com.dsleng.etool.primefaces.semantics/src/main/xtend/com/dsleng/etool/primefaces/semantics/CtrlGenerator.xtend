package com.dsleng.etool.primefaces.semantics

import com.dsleng.etool.models.controls.ControlsFactory
import static extension com.dsleng.etool.models.controls.semantics.SimpleControlExt.*
import com.dsleng.etool.models.controls.ControlsPackage
import org.eclipse.emf.ecore.resource.Resource
import com.dsleng.etool.models.controls.SimpleControl
import com.dsleng.etool.models.controls.Composite



class CtrlGenerator {
	
	new() {
		ControlsPackage.eINSTANCE.eClass
	}
	
	def Execute(){
		var p = ControlsFactory.eINSTANCE.createSimpleControl()
		//p.Execute()
	}
	def doGenerate(Resource resource,String controlName){
		for (e : resource.allContents.toIterable.filter(SimpleControl)) {
			if ( e.name.compareTo(controlName) ==0){
				return e.syntax
				//return (e as SimpleControl).Execute
			}
		}
	}
}