/**
 * 
 */
package com.dsleng.etool.perspective.projects;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

/**
 * @author suresh
 *
 */
public class SPProjectUtil {

	public void LoadProject(String PROJECT_PATH){
		IProjectDescription description = null;
	    try {
	      description = ResourcesPlugin.getWorkspace().loadProjectDescription(new Path(PROJECT_PATH + "/.project")); //$NON-NLS-1$ 
	      IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
	      project.create(description, null);
	      project.open(null);
	    } catch (CoreException exception_p) {
	      exception_p.printStackTrace();
	    }
	}
	
}
