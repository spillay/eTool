/**
 * 
 */
package com.dsleng.etool.dsl.egov.ui.handler;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.dialogs.IOverwriteQuery;
import org.eclipse.ui.wizards.datatransfer.FileSystemStructureProvider;
import org.eclipse.ui.wizards.datatransfer.ImportOperation;

/**
 * @author suresh
 *
 */
public class ProjectManager {
	public  void LoadProject(String baseDir,IProject project,List<Object> fileSystemObjects){
		String projectName = "EServices";
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
		
		
		
		IOverwriteQuery overwriteQuery = new IOverwriteQuery() {
	        public String queryOverwrite(String file) { return ALL; }
		};

		//String baseDir = // location of files to import
		
		ImportOperation importOperation = new ImportOperation(newProject.getFullPath(),
	        new File(baseDir), FileSystemStructureProvider.INSTANCE, overwriteQuery);
		importOperation.setCreateContainerStructure(false);
		importOperation.setOverwriteResources(true);
		importOperation.setCreateLinks(false);
		//importOperation.setFilesToImport(fileSystemObjects);
		try {
			importOperation.run(new NullProgressMonitor());
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void deleteDir(File file) {
	    File[] contents = file.listFiles();
	    if (contents != null) {
	        for (File f : contents) {
	            deleteDir(f);
	        }
	    }
	    file.delete();
	}
	public  void cleanUp(String path){
		File index = new File(path);
		String[]entries = index.list();
		for(String s: entries){
		    File currentFile = new File(index.getPath(),s);
		    deleteDir(currentFile);
		}
	}
}
