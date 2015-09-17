/**
 * 
 */
package com.dsleng.etool.semantic.eclipse.handlers;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.IOverwriteQuery;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dsleng.etool.external.maven.Manager;

import org.eclipse.ui.wizards.datatransfer.FileSystemStructureProvider;
import org.eclipse.ui.wizards.datatransfer.ImportOperation;

/**
 * @author suresh
 *
 */
public class WAGen extends AbstractHandler {

	final Logger logger = LoggerFactory.getLogger(WAGen.class);

	public WAGen() {
		super();
		PropertyConfigurator.configure("/Data/dev-eclipse/configuration/log4j.properties");
	}

	private void ImportProjects(IProject project,String baseDir,String artifactId) {
		IOverwriteQuery overwriteQuery = new IOverwriteQuery() {
			public String queryOverwrite(String file) {
				return ALL;
			}
		};
		
		String projectName = "Generated-Projects";
		IWorkspace workspace = project.getWorkspace();
		IProjectDescription newProjectDescription = workspace.newProjectDescription(projectName);
		IProject newProject = workspace.getRoot().getProject(projectName);
		try {
			newProject.create(newProjectDescription, null);
			newProject.open(null);
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		


		//String baseDir = project.getWorkspace().getRoot().getLocation().toOSString();
		IPath container = newProject.getFullPath();
		ImportOperation importOperation = new ImportOperation(container, new File(baseDir),
				FileSystemStructureProvider.INSTANCE, overwriteQuery);
		
		ArrayList<File> projNames = new ArrayList<File>();
		projNames.add(new File(baseDir + IPath.SEPARATOR + artifactId)); 
		projNames.add(new File(baseDir + IPath.SEPARATOR + artifactId + ".parent"));
		projNames.add(new File(baseDir + IPath.SEPARATOR + artifactId + ".ui"));
		projNames.add(new File(baseDir + IPath.SEPARATOR + artifactId + ".sdk"));
		projNames.add(new File(baseDir + IPath.SEPARATOR + artifactId + ".tests"));
		importOperation.setFilesToImport(projNames);
		importOperation.setCreateContainerStructure(false);
		try {
			importOperation.run(new NullProgressMonitor());
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;
			for (Iterator<Object> iterator = strucSelection.iterator(); iterator.hasNext();) {
				Object element = iterator.next();
				if (element instanceof IFile) {
					System.out.println("Generate Primefaces Project");

					String path = ((IFile) element).getProject().getLocation().toString();
					String npath = ((IFile) element).getProject().getWorkspace().getRoot().getLocation().toOSString();

					npath = "/Data/maventest/";
					
					/*
					Manager pT = new Manager(npath);

					pT.createLangProj("com.dsleng.atool", "com.dsleng.atool.xtext", "1.0.0-SNAPSHOT", "Dsl", "vwx",
							"platform:/resource/com.dsleng.etool.presentation/model/view.genmodel",
							"com.dsleng.etool.presentation.view.ViewPackage",
							"http://com/dsleng/etool/presentation/view/", "com.dsleng.etool.presentation");
					*/
					ImportProjects(((IFile) element).getProject(),npath,"com.dsleng.atool.xtext");
				}
				System.out.println(element.toString());
			}
		}
		return null;
	}

}
