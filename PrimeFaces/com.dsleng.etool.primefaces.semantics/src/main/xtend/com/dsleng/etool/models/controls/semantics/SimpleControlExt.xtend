package com.dsleng.etool.models.controls.semantics

import com.dsleng.etool.models.controls.SimpleControl
import org.eclipse.xtext.EcoreUtil2
import com.dsleng.etool.models.controls.Composite

//import static extension com.dsleng.etool.models.controls.*;

class SimpleControlExt {
	def static dispatch Execute(SimpleControl e){
		//EcoreUtil2.resolveAll(e)
		var options = ""
		for(o: e.optionInstance){
			options += " " + o.option.name + "=" + o.value.get(0).name
		}
		val startTag = "<" + e.uses.prefix + ":" + e.uses.name + options + ">"
		val endTag = "</" + e.uses.prefix + ":" + e.uses.name + ">"
		return startTag + endTag
	}
	def static dispatch Execute(Composite e){
		var baseControl = e.usesControl
		var syntax = ""
		var options = ""
		for(o: baseControl.optionInstance){
			options += " " + o.option.name + "=" + o.value.get(0).name
		}
		val startTag = "<" + baseControl.uses.prefix + ":" + baseControl.uses.name + options + ">"
		val endTag = "</" + baseControl.uses.prefix + ":" + baseControl.uses.name + ">"
		var siblings = "siblings"
		for(s: e.sibling){
			if ( s instanceof Composite){
				//siblings += (s as Composite).Process
			}
			
		}
		syntax = startTag + "composite" + endTag + siblings
	}
	def static getSyntax(SimpleControl it) {
  		switch it {
    		Composite: it.name + it.Execute
    		SimpleControl: it.name + it.Execute
    	default:
      		throw new IllegalArgumentException("don't how to handle control type " + it.^class.simpleName)
  	}
}
}