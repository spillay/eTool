/*
 * generated by Xtext
 */
package com.dsleng.etool.xtext.presentation.view;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ViewDslStandaloneSetup extends ViewDslStandaloneSetupGenerated{

	public static void doSetup() {
		new ViewDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

