/**
 * 
 */
package com.dsleng.etool.perspective.projects;

import org.eclipse.core.resources.IProject;

import com.dsleng.etool.perspective.SPConsoleManager;

/**
 * @author suresh
 *
 */
public class BusDomainProject extends SPPluginProject {

	@Override
	protected void ProcessAdd(IProject proj) {
		SPConsoleManager.getInstance().Debug("Processing additional customizations for: " + proj.getName());
		
	}

}
