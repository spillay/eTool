/**
 * 
 */
package com.dsleng.etool.infra.common.xtext.ecore;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

/**
 * @author suresh
 *
 */
public class SPRuntimeModule extends AbstractGenericResourceRuntimeModule {

	@Override
    protected String getLanguageName() {
        return "org.eclipse.uml2.uml.editor.presentation.UMLEditorID";
    }
 
    @Override
    protected String getFileExtensions() {
        return "ecore";
    }
 
    public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
        return SPResourceDescriptionStrategy.class;
    }
 
    @Override
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return SPQualifiedNameProvider.class;
    }
}
