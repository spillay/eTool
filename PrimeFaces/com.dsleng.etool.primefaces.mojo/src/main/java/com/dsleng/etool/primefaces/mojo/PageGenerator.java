/**
 * 
 */
package com.dsleng.etool.primefaces.mojo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;

import com.dsleng.etool.dsl.egov.EGovDslRuntimeModule;
import com.dsleng.etool.dsl.egov.EGovDslStandaloneSetup;
import com.dsleng.etool.models.egov.EgovPackage;
import com.dsleng.etool.models.egov.impl.EgovFactoryImpl;
import com.dsleng.etool.primefaces.semantics.BOGenerator;
import com.dsleng.etool.primefaces.semantics.EgovGenerator;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author suresh
 *
 */
@Mojo(name = "PageGen")
public class PageGenerator extends AbstractMojo {

	@Parameter(property = "PageGen.baseDir", defaultValue = "src/main/webapp/")
	private String baseDir;

	@Parameter
	private File dslFile;

	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("Generating Pages");
		if (dslFile == null) {
			getLog().info(
					"Generating Pages: No dslFile Parameter add <configuration><dslFile>dsl/egov.egv</dslFile></configuration>");
		} else {
			// Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(".egv",
			// new EgovFactoryImpl());
			EgovPackage.eINSTANCE.eClass();

			// EgovPackage.eINSTANCE.eNS_URI

			if (!EPackage.Registry.INSTANCE.containsKey(EgovPackage.eNS_URI)) {
				EPackage.Registry.INSTANCE.put(EgovPackage.eNS_URI, EgovPackage.eINSTANCE);
			}

			SPXtextParser pT = new SPXtextParser();
			FileReader in;
			EObject obj = null;
			try {
				in = new FileReader(dslFile);
				FileInputStream in2 = new FileInputStream(dslFile);
				getLog().info("before:SuccessFully Parsed DSL");
				// obj = pT.parse(in2);
				obj = pT.parse(URI.createURI(dslFile.getAbsolutePath()));
				getLog().info("SuccessFully Parsed DSL");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (obj == null) {
				getLog().info(
						"Generating Pages: Could not generate model");
			} else {
				
				EgovGenerator gen = new EgovGenerator();
				gen.doGenerate(obj.eResource(), pT.getFileAccess("src/main/webapp"));
				
				BOGenerator boGen = new BOGenerator("za.co.egov");
				boGen.doGenerate(obj.eResource(), pT.getFileAccess("src/main/java/"));
				
			}
		}

	}

	private void createFile(String name, String content) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(baseDir + name, "UTF-8");
			writer.println(content);
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
