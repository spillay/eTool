package com.dsleng.etool.infra.common.xtext.ecore;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class SPSupport extends AbstractGenericResourceSupport {

	@Override
    protected Module createGuiceModule() {
        return new SPRuntimeModule();
    }

}
