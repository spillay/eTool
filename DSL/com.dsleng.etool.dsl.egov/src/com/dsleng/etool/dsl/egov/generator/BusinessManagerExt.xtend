package com.dsleng.etool.dsl.egov.generator

import com.dsleng.etool.models.bobjs.BusinessObject
import java.beans.Introspector
import com.dsleng.etool.models.bobjs.Attribute
import com.dsleng.etool.models.egov.BOMapper
import com.dsleng.etool.models.bobjs.Operation
import com.dsleng.etool.dsl.egov.Lg

class BusinessManagerExt {
	def static cleanUp(BusinessObject e){
		// Remove any operations from the Model
		e.operations.clear
		// Remove any attributes for DataManagemnt
		var it = e.attributes.iterator
		while(it.hasNext){
			val o = it.next
			if (o.dataManagement) {
				it.remove()
			}
		}
	}
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
	def static getUsingNameFor(Attribute e,String name){
		return "#{" + (e.eContainer as BusinessObject).usingBeanName + "." + Introspector.decapitalize(name) + "}"
	}
	def static viewCheck(Attribute e){
		return e.dataManagement
	}
	def static getOps(BusinessObject e){
		var syntax = ""
		for(op: e.operations){
			syntax += op.opSyntax + "\n"
		}
		return syntax
	}
	def static getOpSyntax(Operation op){
		var syntax = ""
		for(a: op.annotations){
			syntax += "@" + a.name + "\n"
		}
		syntax +='''
public void «op.name»('''
		
		for(p: op.opparameters){
			syntax +='''
«p.type» «p.name»; 
'''
		}
		syntax +=''')
{
'''
		syntax += op.syntax
		syntax +='''
}
'''
	}
}