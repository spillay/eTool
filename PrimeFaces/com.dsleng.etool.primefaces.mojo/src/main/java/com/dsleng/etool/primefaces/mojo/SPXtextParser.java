/**
 * 
 */
package com.dsleng.etool.primefaces.mojo;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.ParseException;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.dsleng.etool.dsl.egov.EGovDslRuntimeModule;
import com.dsleng.etool.models.egov.EgovPackage;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import static com.google.common.collect.Sets.newHashSet;
/**
 * @author suresh
 *
 */
public class SPXtextParser {
	 
	 @Inject
	 private XtextResourceSet resourceSet;
	 private Injector injector;
    
	 public SPXtextParser() {
        setupParser();
	 }
 
	 private void setupParser() {
    	//Injector injector = Guice.createInjector(new EGovDslRuntimeModule());
        //injector.injectMembers(this);
        
        new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
        injector = Guice.createInjector(new EGovDslRuntimeModule());
        injector.injectMembers(this);
        resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
  
    }
 
	 public Set<OutputConfiguration> getOutputConfigurations() {
			OutputConfiguration defaultOutput = new OutputConfiguration(
					IFileSystemAccess.DEFAULT_OUTPUT);
			defaultOutput.setDescription("Output folder for generated FXML files");
			defaultOutput.setOutputDirectory("src");
			defaultOutput.setOverrideExistingResources(true);
			defaultOutput.setCreateOutputDirectory(true);
			defaultOutput.setCanClearOutputDirectory(false);
			defaultOutput.setCleanUpDerivedResources(false);
			defaultOutput.setSetDerivedProperty(false);
			return newHashSet(defaultOutput);
	}
	 
	 public JavaIoFileSystemAccess getFileAccess(){
		 final JavaIoFileSystemAccess configuredFileSystemAccess=injector.getInstance(JavaIoFileSystemAccess.class);
		 configuredFileSystemAccess.setOutputPath("/Data/maventest");
		 OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
		    defaultOutput.setDescription("Output Folder");
		    defaultOutput.setOutputDirectory("/Data/maventest/src-gen");
		    defaultOutput.setOverrideExistingResources(true);
		    defaultOutput.setCreateOutputDirectory(true);
		    defaultOutput.setCleanUpDerivedResources(true);
		    defaultOutput.setSetDerivedProperty(true);
		 
		    Map<String, OutputConfiguration> mp = new HashMap<String, OutputConfiguration>();
		    mp.put("DEFAULT_OUTPUT", defaultOutput);
		    configuredFileSystemAccess.setOutputConfigurations(mp);
		 
		 return configuredFileSystemAccess;
	 }
	 /**
	     * Parses an input stream and returns the resulting object tree root element.
	     * @param in Input Stream
	     * @return Root model object
	     * @throws IOException When and I/O related parser error occurs
	     */
	    public EObject parse(InputStream in) throws IOException
	    {
	    	resourceSet.getPackageRegistry().put(EgovPackage.eNS_URI, EgovPackage.eINSTANCE);
	    	resourceSet.getPackageRegistry().put(".egv", EgovPackage.eINSTANCE);
	        
	        Resource resource = resourceSet.createResource(URI.createURI("dummy:/inmemory.egv"));
	        
	        resource.load(in, resourceSet.getLoadOptions());
	        return resource.getContents().get(0);
	    }
	 
	    /**
	     * Parses a resource specified by an URI and returns the resulting object tree root element.
	     * @param uri URI of resource to be parsed
	     * @return Root model object
	     */
	    public EObject parse(URI uri) {
	        Resource resource = resourceSet.getResource(uri, true);
	        return resource.getContents().get(0);
	    }
	 
}