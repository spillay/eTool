/**
 * 
 */
package com.dsleng.etool.infra.common.xtext.ui.ecore;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * @author suresh
 *
 */
public class ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
    protected Bundle getBundle() {
        return Activator.getDefault().getBundle();
    }
 
    @Override
    protected Injector getInjector() {
        return Activator.getDefault().getInjector();
    }

}
