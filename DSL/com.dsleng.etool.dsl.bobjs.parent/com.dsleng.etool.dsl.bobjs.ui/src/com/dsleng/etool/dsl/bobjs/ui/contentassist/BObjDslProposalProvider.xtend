/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package com.dsleng.etool.dsl.bobjs.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import com.dsleng.etool.dsl.bobjs.ui.internal.BobjsActivator
import com.dsleng.etool.model.bobjs.impl.PackageImpl
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import java.util.List
import java.util.HashMap
import com.dsleng.etool.model.bobjs.impl.OrgUnitImpl
import org.eclipse.core.runtime.Platform
import java.util.Enumeration
import java.net.URL
import java.util.Collections
import java.util.ArrayList

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class BObjDslProposalProvider extends AbstractBObjDslProposalProvider {
	
	override completeBOImport_ImportPlugin(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeBOImport_ImportPlugin(model, assignment, context, acceptor)
		for(bundle: BobjsActivator.instance.bundle.bundleContext.bundles.filter[b| b.symbolicName.contains("com.dsleng.etool.contrib.bob")]){
			val urls = getModels(bundle.symbolicName)
			while(urls.hasMoreElements){
				val url = urls.nextElement
				
				val topPack = getTopLevelPackages(bundle.symbolicName + url.file)
				for(tp: topPack){
					var proposal = '"' + tp + '"'
					acceptor.accept(createCompletionProposal(proposal, proposal, null, context));
				}
			}
			
			
			
		}
	}
	
	override completeAttribute_SpType(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeAttribute_SpType(model, assignment, context, acceptor)
		/* 
		var pack = getPackage(model) as PackageImpl
		var rs = new ResourceSetImpl();
		if ( pack != null){
			// Only add the ones found in imports
			for(importplugin: pack.boimport){
				for(s: getBO(importplugin.importPlugin)){
					var proposal = '"' + s + '"'
					acceptor.accept(createCompletionProposal(proposal, proposal, null, context));	
				}	
			}
		}
		* 
		*/
		
	}
	def List<String> getBO(String resInfo){
		val info = resInfo.split(":")
		val resName = info.get(0)
		val pacName = info.get(1)
		var bos = new ArrayList<String>();
		var rs = new ResourceSetImpl();
		val plugin = URI.createPlatformPluginURI(resName,true)
		var res = rs.getResource(plugin,true)
		val orgUnit = res.contents.get(0) as OrgUnitImpl
		for(p: orgUnit.packages){
			if(p.name == pacName){
				for(bo: p.businessobjects){
					bos.add(pacName + "." + bo.name)
				}
				for(bt: p.businesstypes){
					bos.add(pacName + "." + bt.name)
				}
			}
		}
		return bos
	}
	def List<String> getTopLevelPackages(String resName){
		var pacs = new ArrayList<String>();
		var rs = new ResourceSetImpl();
		val plugin = URI.createPlatformPluginURI(resName,true)
		var res = rs.getResource(plugin,true)
		val orgUnit = res.contents.get(0) as OrgUnitImpl
		for(p: orgUnit.packages){
			val pname = resName + "=>" + p.name
			pacs.add(pname)
		}
		return pacs
	}
	def Enumeration<URL> getModels(String plugin){
		val bun = Platform.getBundle(plugin)
		return bun.findEntries("/model/","*.bob",false)
		//return bun.findEntries("/","*",true)
	}
	def HashMap<String,String> getBO(OrgUnitImpl o,HashMap<String,String> hm) {
		for(p: o.packages){
			for(bo: p.businessobjects){
				hm.put(bo.name,bo.name)
			}
			for(bt: p.businesstypes){
				hm.put(bt.name,bt.name)
			}
		}
		return hm
	} 
	def EObject getPackage(EObject eo)  {
		if ( eo.eContainer != null){
			return eo.eContainer.eContainer
		} else {
			return null
		}
	}
	def EObject getRoot(EObject eo)  {
    	var parent = eo.eContainer();
    	if (parent != null) {
        	return getRoot(parent);
    	}
    	return eo;
	}
	
}
