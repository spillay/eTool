/*
 * generated by Xtext
 */
package com.dsleng.etool.dsl.bobjs;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BObjDslStandaloneSetup extends BObjDslStandaloneSetupGenerated{

	public static void doSetup() {
		new BObjDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

