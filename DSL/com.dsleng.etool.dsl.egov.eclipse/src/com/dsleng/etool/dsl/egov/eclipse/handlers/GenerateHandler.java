/**
 * 
 */
package com.dsleng.etool.dsl.egov.eclipse.handlers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
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
public class GenerateHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;
			for (Iterator<Object> iterator = strucSelection.iterator(); iterator.hasNext();) {
				Object element = iterator.next();
				if ( element instanceof IFile){
					createEcore((IFile) element);
				}
				System.out.println(element.toString());
			}
		}
		return null;

	}

	private void createEcore(IFile input){
        Injector injector = new EGovDslStandaloneSetup().createInjectorAndDoEMFRegistration();
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

        System.out.println(input.getProjectRelativePath());
        System.out.println(input.getLocationURI());
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
        System.out.println(newUri.toString());
        Resource resEMF = resSet.createResource(newUri);
        EObject emfModel = EcoreUtil.copy(model);
        resEMF.getContents().add(emfModel);

        HashMap<String, Object> opts = new HashMap<String, Object>();
        opts.put(XMIResource.OPTION_SCHEMA_LOCATION, true);
        try {
                resEMF.save(opts);
        } catch (IOException e) {
                e.printStackTrace();
        }
        PFProject pT = new PFProject(emfModel);
        pT.Execute();

}


}
