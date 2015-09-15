/**
 * 
 */
package com.dsleng.etool.semantic.eclipse.handlers;



import java.util.Iterator;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dsleng.etool.maven.Manager;


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
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;
			for (Iterator<Object> iterator = strucSelection.iterator(); iterator.hasNext();) {
				Object element = iterator.next();
				if ( element instanceof IFile){
					System.out.println("Generate Primefaces Project");
					logger.info("Need to Generate Primefaces");
					logger.debug("Hello World!");
					
						logger.info("Info");
					
						logger.warn("warning!");
					
						logger.error("error");
						Manager pT = new Manager("/Data/test/bd/");
						pT.Execute();
				}
				System.out.println(element.toString());
			}
		}
		return null;
	}


}
