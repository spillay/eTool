/**
 * 
 */
package com.dsleng.etool.perspective.projects;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.core.ClasspathAttribute;
import org.eclipse.jdt.internal.core.ClasspathEntry;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.pde.internal.core.project.PDEProject;


import com.dsleng.etool.perspective.SPConsoleManager;

/**
 * @author suresh
 *
 */
@SuppressWarnings("restriction")
public class SPProject {
	public static final String ISO_8859_1 = "iso-8859-1";
	private static boolean isMavenProject;

	public static IProject createPluginProject(final String projectName, final List<String> srcFolders,
			final List<IProject> referencedProjects, final List<String> requiredBundles,
			final List<String> exportedPackages, final IProgressMonitor progressMonitor, final Shell theShell) {
		IProject project = null;
		isMavenProject = true;
		try {
			progressMonitor.beginTask("", 10);
			progressMonitor.subTask("Creating project " + projectName);
			final IWorkspace workspace = ResourcesPlugin.getWorkspace();
			project = workspace.getRoot().getProject(projectName);

			// Clean up any old project information.
			if (project.exists()) {
				final boolean[] result = new boolean[1];
				PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
					public void run() {
						result[0] = MessageDialog.openQuestion(theShell, "Do you want to overwrite the project "
								+ projectName, "Note that everything inside the project '" + projectName
								+ "' will be deleted if you confirm this dialog.");
					}
				});
				if (result[0]) {
					project.delete(true, true, new SubProgressMonitor(progressMonitor, 1));
				}
				else
					return null;
			}

			final IJavaProject javaProject = JavaCore.create(project);
			final IProjectDescription projectDescription = ResourcesPlugin.getWorkspace().newProjectDescription(
					projectName);
			projectDescription.setLocation(null);
			project.create(projectDescription, new SubProgressMonitor(progressMonitor, 1));
			final List<IClasspathEntry> classpathEntries = new ArrayList<IClasspathEntry>();
			if (referencedProjects.size() != 0) {
				projectDescription.setReferencedProjects(referencedProjects.toArray(new IProject[referencedProjects
				                                                                                 .size()]));
				for (final IProject referencedProject : referencedProjects) {
					final IClasspathEntry referencedProjectClasspathEntry = JavaCore.newProjectEntry(referencedProject
							.getFullPath());
					classpathEntries.add(referencedProjectClasspathEntry);
				}
			}

			projectDescription.setNatureIds(new String[] { JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature" });

			final ICommand java = projectDescription.newCommand();
			java.setBuilderName(JavaCore.BUILDER_ID);

			final ICommand manifest = projectDescription.newCommand();
			manifest.setBuilderName("org.eclipse.pde.ManifestBuilder");

			final ICommand schema = projectDescription.newCommand();
			schema.setBuilderName("org.eclipse.pde.SchemaBuilder");

			//final ICommand oaw = projectDescription.newCommand();
			//oaw.setBuilderName(OawBuilder.getBUILDER_ID());

			//projectDescription.setBuildSpec(new ICommand[] { java, manifest, schema, oaw });
			projectDescription.setBuildSpec(new ICommand[] { java, manifest, schema });

			project.open(new SubProgressMonitor(progressMonitor, 1));
			project.setDescription(projectDescription, new SubProgressMonitor(progressMonitor, 1));

			Collections.reverse(srcFolders);
			for (final String src : srcFolders) {
				final IFolder srcContainer = project.getFolder(src);
				if (!srcContainer.exists()) {
					srcContainer.create(true, true, new SubProgressMonitor(progressMonitor, 1));
				}
				final IClasspathEntry srcClasspathEntry = JavaCore.newSourceEntry(srcContainer.getFullPath());
				classpathEntries.add(srcClasspathEntry);
			}

			classpathEntries
					.add(JavaCore
							.newContainerEntry(new Path(
									"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/J2SE-1.8")));
			classpathEntries.add(JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")));
			
			if (requiredBundles != null && !requiredBundles.isEmpty()) {
				for (int i = 0, x = requiredBundles.size(); i < x; i++) {
					classpathEntries.add(JavaCore.newContainerEntry(new Path(
							"org.eclipse.jdt.launching.JRE_CONTAINER/" + requiredBundles.get(i))));
				}
			}
			if (isMavenProject)
			{
			   //final IClasspathEntry mavenDependencies = JavaCore.newContainerEntry(new Path("org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER"), ClasspathEntry.NO_ACCESS_RULES, new IClasspathAttribute[] { new ClasspathAttribute("maven.pomderived", "true") }, false);
			   //classpathEntries.add(mavenDependencies);
			}
			
			javaProject.setRawClasspath(classpathEntries.toArray(new IClasspathEntry[classpathEntries.size()]),
					new SubProgressMonitor(progressMonitor, 1));

			javaProject.setOutputLocation(new Path("/" + projectName + "/bin"), new SubProgressMonitor(progressMonitor,
					1));
			
			
			for(int i=0; i < javaProject.getRawClasspath().length;i++){
				SPConsoleManager.getInstance().Debug(javaProject.getRawClasspath()[i].getPath().toString());
			}
			
			createManifest(projectName, requiredBundles, exportedPackages, progressMonitor, project);
			createBuildProps(progressMonitor, project, srcFolders);
			createActivator(projectName,project.getFolder("src"),javaProject);
			addNature(project,JavaCore.NATURE_ID);
			addNature(project,"org.eclipse.pde.PluginNature");
			if (isMavenProject)
			{
				addNature(project,"org.eclipse.m2e.core.maven2Nature");
			}
			IClasspathEntry[] res = javaProject.getResolvedClasspath(true);
			for(int i=0; i < res.length; i++){
				SPConsoleManager.getInstance().Debug(res[i].getPath().toString());
			}
			
		}
		catch (final Exception exception) {
			exception.printStackTrace();
			SPConsoleManager.getInstance().Debug(exception.getMessage());
		}
		finally {
			progressMonitor.done();
		}
		
		return project;
	}
	private static void addNature(IProject project,String nature) throws CoreException {
		if (!project.hasNature(nature)) {
			IProjectDescription description = project.getDescription();
			String[] prevNatures = description.getNatureIds();
			String[] newNatures = new String[prevNatures.length + 1];
			System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
			newNatures[prevNatures.length] = nature;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
		}
	}
	

	public static IFile createFile(final String name, final IContainer container, final String content,
			final IProgressMonitor progressMonitor) {
		final IFile file = container.getFile(new Path(name));
		assertExist(file.getParent());
		try {
			final InputStream stream = new ByteArrayInputStream(content.getBytes(file.getCharset()));
			if (file.exists()) {
				file.setContents(stream, true, true, progressMonitor);
			}
			else {
				file.create(stream, true, progressMonitor);
			}
			stream.close();
		}
		catch (final Exception e) {
			SPConsoleManager.getInstance().Debug(e.getMessage());
		}
		progressMonitor.worked(1);

		return file;
	}

	public static IFile createFile(final String name, final IContainer container, final String content,
			final String charSet, final IProgressMonitor progressMonitor) throws CoreException {
		final IFile file = createFile(name, container, content, progressMonitor);
		if (file != null && charSet != null) {
			file.setCharset(charSet, progressMonitor);
		}

		return file;
	}

	private static void createBuildProps(final IProgressMonitor progressMonitor, final IProject project,
			final List<String> srcFolders) {
		final StringBuilder bpContent = new StringBuilder("source.. = ");
		for (final Iterator<String> iterator = srcFolders.iterator(); iterator.hasNext();) {
			bpContent.append(iterator.next()).append('/');
			if (iterator.hasNext()) {
				bpContent.append(",");
			}
		}
		bpContent.append("\n");
		bpContent.append("bin.includes = META-INF/,.\n");
		createFile("build.properties", project, bpContent.toString(), progressMonitor);
	}

	private static void createManifest(final String projectName, final List<String> requiredBundles,
			final List<String> exportedPackages, final IProgressMonitor progressMonitor, final IProject project)
	throws CoreException {
		final StringBuilder maniContent = new StringBuilder("Manifest-Version: 1.0\n");
		maniContent.append("Bundle-ManifestVersion: 2\n");
		maniContent.append("Bundle-Name: " + projectName + "\n");
		maniContent.append("Bundle-SymbolicName: " + projectName + "; singleton:=true\n");
		maniContent.append("Bundle-Version: 1.0.0\n");
		maniContent.append("Bundle-Activator: " + projectName + ".Activator\n");
		// maniContent.append("Bundle-Localization: plugin\n");
		if (requiredBundles != null && !requiredBundles.isEmpty()) {
			maniContent.append("Require-Bundle: " + requiredBundles.get(0));
			for (int i = 1, x = requiredBundles.size(); i < x; i++) {
				maniContent.append(",\n " + requiredBundles.get(i));
			}
			maniContent.append("\n");
		}

		if (exportedPackages != null && !exportedPackages.isEmpty()) {
			maniContent.append("Export-Bundle: " + exportedPackages.get(0));
			for (int i = 1, x = exportedPackages.size(); i < x; i++) {
				maniContent.append(",\n " + exportedPackages.get(i));
			}
			maniContent.append("\n");
		}
		maniContent.append("Bundle-RequiredExecutionEnvironment: JavaSE-1.8\r\n");

		final IFolder metaInf = project.getFolder("META-INF");
		metaInf.create(false, true, new SubProgressMonitor(progressMonitor, 1));
		createFile("MANIFEST.MF", metaInf, maniContent.toString(), progressMonitor);
	}
	protected static void createActivator(String projectName,IFolder srcContainer,IJavaProject javaProject) throws Exception
    {
		if ( srcContainer.exists() ){
			IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(srcContainer);
			root.open(new NullProgressMonitor());
			IPackageFragment pack = root.createPackageFragment(projectName, true, null);
		
			String sourceFolderPath = "resources/";
			String content = FileGenerator.getContents(sourceFolderPath,
                "Activator.tpl",
                SPProject.class);
	        content = content.replaceAll("##package##", pack.getElementName());
	        content = content.replaceAll("##pluginid##", pack.getElementName());
	        StringBuffer buffer = new StringBuffer();
	        buffer.append(content);
	        ICompilationUnit cu = pack.createCompilationUnit("Activator.java", buffer.toString(), false, null);
		}
        //FileGenerator.createFile("Activator.java",
          //                       pluginProject.getFolder("src"),
            //                     content,
              //                   new NullProgressMonitor());

    }


	/**
	 * @param name
	 *            of the destination file
	 * @param container
	 *            directory containing the the destination file
	 * @param contentUrl
	 *            Url pointing to the src of the content
	 * @param progressMonitor
	 *            used to interact with and show the user the current operation
	 *            status
	 * @return
	 */
	public static IFile createFile(final String name, final IContainer container, final URL contentUrl,
			final IProgressMonitor progressMonitor) {

		final IFile file = container.getFile(new Path(name));
		InputStream inputStream = null;
		try {
			inputStream = contentUrl.openStream();
			if (file.exists()) {
				file.setContents(inputStream, true, true, progressMonitor);
			}
			else {
				file.create(inputStream, true, progressMonitor);
			}
			inputStream.close();
		}
		catch (final Exception e) {
			SPConsoleManager.getInstance().Debug(e.getMessage());
		}
		finally {
			if (null != inputStream) {
				try {
					inputStream.close();
				}
				catch (final IOException e) {
					SPConsoleManager.getInstance().Debug(e.getMessage());
				}
			}
		}
		progressMonitor.worked(1);

		return file;
	}

	private static void assertExist(final IContainer c) {
		if (!c.exists()) {
			if (!c.getParent().exists()) {
				assertExist(c.getParent());
			}
			if (c instanceof IFolder) {
				try {
					((IFolder) c).create(false, true, new NullProgressMonitor());
				}
				catch (final CoreException e) {
					SPConsoleManager.getInstance().Debug(e.getMessage());
				}
			}

		}

	}

	public static void openFileToEdit(final Shell s, final IFile file) {
		/*
		s.getDisplay().asyncExec(new Runnable() {
			public void run() {
				final IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					//IDE.openEditor(page, file, true);
				}
				catch (final PartInitException e) {
					SPConsoleManager.getInstance().Debug(e.getMessage());
				}
			}
		});
		*/
	}
}
