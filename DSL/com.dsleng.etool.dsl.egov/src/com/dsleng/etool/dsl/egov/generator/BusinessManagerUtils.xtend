package com.dsleng.etool.dsl.egov.generator

import com.dsleng.etool.models.egov.BOMapper
import com.dsleng.etool.models.bobjs.BobjsFactory
import com.dsleng.etool.models.bobjs.DataTypes
import com.dsleng.etool.models.bobjs.Attribute
import org.eclipse.emf.common.util.EList
import com.dsleng.etool.models.egov.PreDefinedValue
import com.dsleng.etool.dsl.egov.Lg

class BusinessManagerUtils {
	def getSyntax(Attribute a,EList<PreDefinedValue> v){
		var syntax ='''
«a.name» = new HashMap<String,String>();
		'''
		for(l: v){
			var input='''
«a.name».put("«l.value»","«l.value»");
			'''
			syntax += input
		}
		return syntax
	}
	def doPredefinedData(BOMapper bmap) {
		Lg.debug("Processing doPredefinedData")
		for (ba : bmap.attributes) {		
			if (ba.controltype.name == "Selection" && ba.predefinedcontainers.size > 0) {
				Lg.debug("Found Predefined Data: for attribute" + ba.attribute.name)
				// Add an attribute to BO
				var initSyntax = ""
				for(pdc:ba.predefinedcontainers){
					var newAttr = BobjsFactory.eINSTANCE.createAttribute()
					newAttr.name = pdc.name
					newAttr.type = DataTypes.DATA_MAP
					newAttr.dataManagement = true
					bmap.businessObject.attributes.add(newAttr)
					initSyntax = newAttr.getSyntax(pdc.predefinedvalues)
				}
				Lg.debug("No of Business Operations " + bmap.businessObject.operations.size) 
				for(ops: bmap.businessObject.operations){
					Lg.debug("Business Operations " + ops.name) 
				}
				// Add the Initializer
				var op = BobjsFactory.eINSTANCE.createOperation()
				op.name = "init"
				//op.type = DataTypes.DATA_MAP_VALUE
				op.syntax = initSyntax
				var an = BobjsFactory.eINSTANCE.createAnnotation()
				an.name = "PostConstruct"
				op.annotations.add(an)
				bmap.businessObject.operations.add(op)
			}
		}
	}
}