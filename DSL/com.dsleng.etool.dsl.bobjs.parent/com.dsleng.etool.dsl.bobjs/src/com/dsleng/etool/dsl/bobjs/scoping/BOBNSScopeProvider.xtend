package com.dsleng.etool.dsl.bobjs.scoping

import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider
import org.eclipse.emf.ecore.EObject

class BOBNSScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
	
	override protected internalGetImportedNamespaceResolvers(EObject context, boolean ignoreCase) {
		super.internalGetImportedNamespaceResolvers(context, ignoreCase)
	}
	
	override protected createImportedNamespaceResolver(String namespace, boolean ignoreCase) {
		super.createImportedNamespaceResolver(namespace, ignoreCase)
	}
	
	
}