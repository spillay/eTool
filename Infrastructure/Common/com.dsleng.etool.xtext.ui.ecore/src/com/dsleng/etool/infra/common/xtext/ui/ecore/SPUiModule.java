/**
 * 
 */
package com.dsleng.etool.infra.common.xtext.ui.ecore;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.LanguageSpecific;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;
import org.eclipse.xtext.ui.resource.generic.EmfUiModule;

/**
 * @author suresh
 *
 */
public class SPUiModule extends EmfUiModule {

	public SPUiModule(AbstractUIPlugin plugin) {
		super(plugin);
		// TODO Auto-generated constructor stub
	}
	@Override
    public void configureLanguageSpecificURIEditorOpener(com.google.inject.Binder binder) {
        binder.bind(IURIEditorOpener.class).annotatedWith(LanguageSpecific.class).to(SPEditorOpener.class);
    }
}
