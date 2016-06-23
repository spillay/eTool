/**
 * 
 */
package com.dsleng.etool.perspective.projects;



/**
 * @author suresh
 *
 */

import java.lang.reflect.InvocationTargetException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.util.IdUtil;
import org.eclipse.pde.internal.ui.*;
import org.eclipse.pde.internal.ui.elements.ElementList;
import org.eclipse.pde.internal.ui.wizards.*;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationOperation;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationPage;
import org.eclipse.pde.internal.ui.wizards.plugin.PluginContentPage;
import org.eclipse.pde.internal.ui.wizards.plugin.PluginFieldData;
import org.eclipse.pde.internal.ui.wizards.plugin.TemplateListSelectionPage;
import org.eclipse.pde.ui.IPluginContentWizard;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

@SuppressWarnings("restriction")
public abstract class SPPluginProject extends NewWizard implements IExecutableExtension {
	public static final String PLUGIN_POINT = "pluginContent"; //$NON-NLS-1$
	public static final String TAG_WIZARD = "wizard"; //$NON-NLS-1$
	public static final String DEF_PROJECT_NAME = "project_name"; //$NON-NLS-1$
	public static final String DEF_TEMPLATE_ID = "template-id"; //$NON-NLS-1$

	private IConfigurationElement fConfig;
	private PluginFieldData fPluginData;
	private IProjectProvider fProjectProvider;
	protected NewProjectCreationPage fMainPage;
	//protected PluginContentPage fContentPage;
	//private TemplateListSelectionPage fWizardListPage;

	public SPPluginProject() {
		setDefaultPageImageDescriptor(PDEPluginImages.DESC_NEWPPRJ_WIZ);
		setDialogSettings(PDEPlugin.getDefault().getDialogSettings());
		setWindowTitle(PDEUIMessages.NewProjectWizard_title);
		setNeedsProgressMonitor(true);
		fPluginData = new PluginFieldData();
	}

	public SPPluginProject(String osgiFramework) {
		this();
		fPluginData.setOSGiFramework(osgiFramework);
	}

	protected abstract void ProcessAdd(IProject proj);
	
	@Override
	public void addPages() {
		fMainPage = new NewProjectCreationPage("main", fPluginData, false, getSelection()); //$NON-NLS-1$
		fMainPage.setTitle(PDEUIMessages.NewProjectWizard_MainPage_title);
		fMainPage.setDescription(PDEUIMessages.NewProjectWizard_MainPage_desc);
		String pname = getDefaultValue(DEF_PROJECT_NAME);
		if (pname != null)
			fMainPage.setInitialProjectName(pname);
		addPage(fMainPage);

		fProjectProvider = new IProjectProvider() {
			@Override
			public String getProjectName() {
				return fMainPage.getProjectName();
			}

			@Override
			public IProject getProject() {
				return fMainPage.getProjectHandle();
			}

			@Override
			public IPath getLocationPath() {
				return fMainPage.getLocationPath();
			}
		};

		//fContentPage = new PluginContentPage("page2", fProjectProvider, fMainPage, fPluginData); //$NON-NLS-1$
		
		
		
		
		
		
		//fWizardListPage = new TemplateListSelectionPage(getAvailableCodegenWizards(), fContentPage, PDEUIMessages.WizardListSelectionPage_templates);
		//String tid = getDefaultValue(DEF_TEMPLATE_ID);
		//if (tid != null)
		//	fWizardListPage.setInitialTemplateId(tid);

		//addPage(fContentPage);
		//addPage(fWizardListPage);
	}

	@Override
	public boolean canFinish() {
		IWizardPage page = getContainer().getCurrentPage();
		return super.canFinish();// && page != fMainPage;
	}

	@Override
	public boolean performFinish() {
		try {
			fMainPage.updateData();
			//fContentPage.updateData();
			IDialogSettings settings = getDialogSettings();
			if (settings != null) {
				fMainPage.saveSettings(settings);
				//fContentPage.saveSettings(settings);
			}
			BasicNewProjectResourceWizard.updatePerspective(fConfig);

			// If the PDE models are not initialized, initialize with option to cancel
			if (!PDECore.getDefault().areModelsInitialized()) {
				try {
					getContainer().run(true, true, new IRunnableWithProgress() {
						@Override
						public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
							// Target reloaded method clears existing models (which don't exist currently) and inits them with a progress monitor
							PDECore.getDefault().getModelManager().targetReloaded(monitor);
							if (monitor.isCanceled()) {
								throw new InterruptedException();
							}
						}
					});
				} catch (InterruptedException e) {
					// Target platform will be empty, but project still can be created
				}
			}

			// Initialize info for manual input
			String id = IdUtil.getValidId(fProjectProvider.getProjectName());
			fPluginData.setId(id);
			fPluginData.setVersion("1.0.0.qualifier");
			fPluginData.setName(IdUtil.getValidName(id));
			fPluginData.setProvider(IdUtil.getValidProvider(id));
			
			fPluginData.setClassname(id + ".Activator");
			fPluginData.setUIPlugin(false);
			fPluginData.setDoGenerateClass(true);
			fPluginData.setRCPApplicationPlugin(false);
			fPluginData.setExecutionEnvironment(null);
			
			
			
			getContainer().run(false, true, new NewProjectCreationOperation(fPluginData, fProjectProvider,null ));

			IWorkingSet[] workingSets = fMainPage.getSelectedWorkingSets();
			if (workingSets.length > 0)
				getWorkbench().getWorkingSetManager().addToWorkingSets(fProjectProvider.getProject(), workingSets);

			ProcessAdd(fProjectProvider.getProject());
			return true;
		} catch (InvocationTargetException e) {
			PDEPlugin.logException(e);
		} catch (InterruptedException e) {
		}
		return false;
	}

	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
		fConfig = config;
	}

	protected WizardElement createWizardElement(IConfigurationElement config) {
		String name = config.getAttribute(WizardElement.ATT_NAME);
		String id = config.getAttribute(WizardElement.ATT_ID);
		String className = config.getAttribute(WizardElement.ATT_CLASS);
		if (name == null || id == null || className == null)
			return null;
		WizardElement element = new WizardElement(config);
		String imageName = config.getAttribute(WizardElement.ATT_ICON);
		if (imageName != null) {
			String pluginID = config.getNamespaceIdentifier();
			Image image = PDEPlugin.getDefault().getLabelProvider().getImageFromPlugin(pluginID, imageName);
			element.setImage(image);
		}
		return element;
	}

	public ElementList getAvailableCodegenWizards() {
		ElementList wizards = new ElementList("CodegenWizards"); //$NON-NLS-1$
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry.getExtensionPoint(PDEPlugin.getPluginId(), PLUGIN_POINT);
		if (point == null)
			return wizards;
		IExtension[] extensions = point.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			IConfigurationElement[] elements = extensions[i].getConfigurationElements();
			for (int j = 0; j < elements.length; j++) {
				if (elements[j].getName().equals(TAG_WIZARD)) {
					WizardElement element = createWizardElement(elements[j]);
					if (element != null) {
						wizards.add(element);
					}
				}
			}
		}
		return wizards;
	}

	public String getPluginId() {
		return fPluginData.getId();
	}

	public String getPluginVersion() {
		return fPluginData.getVersion();
	}

}


