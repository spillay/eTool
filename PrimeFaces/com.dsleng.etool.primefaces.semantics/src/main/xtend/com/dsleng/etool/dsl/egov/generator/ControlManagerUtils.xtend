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
import org.eclipse.emf.common.util.EList
import com.dsleng.etool.models.bobjs.BusinessObject
import com.dsleng.etool.models.Controls.TypeParameter
import com.dsleng.etool.models.Controls.PageType
import java.util.ArrayList
import com.dsleng.etool.models.bobjs.BobjsFactory
import com.dsleng.etool.models.egov.BOAttribute
import com.dsleng.etool.models.egov.Page
import com.dsleng.etool.models.Controls.ControlsFactory

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
	def String getValue(String o){
		for(op:this){
			if (op.name == o){
				return op.opt.name
			}
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
	new(BOAttribute type,Attribute attr,Page page){
		for(p: type.controlparameters){
				switch p.mappedTo {
					case "Label":
						this.add(new OptionValue(p.option,attr.label))
					case "Name":
						this.add(new OptionValue(p.option,attr.getUsingName(page)))
					case "Type":
						this.add(new OptionValue(p.option,attr.type.toString))
					case "DataContainer":
						this.add(new OptionValue(p.option,attr.getUsingNameFor(type.predefinedcontainers.get(0).name,page)))
				}
		}
		//DO Attribute Types which represent generic attributes
		
		for(p: type.controltype.parameters){
				switch p.value {
					case "Label":
						this.add(new OptionValue(p.option,attr.label))
					case "Name":
						this.add(new OptionValue(p.option,attr.getUsingName(page)))
				}
		}
	}
	new(AttributeType type,Attribute attr,Page page){
		for(p: type.parameters){
				switch p.value {
					case "Label":
						this.add(new OptionValue(p.option,attr.label))
					case "Name":
						this.add(new OptionValue(p.option,attr.getUsingName(page)))
				}
		}
	}
	new(Page p){
		var n = ControlsFactory.eINSTANCE.createOptions()
		n.name = p.north
		this.add(new OptionValue(n,"North"))
		
		var s = ControlsFactory.eINSTANCE.createOptions()
		s.name = p.south
		this.add(new OptionValue(s,"South"))
		
		var w = ControlsFactory.eINSTANCE.createOptions()
		w.name = p.west
		this.add(new OptionValue(w,"West"))
		
		var e = ControlsFactory.eINSTANCE.createOptions()
		e.name = p.east
		this.add(new OptionValue(e,"East"))
		
		var c = ControlsFactory.eINSTANCE.createOptions()
		c.name = "spContents"
		this.add(new OptionValue(c,"Center"))
	}
}

class ControlManagerBase {
	ControlManager cm
	new(ControlManager cm){
		this.cm = cm
	}
	
	def getNullControlSyntax(){
		return ""
	}
	def getContentsControlSyntax(SimpleControl e,OptionManager optMgr){
		return optMgr.getValue(e.optionInstance.get(0).value.get(0).name)
	}
	def getContentsControlHeadSyntax(){
		return "spContents"
	}
	def getContentsControlTailSyntax(){
		return ""
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
		if ( e.name == "Null"){
			return nullControlSyntax
		}
		if ( e.name == "spContents"){
			return contentsControlHeadSyntax
		}
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
		if ( e.name == "Null"){
			return nullControlSyntax
		}
		if ( e.name == "spContents"){
			return contentsControlTailSyntax
		}
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
			if ( nestControl instanceof Composite){
				syntax += getCompositeHeadSyntax(nestControl as Composite,optMgr)
			} else if (nestControl instanceof SimpleControl){
				syntax += getSimpleControlHeadSyntax(nestControl as SimpleControl,optMgr)
			}
		}
		return syntax
	}
	def String getCompositeTailSyntax(Composite e,OptionManager optMgr,OptionManager pageContents){
		var syntax = "" 	
		for (i : e.nestedControls.size >.. 0) {
			val nestControl = e.nestedControls.get(i)
			if ( nestControl instanceof Composite){
				syntax += getCompositeTailSyntax(nestControl as Composite,optMgr,pageContents)
			} else if (nestControl instanceof SimpleControl){
				syntax += getSimpleControlTailSyntax(nestControl as SimpleControl)
			}
		}
		val baseControl = e.usesControl
		if ( baseControl instanceof Composite){
			syntax += getCompositeTailSyntax(baseControl as Composite,optMgr,pageContents)
		} else if (baseControl instanceof SimpleControl){
			syntax += getSimpleControlTailSyntax(baseControl as SimpleControl)
		}
		var siblings = "\n"
		for(s: e.sibling){
			//siblings += "Processing: " + s.name
			if ( s instanceof Composite){
				//siblings += "as composite \n"
				siblings += getCompositeSyntax(s,optMgr,pageContents)
			} else if ( s instanceof SimpleControl){
				//siblings += "as simple \n"
				siblings += getSimpleControlSyntax(s,optMgr,pageContents)
			}
			
		}
		return syntax + siblings
	}
	
	
	def  getSimpleControlSyntax(SimpleControl e,OptionManager optMgr,OptionManager pageContents){
		if ( e.name == "Null"){
			return nullControlSyntax
		}
		if ( e.uses != null && e.uses.name == "spContents"){
			return getContentsControlSyntax(e,pageContents)
		}
		var options = getOptions(e.optionInstance,optMgr)
		if ( e.uses != null){
			val startTag = "<" + e.uses.prefix + ":" + e.uses.name + options + ">"
			val endTag = "</" + e.uses.prefix + ":" + e.uses.name + ">"
			return startTag + endTag
		} else {
			return "problem with: " + e.name
		}
	}
	def  String getCompositeSyntax(Composite e,OptionManager optMgr,OptionManager pageContents){
		var baseControl = e.usesControl
		var syntax = ""
		var options = getOptions(baseControl.optionInstance,optMgr)
		val startTag = "<" + baseControl.uses.prefix + ":" + baseControl.uses.name + options + ">"
		val endTag = "</" + baseControl.uses.prefix + ":" + baseControl.uses.name + ">"
		
		
		var nested = ""
		for(n: e.nestedControls){
			if ( n instanceof Composite){
				nested += getCompositeSyntax(n,optMgr,pageContents)
			} else if ( n instanceof SimpleControl){
				nested += getSimpleControlSyntax(n,optMgr,pageContents)
			}
		}
		
		var siblings = "\n"
		for(s: e.sibling){
			//siblings += "Processing: " + s.name
			if ( s instanceof Composite){
				//siblings += "as composite \n"
				siblings += getCompositeSyntax(s,optMgr,pageContents)
			} else if ( s instanceof SimpleControl){
				//siblings += "as simple \n"
				siblings += getSimpleControlSyntax(s,optMgr,pageContents)
			}
			
		}
		syntax = startTag +  nested + endTag + siblings
		
	}
	
public def genSyntax(Attribute e,Page page){
  		switch e.type {
			case STRING:
				return cm.getStringType(e,page)
			case DATE:
				return cm.getDateType(e,page)
			case INTEGER:
				return cm.getIntegerType(e,page)
			case BOOLEAN:
				return cm.getBooleanType(e,page)
			case DOUBLE:
				return cm.getDoubleType(e,page)
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
	def getTailSyntax(BOType boType,EList<TypeParameter> parameters,BusinessObject b,OptionManager pageContents){
		var syntax = ""
		if ( boType.control instanceof Composite){
			syntax += getCompositeTailSyntax(boType.control as Composite,new OptionManager(parameters,b),pageContents)
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
	def getTailSyntax(PageType pageType,String name,OptionManager pageContents){
		var syntax = ""
		val parameters = pageType.parameters
		val b = BobjsFactory.eINSTANCE.createBusinessObject
		b.name = name
		if ( pageType.control instanceof Composite){
			syntax += getCompositeTailSyntax(pageType.control as Composite,new OptionManager(parameters,b),pageContents)
		} else if (pageType.control instanceof SimpleControl){
			syntax += getSimpleControlTailSyntax(pageType.control as SimpleControl)
		}
		return syntax
	}
	

	public def getControlSyntax(BOAttribute ba,Attribute attr,OptionManager pageContents,Page page){
		switch ba.controltype.control {
			Composite:
				return getCompositeSyntax((ba.controltype.control as Composite),new OptionManager(ba,attr,page),pageContents) + "\n"
			SimpleControl:
				return getSimpleControlSyntax((ba.controltype.control as SimpleControl),new OptionManager(ba,attr,page),pageContents) + "\n"
		}
	}
	public def getControlSyntax(AttributeType type,Attribute attr,OptionManager pageContents,Page page){
		switch type.control {
			Composite:
				return getCompositeSyntax((type.control as Composite),new OptionManager(type,attr,page),pageContents) + "\n"
			SimpleControl:
				return getSimpleControlSyntax((type.control as SimpleControl),new OptionManager(type,attr,page),pageContents) + "\n"
		}
	}
	
}