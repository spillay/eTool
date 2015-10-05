package com.dsleng.etool.dsl.egov.generator

import com.dsleng.etool.models.Controls.ControlManager
import com.dsleng.etool.models.bobjs.Attribute

import static extension com.dsleng.etool.dsl.egov.generator.ControlManagerExt.*

class ControlManagerUtils {
	ControlManager cm
	new(ControlManager cm){
		this.cm = cm
	}
	public def genSyntax(Attribute e){
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