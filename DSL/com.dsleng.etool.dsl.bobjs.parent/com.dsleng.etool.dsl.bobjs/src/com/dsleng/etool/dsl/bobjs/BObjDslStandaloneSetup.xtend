/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package com.dsleng.etool.dsl.bobjs


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class BObjDslStandaloneSetup extends BObjDslStandaloneSetupGenerated {

	def static void doSetup() {
		new BObjDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
