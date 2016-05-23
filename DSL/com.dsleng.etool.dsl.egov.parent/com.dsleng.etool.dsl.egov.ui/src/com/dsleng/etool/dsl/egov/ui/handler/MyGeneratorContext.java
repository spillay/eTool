/**
 * 
 */
package com.dsleng.etool.dsl.egov.ui.handler;

import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.util.CancelIndicator;

/**
 * @author suresh
 *
 */
public class MyGeneratorContext implements IGeneratorContext {

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.generator.IGeneratorContext#getCancelIndicator()
	 */
	@Override
	public CancelIndicator getCancelIndicator() {
		return CancelIndicator.NullImpl;
	}

}
