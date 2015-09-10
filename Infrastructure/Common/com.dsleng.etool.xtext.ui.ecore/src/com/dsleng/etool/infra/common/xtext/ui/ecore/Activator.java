package com.dsleng.etool.infra.common.xtext.ui.ecore;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.dsleng.etool.infra.common.xtext.ecore.SPRuntimeModule;
import org.eclipse.xtext.ui.shared.contribution.SharedStateContribution;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.util.Modules;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.dsleng.etool.xtext.ui.ecore"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
    private Injector injector;
 
    /**
     * The constructor
     */
    public Activator() {
    }
 
    public Injector getInjector() {
        return injector;
    }
	
	private void initializeEcoreInjector() {
        injector = Guice.createInjector(
                Modules.override(Modules.override(new SPRuntimeModule())
                .with(new SPUiModule(plugin)))
                .with(new SharedState()));
    }
 
    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        try {
            initializeEcoreInjector();
        } catch(Exception e) {
            //logger.error(e.getMessage(), e);
            throw e;
        }
    }
 
    @Override
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        injector = null;
        super.stop(context);
    }
	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
