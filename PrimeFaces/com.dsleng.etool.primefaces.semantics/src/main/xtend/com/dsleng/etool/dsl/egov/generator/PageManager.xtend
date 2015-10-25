package com.dsleng.etool.dsl.egov.generator

import com.dsleng.etool.models.egov.EService
import com.dsleng.etool.models.egov.Page
import java.util.ArrayList

class PageUtils {
	String title = ""
	protected String pageContents = ""
	public def setPageTitle(String title){
		this.title = title
	}
	
	public def genContents()'''
«PageHead»
«PageTitle»
«pageContents»
«PageTail»
	'''
	protected def PageTitle()'''
<h:head>
     <title>«title»</title>
</h:head>
  		
  	'''
  	
  	protected def PageHead()'''
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:h="http://java.sun.com/jsf/html"
    	xmlns:f="http://java.sun.com/jsf/core" xmlns:ui="http://java.sun.com/jsf/facelets"
    	xmlns:p="http://primefaces.org/ui">
'''

	protected def PageTail()'''
</html>
'''	
}


class WelComePage extends PageUtils {
	var baseProjectDir = ""
	var webDir = ""
	new(ArrayList<String> pages,String baseProjectDir,String webDir) {
		this.baseProjectDir = baseProjectDir
		this.webDir = webDir
		this.pageTitle = "WelCome Page"
		this.pageContents = doPages(pages)
	}
	public def genFileName(){
		return baseProjectDir + webDir + "index" + ".xhtml"
	}
	public def doPages(ArrayList<String> pages){
		var links = ""
  		for(p: pages){
  			val link = p.toString.replace(baseProjectDir + webDir,"")
  			links += "<a href=\"" +link+ "\">" + link + "</a><br/>\n"
  		}
  		return links
	}
	
}
class PageManager extends PageUtils {
	val fileSep = "/"
	val Page page
	var baseProjectDir = ""
	var webDir = ""
	new(Page p,String baseProjectDir,String webDir) {
		page = p
		this.baseProjectDir = baseProjectDir
		this.webDir = webDir
		this.pageTitle = orgUnit + "-" + EService
	}
	
	public def genFileName(){
		var fileName = getOrgUnit() + fileSep + getEService() + fileSep + page.name
		//fileName = e.name
		fileName = fileName.replace(" ","_")
		fileName = baseProjectDir + webDir + fileName + ".xhtml"
	}
	public def setContents(String content){
		this.pageContents = content
	}
	private def getOrgUnit(){
		return (page.eContainer as EService).businessUnit.name
	}
	private def getEService(){
		return (page.eContainer as EService).name
	}
}
class UICompositionPageManager extends PageUtils {
	val fileSep = "/"
	val Page page
	var baseProjectDir = ""
	var webDir = ""
	new(Page p,String baseProjectDir,String webDir) {
		page = p
		this.baseProjectDir = baseProjectDir
		this.webDir = webDir
		this.pageTitle = orgUnit + "-" + EService
	}
	
	public def genFileName(){
		var fileName = "pages" + fileSep + page.name
		//fileName = e.name
		fileName = fileName.replace(" ","_")
		fileName = baseProjectDir + webDir + fileName + ".xhtml"
	}
	public def setContents(String content){
		this.pageContents = content
	}
	private def getOrgUnit(){
		return (page.eContainer as EService).businessUnit.name
	}
	private def getEService(){
		return (page.eContainer as EService).name
	}
	
}