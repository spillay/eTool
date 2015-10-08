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
import com.dsleng.etool.models.egov.BOAttribute

class OptionValue {
	Options opt
	String name
	new(Options o,String n){
		this.opt = o
		this.name = n
	}
	def getOpt(){return opt}
	def getName(){return name}
}

class OptionManager extends ArrayList<OptionValue>{
	def String getValue(Options o){
		val res = this.filter[elem| elem.opt == o]
		if ( res.size > 0){
			return res.get(0).name
		}
		return null
	}
	new(EList<TypeParameter> parameters,BusinessObject b){
		this.clear
		for(p: parameters){
			if (p.value == "Name"){
				this.add(new OptionValue(p.option,b.name))
			}
		}
	}
	new(BOAttribute type,Attribute attr){
		for(p: type.controlparameters){
				switch p.mappedTo {
					case "Label":
						this.add(new OptionValue(p.option,attr.label))
					case "Name":
						this.add(new OptionValue(p.option,attr.usingName))
					case "Type":
						this.add(new OptionValue(p.option,attr.type.toString))
					case "DataContainer":
						this.add(new OptionValue(p.option,attr.getUsingNameFor(type.predefinedcontainers.get(0).name)))
				}
		}
		//DO Attribute Types which represent generic attributes
		
		for(p: type.controltype.parameters){
				switch p.value {
					case "Label":
						this.add(new OptionValue(p.option,attr.label))
					case "Name":
						this.add(new OptionValue(p.option,attr.usingName))
				}
		}
	}
	new(AttributeType type,Attribute attr){
		for(p: type.parameters){
				switch p.value {
					case "Label":
						this.add(new OptionValue(p.option,attr.label))
					case "Name":
						this.add(new OptionValue(p.option,attr.usingName))
				}
		}
	}
}

class ControlManagerBase {
	ControlManager cm
	new(ControlManager cm){
		this.cm = cm
	}
	
	//def getOptions(EList<OptionInstance> e,AttributeType type,Attribute attr){
	def getOptions(EList<OptionInstance> e,OptionManager optMgr){
		var options = ""
		for(o: e){
			val rvalue = optMgr.getValue(o.option) 
			if ( rvalue != null){
				options += " " + o.option.name + "=\"" + rvalue + "\""
			} else {
				options += " " + o.option.name + "=\"" + o.value.get(0).name + "\""
			}
		}
		return options
	}
	//def getSimpleControlHeadSyntax(SimpleControl e,EList<TypeParameter> parameters,BusinessObject b){
	def getSimpleControlHeadSyntax(SimpleControl e,OptionManager optMgr){
		var options = ""
		for(o: e.optionInstance){
			val rvalue = optMgr.getValue(o.option) 
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
	//def String getCompositeHeadSyntax(Composite e,EList<TypeParameter> parameters,BusinessObject b){
	def String getCompositeHeadSyntax(Composite e,OptionManager optMgr){
		var syntax = "" 
		val baseControl = e.usesControl
		if ( baseControl instanceof Composite){
			syntax += getCompositeHeadSyntax(baseControl as Composite,optMgr)
		} else if (baseControl instanceof SimpleControl){
			syntax += getSimpleControlHeadSyntax(baseControl as SimpleControl,optMgr)
		}
		
		for(nestControl: e.nestedControls){
			if ( baseControl instanceof Composite){
				syntax += getCompositeHeadSyntax(nestControl as Composite,optMgr)
			} else if (baseControl instanceof SimpleControl){
				syntax += getSimpleControlHeadSyntax(nestControl as SimpleControl,optMgr)
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
	
	
	def  getSimpleControlSyntax(SimpleControl e,OptionManager optMgr){
		var options = getOptions(e.optionInstance,optMgr)
		if ( e.uses != null){
			val startTag = "<" + e.uses.prefix + ":" + e.uses.name + options + ">"
			val endTag = "</" + e.uses.prefix + ":" + e.uses.name + ">"
			return startTag + endTag
		} else {
			return "problem with: " + e.name
		}
	}
	def  String getCompositeSyntax(Composite e,OptionManager optMgr){
		var baseControl = e.usesControl
		var syntax = ""
		var options = getOptions(baseControl.optionInstance,optMgr)
		val startTag = "<" + baseControl.uses.prefix + ":" + baseControl.uses.name + options + ">"
		val endTag = "</" + baseControl.uses.prefix + ":" + baseControl.uses.name + ">"
		
		
		var nested = ""
		for(n: e.nestedControls){
			if ( n instanceof Composite){
				nested += getCompositeSyntax(n,optMgr)
			} else if ( n instanceof SimpleControl){
				nested += getSimpleControlSyntax(n,optMgr)
			}
		}
		
		var siblings = "\n"
		for(s: e.sibling){
			//siblings += "Processing: " + s.name
			if ( s instanceof Composite){
				//siblings += "as composite \n"
				siblings += getCompositeSyntax(s,optMgr)
			} else if ( s instanceof SimpleControl){
				//siblings += "as simple \n"
				siblings += getSimpleControlSyntax(s,optMgr)
			}
			
		}
		syntax = startTag +  nested + endTag + siblings
		
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

class ControlManagerUtils extends ControlManagerBase {
	ControlManager cm
	new(ControlManager cm){
		super(cm)
		this.cm = cm
	}
	
	
	def getHeadSyntax(BOType boType,EList<TypeParameter> parameters,BusinessObject b){
		var syntax = ""
		if ( boType.control instanceof Composite){
			syntax += getCompositeHeadSyntax(boType.control as Composite,new OptionManager(parameters,b))
		} else if (boType.control instanceof SimpleControl){
			syntax += getSimpleControlHeadSyntax(boType.control as SimpleControl,new OptionManager(parameters,b))
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
			syntax += getCompositeHeadSyntax(pageType.control as Composite,new OptionManager(parameters,b))
		} else if (pageType.control instanceof SimpleControl){
			syntax += getSimpleControlHeadSyntax(pageType.control as SimpleControl,new OptionManager(parameters,b))
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
	

	public def getControlSyntax(BOAttribute ba,Attribute attr){
		switch ba.controltype.control {
			Composite:
				return getCompositeSyntax((ba.controltype.control as Composite),new OptionManager(ba,attr)) + "\n"
			SimpleControl:
				return getSimpleControlSyntax((ba.controltype.control as SimpleControl),new OptionManager(ba,attr)) + "\n"
		}
	}
	public def getControlSyntax(AttributeType type,Attribute attr){
		switch type.control {
			Composite:
				return getCompositeSyntax((type.control as Composite),new OptionManager(type,attr)) + "\n"
			SimpleControl:
				return getSimpleControlSyntax((type.control as SimpleControl),new OptionManager(type,attr)) + "\n"
		}
	}
	
}