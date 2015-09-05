/**
 * 
 */
package com.dsleng.etool.perspective;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.internal.ui.javaeditor.ASTProvider;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;
import org.eclipse.jdt.ui.CodeGeneration;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.PlatformUI;

/**
 * @author suresh
 *
 */
public class MenuPopulationClass extends ContributionItem {

	
	

	protected static final String lineDelimiter = "\n";

	MenuItem menuBar;

	MenuItem domainMenu, viewMenu, securityMenu, compMenu,brMenu;

	public MenuPopulationClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 */
	public MenuPopulationClass(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void fill(Menu menu, int index) {
		//Here you could get selection and decide what to do
		//You can also simply return if you do not want to show a menu
	
			menuBar = new MenuItem(menu, SWT.CASCADE);
			menuBar.setText("E-Government");
			
			Menu eMenu = new Menu(menu);
			menuBar.setMenu(eMenu);
			
			
			
			domainMenu = new MenuItem(menuBar.getMenu(), SWT.PUSH);
			domainMenu.setText("Generate Domain Model Infrastructure");
			
			domainMenu.addSelectionListener(new SelectionListener() {
				
				@Override
				public void widgetSelected(SelectionEvent e) {
					System.err.println("Selected Domain Menu");
					
					IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
					IProject project = root.getProject("Simple");
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
						
						
						
						ICompilationUnit cu = pack.createCompilationUnit("SimpleCls.java", buffer.toString(), false, null);

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
				
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
					
			viewMenu = new MenuItem(menuBar.getMenu(), SWT.PUSH);
			viewMenu.setText("Select View Model");
	        
	        securityMenu = new MenuItem(menuBar.getMenu(), SWT.PUSH);
	        securityMenu.setText("Select Security Model");
	        
	        compMenu = new MenuItem(menuBar.getMenu(), SWT.PUSH);
	        compMenu.setText("Generate Composition Model Infrastructure");
	        
	        brMenu = new MenuItem(menuBar.getMenu(), SWT.PUSH);
	        brMenu.setText("Generate Business Rules Infrastructure");
			
	       
		/*
		MenuItem egovMenu = new MenuItem(menu, SWT.PUSH,index);
		egovMenu.setText("E-government Services");
		
		
		//create the menu item
		MenuItem menuItem = new MenuItem(menu, SWT.CHECK, index);
		menuItem.setText("My menu item (" + new Date() + ")");
		menuItem.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				//what to do when menu is subsequently selected.
				System.err.println("Dynamic menu selected");
			}
		});
		*/
		
		
	}

}
