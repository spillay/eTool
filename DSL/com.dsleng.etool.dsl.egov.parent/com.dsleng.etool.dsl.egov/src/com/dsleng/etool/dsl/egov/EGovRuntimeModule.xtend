/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package com.dsleng.etool.dsl.egov

import com.dsleng.etool.dsl.egov.scoping.EgovImportURIGlobalScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class EGovRuntimeModule extends AbstractEGovRuntimeModule {
	
	override bindIGlobalScopeProvider() {
		return EgovImportURIGlobalScopeProvider
	}
	
}
