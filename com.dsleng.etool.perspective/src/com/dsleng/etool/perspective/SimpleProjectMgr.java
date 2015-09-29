/**
 * 
 */
package com.dsleng.etool.perspective;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;

/**
 * @author suresh
 *
 */
public class SimpleProjectMgr {
	public void createProj(String name){
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(name);
		try {
			project.create(null);
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			project.open(null);
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		IProjectDescription description;
		try {
			description = project.getDescription();
			description.setNatureIds(new String[] { JavaCore.NATURE_ID });
			project.setDescription(description, null);
			IJavaProject javaProject = JavaCore.create(project); 
			
			IFolder binFolder = project.getFolder("bin");
			binFolder.create(false, true, null);
			javaProject.setOutputLocation(binFolder.getFullPath(), null);
			
			
			List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
			IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
			LibraryLocation[] locations = JavaRuntime.getLibraryLocations(vmInstall);
			for (LibraryLocation element : locations) {
			 entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
			}
			//add libs to project class path
			javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);


			IFolder sourceFolder = project.getFolder("src");
			sourceFolder.create(false, true, null);
			
			IFolder modelFolder = project.getFolder("model");
			modelFolder.create(false, true, null);
			
			ConsoleManager.getInstance().Debug("Before egov.egv creation");
			
			IPackageFragmentRoot frag = javaProject.getPackageFragmentRoot(modelFolder);
			IFile newFile = modelFolder.getFile("egov.egv");
			InputStream is = SimpleProjectMgr.class.getResourceAsStream("/egov.egv");
			newFile.create(is, true, null);
			
			IFile newFile2 = modelFolder.getFile("primefaces.ctl");
			InputStream is2 = SimpleProjectMgr.class.getResourceAsStream("/primefaces.ctl");
			newFile2.create(is2, true, null);
			
			
			/*
			IPackageFragmentRoot packroot = javaProject.getPackageFragmentRoot(sourceFolder);
			IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
			IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
			System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
			newEntries[oldEntries.length] = JavaCore.newSourceEntry(packroot.getPath());
			javaProject.setRawClasspath(newEntries, null);

			
			// Create a class
			IPackageFragment pack = javaProject.getPackageFragmentRoot(sourceFolder).createPackageFragment("com.dsleng.sample", false, null);
			
			StringBuffer buffer = new StringBuffer();
			buffer.append("package " + pack.getElementName() + ";\n");
			buffer.append("\n");
			buffer.append("Empty Class Container");
			*/
			
			
			//ICompilationUnit cu = pack.createCompilationUnit("SimpleCls.java", buffer.toString(), false, null);

			/*
			String fileComment = lineDelimiter;
	        String typeComment = lineDelimiter;
	        
	        String content = CodeGeneration.getCompilationUnitContent(cu, fileComment, typeComment, "", lineDelimiter);
	        if (content != null) {
	            ASTParser parser = ASTParser.newParser(ASTProvider.SHARED_AST_LEVEL);
	            parser.setProject(cu.getJavaProject());
	            parser.setSource(content.toCharArray());
	            CompilationUnit unit = (CompilationUnit) parser.createAST(null);
	            if ((pack.isDefaultPackage() || unit.getPackage() != null) && !unit.types().isEmpty()) {
	                //return content;
	            }
	        }
	        StringBuffer buf = new StringBuffer();
	        */
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}