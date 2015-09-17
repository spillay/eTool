/**
 * 
 */
package com.dsleng.etool.external;

/**
 * @author suresh
 *
 */
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    /**
     * Implements BundleActivator.start().
     *
     * @param context the framework context for the bundle.
     */
    public void start(BundleContext context) throws Exception {
    	System.out.println("Hello World!!!");  
    }

    /**
     * Implements BundleActivator.stop(). 
     *
     * @param context the framework context for the bundle.
     */
    public void stop(BundleContext context) {
    	System.out.println("Goodbye World!!!");
    }
}

