package com.dsleng.etool.dsl.egov.generator

import com.dsleng.etool.models.egov.Page
import static extension com.dsleng.etool.dsl.egov.generator.BusinessManagerExt.*
import static extension com.dsleng.etool.dsl.egov.generator.ControlManagerExt.*


class WebManagerExt {
	def static getContents(Page e,ControlManagerUtils uCtrl){
		var contents = ""
		if ( e.BOMaps.size > 0){
			val bmap = e.BOMaps.get(0)
			// TODO: Fix so that the type is used to construct the container for the attributes
			for(a: bmap.businessObject.Prepare.attributes){
				var processed = false
				for(ba : bmap.attributes){
					if ( ba.attribute == a){
						// Use Control Type
						contents += ba.controltype.getSyntax(a)
						processed = true
					}
				}
				if (!processed){
					contents += uCtrl.genSyntax(a)
				}
			}
		}
		return contents
	}
	
}