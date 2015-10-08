package com.dsleng.etool.dsl.egov.generator

import com.dsleng.etool.models.egov.BOMapper
import com.dsleng.etool.models.bobjs.BobjsFactory
import com.dsleng.etool.models.bobjs.DataTypes
import com.dsleng.etool.models.bobjs.Attribute
import org.eclipse.emf.common.util.EList
import com.dsleng.etool.models.egov.PreDefinedValue

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
		for (ba : bmap.attributes) {
			
			if (ba.controltype.name == "Selection" && ba.predefinedcontainers.size > 0) {
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