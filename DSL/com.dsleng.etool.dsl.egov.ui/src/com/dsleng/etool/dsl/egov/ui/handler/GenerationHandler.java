/**
 * 
 */
package com.dsleng.etool.dsl.egov.ui.handler;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

import com.dsleng.etool.models.egov.BOMapper;
import com.dsleng.etool.models.egov.EService;
import com.dsleng.etool.perspective.SPConsoleManager;
import com.google.common.collect.Iterables;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Provider;



/**
 * @author suresh
 *
 */
public class GenerationHandler extends AbstractHandler implements IHandler {

	@Inject
    private IGenerator generator;
 
    @Inject
    private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;
     
    @Inject
    IResourceDescriptions resourceDescriptions;
     
    @Inject
    IResourceSetProvider resourceSetProvider;
     
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
         
    	SPConsoleManager.getInstance().Info("Execution of Generation");
        IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
        IFile file = (IFile) activeEditor.getEditorInput().getAdapter(IFile.class);
        if (file != null) {
            IProject project = file.getProject();
            IFolder srcGenFolder = project.getFolder("src-gen");
            if (!srcGenFolder.exists()) {
                try {
                    srcGenFolder.create(true, true,
                            new NullProgressMonitor());
                } catch (CoreException e) {
                    return null;
                }
            }
           
            String tmpPath = "/Data/maventest/";
            String path = file.getWorkspace().getRoot().getLocation().toOSString();
            final JavaIoFileSystemAccess fsa2 = this.getFileAccess(tmpPath);
            
            final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
            fsa.setProject(project);
   
            //fsa.setOutputPath(srcGenFolder.getFullPath().toString());
            fsa.setOutputPath(path);
            fsa.setMonitor(new NullProgressMonitor());
            
            Map<String, OutputConfiguration> oc = fsa.getOutputConfigurations();
            
            Iterator<Entry<String, OutputConfiguration>> it = oc.entrySet().iterator();
           
            //make a new Outputconfiguration <- needed
            while(it.hasNext()){
           
              Entry<String, OutputConfiguration> next = it.next();
              OutputConfiguration out = next.getValue();
              out.isOverrideExistingResources();
              out.setCreateOutputDirectory(true); // <--- do not touch this
           
            }
            ProjectManager pM = new ProjectManager();
            if (activeEditor instanceof XtextEditor) {
                ((XtextEditor)activeEditor).getDocument().readOnly(new IUnitOfWork<Boolean, XtextResource>() {
                 
                    @Override
                    public Boolean exec(XtextResource state)
                            throws Exception {
                    	TreeIterator<EObject> _allContents = state.getAllContents();
                        Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
                        Iterable<EService> _filter = Iterables.<EService>filter(_iterable, EService.class);
                        
                        
                        SPConsoleManager.getInstance().Info("Creating Base Project");
                        pM.cleanUp(tmpPath);
                        PFProject pF = new PFProject(tmpPath);
                        for (final EService e : _filter) {
                        	pF.Execute(e,"#input#");
                        }
                        SPConsoleManager.getInstance().Info("Completed Base Project");
                        generator.doGenerate(state, fsa2);
                        //pF.Eclisify();
                        
                        //List<Object> fileSystemObjects = new ArrayList<Object>();
                        //fileSystemObjects.add(pF.getProjectName());
                        //pM.LoadProject(tmpPath, project,fileSystemObjects);
                        
                        SPConsoleManager.getInstance().Info("Deploying to WildFly");
                        pF.Deploy();
                        SPConsoleManager.getInstance().Info("Deployment to WildFly Completed");
                        return Boolean.TRUE;
                    }
                });
                 
            }
        }
        return null;
    }
 
    public JavaIoFileSystemAccess getFileAccess(String path){
    	JavaIoFileSystemAccess configuredFileSystemAccess = new JavaIoFileSystemAccess();
		Guice.createInjector(new AbstractGenericModule() {
			public Class<? extends IEncodingProvider> bindIEncodingProvider() {
				return IEncodingProvider.Runtime.class;
			}
		}).injectMembers(configuredFileSystemAccess);
        //final JavaIoFileSystemAccess configuredFileSystemAccess=injector.getInstance(JavaIoFileSystemAccess.class);
        //configuredFileSystemAccess.setOutputPath("/Data/maventest");
        OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
           defaultOutput.setDescription("Output Folder");
           defaultOutput.setOutputDirectory(path);
           defaultOutput.setOverrideExistingResources(true);
           defaultOutput.setCreateOutputDirectory(true);
           defaultOutput.setCleanUpDerivedResources(true);
           defaultOutput.setSetDerivedProperty(true);

           Map<String, OutputConfiguration> mp = new HashMap<String, OutputConfiguration>();
           mp.put("DEFAULT_OUTPUT", defaultOutput);
           configuredFileSystemAccess.setOutputConfigurations(mp);

        return configuredFileSystemAccess;	
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
 

}
