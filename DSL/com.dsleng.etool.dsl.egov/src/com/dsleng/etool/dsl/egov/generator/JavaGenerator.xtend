package com.dsleng.etool.dsl.egov.generator

import com.dsleng.etool.models.bobjs.BusinessObject
import java.util.ArrayList
import com.dsleng.etool.models.bobjs.Attribute
import com.dsleng.etool.models.bobjs.DataTypes
import com.dsleng.etool.models.bobjs.Operation
import com.dsleng.etool.models.bobjs.OrgUnit
import java.beans.Introspector
import static extension com.dsleng.etool.dsl.egov.generator.BusinessManagerExt.*

class JavaClass {
	private BusinessObject obj;
	private String fileSep = "/"
	private String pkgSep = "."
	private JavaClass baseJC
	private String classType
	
	var annotations = new ArrayList<String>()
	var imports = new ArrayList<String>()
	var attributes = new ArrayList<JavaAttribute>()
	var operations = new ArrayList<JavaOperation>()
	var packageName = ""
	var implementsList = new ArrayList<String>()
	var extendsList = new ArrayList<String>()

	new(BusinessObject e,String type) {
		obj = e
		obj.attributes.forEach[elem|this.addAttribute(elem)]
		obj.operations.forEach[elem|this.addOperation(elem)]
		this.classType = type
		doPackage(obj)
		
	}
	public def setBaseJC(JavaClass e){
		this.baseJC = e
	}
	public def addImplements(String name){
		implementsList.add(name)
	}
	public def addExtends(String name){
		extendsList.add(name)
	}
	private def doPackage(BusinessObject e){
		var pkg = "" 
		if (e.eContainer instanceof OrgUnit)
		{
			pkg += pkgSep + (e.eContainer as OrgUnit).name
		}
		pkg = pkg.replace(" ","_")
		package = pkg
	}
	def setPackage(String p) { packageName = p }

	def getPackage() { return packageName }

	def addAnnotations(String a) { annotations.add(a) }

	def addImports(BusinessObject o){
		addImports(o.FQN)
	}
	// Fix with a more elegant solution
	def addImportService(BusinessObject o){
		val imp = (o.eContainer as OrgUnit).package + ".service." + o.name + "Service"
		addImports(imp)
	}
	def addImportDAO(BusinessObject o){
		val imp = (o.eContainer as OrgUnit).package + ".dao." + o.name + "DAO"
		addImports(imp)
	}
	def addImports(String a) { 
		if (!imports.contains(a)){ imports.add(a) }
	}
	
	private def existingAttribute(String name,String type){
		for(a: attributes){
			if (a.check(name,type)){
				return true
			}
		}
		return false
	}

	def addAttribute(JavaAttribute e){
		attributes.add(e)
	}

	def addAttribute(Attribute e) { if(!existingAttribute(e.name,e.type.toString())){ attributes.add(new JavaAttribute(e)) } }

	def addAttribute(String name, DataTypes type) { if(!existingAttribute(name,type.toString())){attributes.add(new JavaAttribute(name, type))} }
	def addAttribute(String name,String pName) { 
		if(!existingAttribute(Introspector.decapitalize(name),name)){
			attributes.add(new JavaAttribute(name))
			imports.add(pName + pkgSep + name)
		}
		
	}

	def addOperation(Operation e) { operations.add(new JavaOperation(e)) }
	def addOperation(JavaOperation e) { operations.add(e) }

	private def getDefinedOperationsSyntax(String type){
		var ops = ""
		if (baseJC != null){
			switch type {
			case "Impl":
				ops += baseJC.operationImplSyntax
			case "Interface":
				ops += baseJC.operationInterfaceSyntax
			default:{}
			}
		}
		ops += operationsSyntax
		return ops;
	}

	def getSyntax() '''
		«Head»
		«importSyntax»
		«annotationSyntax»
		«classHead»
			«attrDeclSyntax»
			«getDefinedOperationsSyntax(classType)»
			«attrOpsSyntax»
		«classTail»
	'''
	

	def getAnnotationSyntax() {
		var ann = ""
		for (a : annotations) {
			ann += "@" + a + "\n";
		}
		return ann
	}
	public def operationImplSyntax(){
		var ops = ""
		for (a : operations) {
			ops += a.opSyntax
		}
		return ops
	}
	public def operationInterfaceSyntax(){
		var ops = ""
		for (a : operations) {
			ops += a.opInterfaceSyntax
		}
		return ops
	}
	private def operationsSyntax() {
		var ops = ""
		for (a : operations) {
			ops += a.opSyntax
		}
		return ops
	}
	private def attrDeclSyntax() {
		var att = ""
		for (a : attributes) {
			att += a.declSyntax
		}
		return att
	}
	private def attrOpsSyntax() {
		var att = ""
		for (a : attributes) {
			if (a.createGetSet){
				att += a.gettersSetters
			}
		}
		return att
	}

	private def importSyntax() {
		var imp = ""
		for (i : imports) {
			imp += importStmt(i)
		}
		return imp
	}
	private def getImplements(){
		var syn = ""
		if ( this.implementsList.size() > 0){
			syn += "implements "
			var impl = ""
			for(i: implementsList){
				if ( impl != ""){
					impl += "."
				}
				impl += i
			}
			syn += impl
			
		}
		if ( this.extendsList.size() > 0){
			syn += "extends "
			var ext = ""
			for(i: extendsList){
				if ( ext != ""){
					ext += "."
				}
				ext += i
			}
			syn += ext
		}
		
		return syn
	}
	private def getType(){
		switch classType {
			case "Impl": return "class"
			case "Interface": return "interface"
		}
	}
	private def getSerial(){
		switch classType {
			case "Impl": return "private static final long serialVersionUID = 1L;"
			case "Interface": return ""
		}
	}
	private def classHead() '''
public «type» «obj.name» «implements» {
	«serial»
'''

	private def classTail() '''
}
		'''

	private def importStmt(String imp) '''
import «imp»;
'''

	private def Head() '''
package «packageName»;
		
/**
* @author Suresh Pillay
*
*/
'''

}

class JavaAttribute {
	private String name;
	private String type;
	private String defValue;
	var annotations = new ArrayList<String>()

	new(Attribute e) {
		name = e.name
		type = e.type.toSPString
	}

	new(String name, DataTypes type) {
		this.name = name
		this.type = type.toSPString
	}
	new(String name, String type) {
		this.name = name
		this.type = type
	}
	new(String name, String type,String defValue) {
		this.name = name
		this.type = type
	}
	new(String boname) {
		type = boname
		name = Introspector.decapitalize(boname)
	}
	def check(String name,String type){
		return (this.name==name &&this.type==type)
	}
	def addAnnotations(String a) { annotations.add(a) }

	// Special Class to Manage Injection Objects
	def createGetSet(){
		if (annotations.contains("Autowired")){
			return false
		} else {
			return true;
		}
	}
	def getAnnotationSyntax() {
		var ann = ""
		for (a : annotations) {
			ann += "@" + a;
		}
		return ann
	}

	private def capitalizeFirstLetter(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}

	def getDeclSyntax(){
		var syn = ""
	
		if (defValue != null){
		syn = '''
		«annotationSyntax»
		private «type» «name» = «defValue»;
'''
		} else {	
		syn = '''
		«annotationSyntax»
		private «type» «name»;
'''
		}
		return syn
	}
	def getOpDeclSyntax(){
		var syn = ""
	
		if (defValue != null){
		syn = '''
		«type» «name» = «defValue»'''
		} else {	
		syn = '''
		«type» «name»'''
		}
		return syn
	}
	def getGettersSetters(){
		var nme = name
		// Some cleanup to main java naming conventions
		nme = nme.replace("-", "")
		nme = capitalizeFirstLetter(nme)

		var vnme = name
		vnme = vnme.replace("-", "")
		var res ='''
		public «type» get«nme»(){
			return «vnme»;
		}
		public void set«nme»(«type» «vnme»){
			this.«vnme»=«vnme»;
		}
		'''
		return res
	}
	private def getandset(Attribute e) {
		var nme = e.name
		// Some cleanup to main java naming conventions
		nme = nme.replace("-", "")
		nme = capitalizeFirstLetter(nme)

		var vnme = e.name
		vnme = vnme.replace("-", "")
		switch e.type {
			case STRING: '''
				public String get«nme»(){
					return «vnme»;
				}
				public void set«nme»(String «vnme»){
					this.«vnme»=«vnme»;
				}
			'''
			case INTEGER: '''
				public int get«nme»(){
					return «vnme»;
				}
				public void set«nme»(int «vnme»){
					this.«vnme»=«vnme»;
				}
			'''
			case BOOLEAN: '''
				public boolean get«nme»(){
					return «vnme»;
				}
				public void set«nme»(boolean «vnme»){
					this.«vnme»=«vnme»;
				}
			'''
			case DATE: '''
				public String get«nme»(){
					return «vnme»;
				}
				public void set«nme»(String «vnme»){
					this.«vnme»=«vnme»;
				}
			'''
			case DOUBLE: '''
				public double get«nme»(){
					return «vnme»;
				}
				public void set«nme»(double «vnme»){
					this.«vnme»=«vnme»;
				}
			'''
			case DATA_MAP: '''
				public Map<String,String> get«nme»(){
					return «vnme»;
				}
				public void set«nme»(Map<String,String> «vnme»){
					this.«vnme»=«vnme»;
				}
			'''
			default: {
			}
		}
	}
}

class JavaOperation {
	private Operation obj
	private String name;
	private String type;
	private String syntax;
	var annotations = new ArrayList<String>()
	var parameters = new ArrayList<JavaAttribute>()
	
	new(String name,String type) {
		this.name = name
		this.type = type
	}
	def addAnnotations(String name){
		annotations.add(name)
	}
	def addParameter(JavaAttribute o){
		parameters.add(o)
	}
	new(Operation e) {
		obj = e
		name = obj.name
		type = obj.type.toString
		for(a: obj.annotations){
			annotations.add(a.name)
		} 
		for(p: obj.opparameters){
			parameters.add(new JavaAttribute(p.name,p.type))
		}
		this.syntax = obj.syntax
	}
	def setSyntax(String s){
		this.syntax = s
	}
	def getSyntax(){
		return this.syntax
	}
	def  getOpSyntax(){
		var syntax = ""
		for(a: annotations){
			syntax += "@" + a + "\n"
		}
		syntax +="public " + type +" "+ name
		syntax += "("
		var params = ""
		for(p: parameters){
			if (params != ""){
				params += ","
			}
			params += p.opDeclSyntax
		}
		params += ")"
		
		syntax += params
		syntax += "{\n" + getSyntax + "\n}\n"
		return syntax	
	}
	def  getOpInterfaceSyntax(){
		var syntax = ""
		for(a: annotations){
			//syntax += "@" + a + "\n"
		}
		syntax +="public " + type +" "+ name
		syntax += "("
		var params = ""
		for(p: parameters){
			if (params != ""){
				params += ","
			}
			params += p.opDeclSyntax
		}
		params += ")"
		
		syntax += params + ";\n"
		return syntax	
	}
}

	