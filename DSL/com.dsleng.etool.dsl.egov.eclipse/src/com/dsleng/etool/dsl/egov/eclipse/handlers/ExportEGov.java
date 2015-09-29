/**
 * 
 */
package com.dsleng.etool.dsl.egov.eclipse.handlers;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.dsleng.etool.dsl.egov.EGovDslStandaloneSetup;
import com.dsleng.etool.dsl.egov.eclipse.generators.PFProject;
import com.google.inject.Injector;

/**
 * @author suresh
 *
 */
public class ExportEGov extends AbstractHandler {

	private MessageConsole myConsole;
	private String consoleName = "DSLEngConsole";
	private MessageConsoleStream log;
	
	private void InitLog(ExecutionEvent event){
		myConsole = findConsole(consoleName);
		log = myConsole.newMessageStream();
		
		String id = IConsoleConstants.ID_CONSOLE_VIEW;
		IConsoleView view;
		try {
			view = (IConsoleView) HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().showView(id);
			view.display(myConsole);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private MessageConsole findConsole(String name) {
	      ConsolePlugin plugin = ConsolePlugin.getDefault();
	      IConsoleManager conMan = plugin.getConsoleManager();
	      IConsole[] existing = conMan.getConsoles();
	      for (int i = 0; i < existing.length; i++)
	         if (name.equals(existing[i].getName()))
	            return (MessageConsole) existing[i];
	      //no console found, so create a new one
	      MessageConsole myConsole = new MessageConsole(name, null);
	      conMan.addConsoles(new IConsole[]{myConsole});
	      return myConsole;
	}
	private void Debug(String mesg){
		log.println("Debug:" + mesg);
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;
			for (Iterator<Object> iterator = strucSelection.iterator(); iterator.hasNext();) {
				Object element = iterator.next();
				if ( element instanceof IFile){
					InitLog(event);
					log.println("Starting to Export EGov DSL to Model");
					log.println("Processing File: " + ((IFile) element).getName());
					createEcore((IFile) element);
					log.println("Completed Process: " + ((IFile) element).getName());
					try {
						ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
						log.println("WorkSpace Refreshed");
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					log.println("Unable to Process: " + element.toString() + "Expected File of type .egv");
				}
			}
		}
		return null;
	}
	private void createEcore(IFile input){
        Injector injector = new EGovDslStandaloneSetup().createInjectorAndDoEMFRegistration();
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

        Debug(input.getProjectRelativePath().toString());
        Debug(input.getLocationURI().toString());
        URI uri = URI.createURI(input.getLocationURI().toString());
        Resource resource = resourceSet.getResource(uri, true);
        EObject model = resource.getContents().get(0);

       
        String fileName = input.getLocationURI().toString();
        fileName = fileName.replace(".egv", ".egv.xmi");

        ResourceSet resSet = new ResourceSetImpl();
        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                        Resource.Factory.Registry.DEFAULT_EXTENSION,
                        new XMIResourceFactoryImpl());
        URI newUri = URI.createURI(fileName);
        Debug(newUri.toString());
        
        Resource resEMF = resSet.createResource(newUri);
        EObject emfModel = EcoreUtil.copy(model);
        resEMF.getContents().add(emfModel);

        HashMap<String, Object> opts = new HashMap<String, Object>();
        opts.put(XMIResource.OPTION_SCHEMA_LOCATION, true);
        try {
                resEMF.save(opts);
        } catch (IOException e) {
        	Debug(e.getMessage());
        	e.printStackTrace();
        }

	}
	

}
