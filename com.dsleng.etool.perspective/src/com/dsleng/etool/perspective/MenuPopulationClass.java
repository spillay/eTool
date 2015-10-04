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
					SimpleProjectMgr pT = new SimpleProjectMgr();
					SPConsoleManager.getInstance().Info("Creating Domain Infrastructure Project");
					pT.createProj("Simple");
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
