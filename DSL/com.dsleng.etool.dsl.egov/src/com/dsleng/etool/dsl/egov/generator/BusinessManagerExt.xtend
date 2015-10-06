package com.dsleng.etool.dsl.egov.generator

import com.dsleng.etool.models.bobjs.BusinessObject
import java.beans.Introspector
import com.dsleng.etool.models.bobjs.Attribute

class BusinessManagerExt {
	def static getUsingBeanName(BusinessObject e){
		return Introspector.decapitalize(e.name) + "Bean"
	}
	def static getDeclBeanName(BusinessObject e){
		return e.name + "Bean"
	}
	def static Prepare(BusinessObject e){
		return e
	}
	def static getUsingName(Attribute e){
		return "#{" + (e.eContainer as BusinessObject).usingBeanName + "." + Introspector.decapitalize(e.name) + "}"
	}
}