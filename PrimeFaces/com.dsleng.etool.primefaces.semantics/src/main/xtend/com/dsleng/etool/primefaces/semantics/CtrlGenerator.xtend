package com.dsleng.etool.primefaces.semantics


import static extension com.dsleng.etool.models.controls.semantics.SimpleControlExt.*

import org.eclipse.emf.ecore.resource.Resource

import com.dsleng.etool.models.Controls.ControlsPackage
import com.dsleng.etool.models.Controls.ControlsFactory
import com.dsleng.etool.models.Controls.SimpleControl

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
	
	def  getSyntax(SimpleControl control){
		return "hello"
	}
	
}