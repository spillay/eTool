/*
 * generated by Xtext
 */
package com.dsleng.etool.semantic.map;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SemanticmapDslStandaloneSetup extends SemanticmapDslStandaloneSetupGenerated{

	public static void doSetup() {
		new SemanticmapDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

