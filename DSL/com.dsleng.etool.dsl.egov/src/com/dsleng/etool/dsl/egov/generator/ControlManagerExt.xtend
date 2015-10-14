package com.dsleng.etool.dsl.egov.generator

import com.dsleng.etool.models.Controls.ControlManager
import com.dsleng.etool.models.Controls.SimpleControl
import com.dsleng.etool.models.bobjs.Attribute

import static extension com.dsleng.etool.dsl.egov.generator.BusinessManagerExt.*
import com.dsleng.etool.models.egov.Page

class ControlManagerExt {
	def static getSyntax(SimpleControl e){
		return "SimpleControlSyntax"
	}
	def static getSyntax(ControlManager e){
		return "ControlManagerSyntax"
	}
	
	def static getStringType(ControlManager e,Attribute a,Page page)'''
<h:outputText value="«a.label»" />
<p:inputText value="«a.getUsingName(page)»" />
	'''
	def static getIntegerType(ControlManager e,Attribute a,Page page)'''
<h:outputText value="«a.label»" />
<p:inputText value="«a.getUsingName(page)»" />
	'''
	def static getDateType(ControlManager e,Attribute a,Page page)'''
<h:outputText value="«a.label»: Date Type" />
<p:inputText value="«a.getUsingName(page)»" />
	'''
	def static getBooleanType(ControlManager e,Attribute a,Page page)'''
<h:outputText value="«a.label»: Boolean Type" />
<p:inputText value="«a.getUsingName(page)»" />
	'''
	def static getDoubleType(ControlManager e,Attribute a,Page page)'''
<h:outputText value="«a.label»: Double Type" />
<p:inputText value="«a.getUsingName(page)»" />
	'''
}
