/**
 * 
 */
package com.dsleng.etool.perspective;

import javax.annotation.Resource;

import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

/**
 * @author suresh
 *
 */
public class SPConsoleManager {
	private MessageConsole myConsole;
	private String consoleName = "DSLEngConsole";
	private MessageConsoleStream log;
	private boolean debug;

	private static SPConsoleManager instance = null;

	public static SPConsoleManager getInstance() {
		if (instance == null) {
			instance = new SPConsoleManager();
		}
		return instance;
	}

	private SPConsoleManager() {
		debug = true;
		InitLog();
	}

	private void InitLog() {
		myConsole = findConsole(consoleName);
		log = myConsole.newMessageStream();

		String id = IConsoleConstants.ID_CONSOLE_VIEW;
		IConsoleView view;
		try {
			IWorkbench wb = PlatformUI.getWorkbench();
			IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
			IWorkbenchPage page = win.getActivePage();
			view = (IConsoleView) page.showView(id);
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
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

	public void Debug(String mesg) {
		if ( debug ){
			log.println("Debug:" + mesg);
		}
	}
	public void Info(String mesg) {
		log.println("Info:" + mesg);
	}

}
