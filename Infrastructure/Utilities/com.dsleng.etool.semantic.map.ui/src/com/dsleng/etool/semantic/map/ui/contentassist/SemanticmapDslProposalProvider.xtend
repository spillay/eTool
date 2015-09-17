/*
 * generated by Xtext
 */
package com.dsleng.etool.semantic.map.ui.contentassist

import com.dsleng.etool.semantic.map.ui.contentassist.AbstractSemanticmapDslProposalProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import com.dsleng.etool.semantic.map.smDsl.LClass
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import java.util.Collections
import org.eclipse.emf.ecore.impl.EDataTypeImpl
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EClass

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class SemanticmapDslProposalProvider extends AbstractSemanticmapDslProposalProvider {
	
	override completeLClass_Obj(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeLClass_Obj(model, assignment, context, acceptor)
		val imp = (model as LClass).ecoreTypes
		val resourceSet = new ResourceSetImpl
    	val resource = resourceSet.getResource(URI.createURI(imp.importURI), true)
    	resource.load(Collections::EMPTY_MAP)
    	val epackage = resource.contents.get(0) 
    	for (content : epackage.eContents ) {
    		acceptor.accept(createCompletionProposal((content as EClass).name, context))
    	}
		
	}
	
}