package com.dsleng.etool.dsl.egov.generator

import com.dsleng.etool.models.Controls.ControlManager
import com.dsleng.etool.models.bobjs.Attribute

import static extension com.dsleng.etool.dsl.egov.generator.ControlManagerExt.*
import static extension com.dsleng.etool.dsl.egov.generator.BusinessManagerExt.*

import com.dsleng.etool.models.Controls.AttributeType
import com.dsleng.etool.models.Controls.Composite
import com.dsleng.etool.models.Controls.SimpleControl
import com.dsleng.etool.models.Controls.Options
import com.dsleng.etool.models.Controls.OptionInstance
import com.dsleng.etool.models.Controls.BOType
import com.dsleng.etool.models.bobjs.BobjsPackage
import org.eclipse.emf.common.util.EList
import com.dsleng.etool.models.bobjs.BusinessObject
import com.dsleng.etool.models.Controls.TypeParameter
import com.dsleng.etool.models.Controls.PageType
import java.util.ArrayList
import com.dsleng.etool.models.bobjs.BobjsFactory

class ControlManagerUtils {
	ControlManager cm
	new(ControlManager cm){
		this.cm = cm
	}
	def lookup(EList<TypeParameter> parameters,Options op,Attribute attr){
		for(p: parameters){
			if ( p.option == op){
				switch p.value {
					case "Label":
						return attr.label
					case "Name":
						return attr.usingName
					
				}
			}
		}
		return null
	}
	def BOlookup(EList<TypeParameter> parameters,Options op,BusinessObject b){
		for(p: parameters){
			if ( p.option == op){
				if (p.value == "Name"){
					return b.name
				}
			}
		}
		return null
	}
	def getOptions(EList<OptionInstance> e,AttributeType type,Attribute attr){
		var options = ""
		for(o: e){
			val rvalue = lookup(type.parameters,o.option,attr)
			if ( rvalue != null){
				options += " " + o.option.name + "=\"" + rvalue + "\""
			} else {
				options += " " + o.option.name + "=\"" + o.value.get(0).name + "\""
			}
		}
		return options
	}
	def getSimpleControlHeadSyntax(SimpleControl e,EList<TypeParameter> parameters,BusinessObject b){
		var options = ""
		for(o: e.optionInstance){
			val rvalue = BOlookup(parameters,o.option,b)
			if ( rvalue != null){
				options += " " + o.option.name + "=\"" + rvalue + "\""
			} else {
				options += " " + o.option.name + "=\"" + o.value.get(0).name + "\""
			}
		}
		val startTag = "<" + e.uses.prefix + ":" + e.uses.name + options + ">\n"
		return startTag
	}
	def getSimpleControlTailSyntax(SimpleControl e){
		val endTag = "</" + e.uses.prefix + ":" + e.uses.name + ">\n"
		return endTag
	}
	def String getCompositeHeadSyntax(Composite e,EList<TypeParameter> parameters,BusinessObject b){
		var syntax = "" 
		val baseControl = e.usesControl
		if ( baseControl instanceof Composite){
			syntax += getCompositeHeadSyntax(baseControl as Composite,parameters,b)
		} else if (baseControl instanceof SimpleControl){
			syntax += getSimpleControlHeadSyntax(baseControl as SimpleControl,parameters,b)
		}
		
		for(nestControl: e.nestedControls){
			if ( baseControl instanceof Composite){
				syntax += getCompositeHeadSyntax(nestControl as Composite,parameters,b)
			} else if (baseControl instanceof SimpleControl){
				syntax += getSimpleControlHeadSyntax(nestControl as SimpleControl,parameters,b)
			}
		}
		return syntax
	}
	def String getCompositeTailSyntax(Composite e){
		var syntax = "" 
		
		
		for (i : e.nestedControls.size >.. 0) {
			val nestControl = e.nestedControls.get(i)
			if ( nestControl instanceof Composite){
				syntax += getCompositeTailSyntax(nestControl as Composite)
			} else if (nestControl instanceof SimpleControl){
				syntax += getSimpleControlTailSyntax(nestControl as SimpleControl)
			}
		}
		val baseControl = e.usesControl
		if ( baseControl instanceof Composite){
			syntax += getCompositeTailSyntax(baseControl as Composite)
		} else if (baseControl instanceof SimpleControl){
			syntax += getSimpleControlTailSyntax(baseControl as SimpleControl)
		}
		
		return syntax
	}
	def getHeadSyntax(BOType boType,EList<TypeParameter> parameters,BusinessObject b){
		var syntax = ""
		if ( boType.control instanceof Composite){
			syntax += getCompositeHeadSyntax(boType.control as Composite,parameters,b)
		} else if (boType.control instanceof SimpleControl){
			syntax += getSimpleControlHeadSyntax(boType.control as SimpleControl,parameters,b)
		}
		return syntax
	}
	def getTailSyntax(BOType boType){
		var syntax = ""
		if ( boType.control instanceof Composite){
			syntax += getCompositeTailSyntax(boType.control as Composite)
		} else if (boType.control instanceof SimpleControl){
			syntax += getSimpleControlTailSyntax(boType.control as SimpleControl)
		}
		return syntax
	}
	def getHeadSyntax(PageType pageType,String name){
		var syntax = ""
		val parameters = pageType.parameters
		val b = BobjsFactory.eINSTANCE.createBusinessObject
		b.name = name
		if ( pageType.control instanceof Composite){
			syntax += getCompositeHeadSyntax(pageType.control as Composite,parameters,b)
		} else if (pageType.control instanceof SimpleControl){
			syntax += getSimpleControlHeadSyntax(pageType.control as SimpleControl,parameters,b)
		}
		return syntax
	}
	def getTailSyntax(PageType pageType){
		var syntax = ""
		if ( pageType.control instanceof Composite){
			syntax += getCompositeTailSyntax(pageType.control as Composite)
		} else if (pageType.control instanceof SimpleControl){
			syntax += getSimpleControlTailSyntax(pageType.control as SimpleControl)
		}
		return syntax
	}
	def  getSimpleControlSyntax(SimpleControl e,AttributeType type,Attribute attr){
		var options = getOptions(e.optionInstance,type,attr)
		val startTag = "<" + e.uses.prefix + ":" + e.uses.name + options + ">"
		val endTag = "</" + e.uses.prefix + ":" + e.uses.name + ">"
		return startTag + endTag
	}
	def  String getCompositeSyntax(Composite e,AttributeType type,Attribute attr){
		var baseControl = e.usesControl
		var syntax = ""
		var options = getOptions(baseControl.optionInstance,type,attr)
		val startTag = "<" + baseControl.uses.prefix + ":" + baseControl.uses.name + options + ">"
		val endTag = "</" + baseControl.uses.prefix + ":" + baseControl.uses.name + ">"
		var siblings = "\n"
		for(s: e.sibling){
			if ( s instanceof Composite){
				siblings += getCompositeSyntax(s,type,attr)
			}
			if ( s instanceof SimpleControl){
				siblings += getSimpleControlSyntax(s,type,attr)
			}
			
		}
		syntax = startTag +  endTag + siblings
		
	}
	public def getControlSyntax(AttributeType type,Attribute attr){
		switch type.control {
			Composite:
				return getCompositeSyntax((type.control as Composite),type,attr) + "\n"
			SimpleControl:
				return getSimpleControlSyntax((type.control as SimpleControl),type,attr) + "\n"
		}
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