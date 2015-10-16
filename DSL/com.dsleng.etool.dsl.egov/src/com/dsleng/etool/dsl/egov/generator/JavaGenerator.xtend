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
	
	var annotations = new ArrayList<String>()
	var imports = new ArrayList<String>()
	var attributes = new ArrayList<JavaAttribute>()
	var operations = new ArrayList<JavaOperation>()
	var packageName = ""

	new(BusinessObject e) {
		obj = e
		obj.attributes.forEach[elem|this.addAttribute(elem)]
		obj.operations.forEach[elem|this.addOperation(elem)]
		doPackage(obj)
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

	def addAttribute(Attribute e) { if(!existingAttribute(e.name,e.type.toString())){ attributes.add(new JavaAttribute(e)) } }

	def addAttribute(String name, DataTypes type) { if(!existingAttribute(name,type.toString())){attributes.add(new JavaAttribute(name, type))} }
	def addAttribute(String name,String pName) { 
		if(!existingAttribute(Introspector.decapitalize(name),name)){
			attributes.add(new JavaAttribute(name))
			imports.add(pName + pkgSep + name)
		}
		
	}

	def addOperation(Operation e) { operations.add(new JavaOperation(e)) }

	def getSyntax() '''
		«Head»
		«importSyntax»
		«annotationSyntax»
		«classHead»
			«attrDeclSyntax»
			«operationsSyntax»
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
			att += a.gettersSetters
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

	private def classHead() '''
public class «obj.name» implements Serializable {
	private static final long serialVersionUID = 1L;	
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
	var annotations = new ArrayList<String>()

	new(Attribute e) {
		name = e.name
		type = e.type.toSPString
	}

	new(String name, DataTypes type) {
		this.name = name
		this.type = type.toSPString
	}
	new(String boname) {
		type = boname
		name = Introspector.decapitalize(boname)
	}
	def check(String name,String type){
		return (this.name==name &&this.type==type)
	}
	def addAnnotations(String a) { annotations.add(a) }

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

	def getDeclSyntax() '''
		«annotationSyntax»
		private «type» «name»;
	'''
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

	new(Operation e) {
		obj = e
	}
	def  getOpSyntax(){
		var syntax = ""
		for(a: obj.annotations){
			syntax += "@" + a.name + "\n"
		}
		syntax +='''
public void «obj.name»('''
		
		for(p: obj.opparameters){
			syntax +='''
«p.type» «p.name»; 
'''
		}
		syntax +=''')
{
'''
		syntax += obj.syntax
		syntax +='''
}
'''
	return syntax
	}
}

	