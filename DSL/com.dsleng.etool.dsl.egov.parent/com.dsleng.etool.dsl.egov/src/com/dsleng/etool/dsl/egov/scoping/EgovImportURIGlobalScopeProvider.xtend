package com.dsleng.etool.dsl.egov.scoping

import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource

class EgovImportURIGlobalScopeProvider extends ImportUriGlobalScopeProvider {
	public static final URI HEADER_URI = URI.createURI("platform:/plugin/com.dsleng.etool.base/resources/base.bob");
    
	override protected getImportedUris(Resource resource) {
			var importedURIs = super.getImportedUris(resource);
        	importedURIs.add(HEADER_URI);
        	return importedURIs;
	} 
}