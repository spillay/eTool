/**
 * 
 */
package com.dsleng.etool.external.maven;

/**
 * @author suresh
 *
 */
import java.io.File;
import java.util.Collections;
import java.util.Properties;

import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.InvocationRequest;
import org.apache.maven.shared.invoker.InvocationResult;
import org.apache.maven.shared.invoker.Invoker;
import org.apache.maven.shared.invoker.MavenInvocationException;

public class SPPrimefacesGen {
	private String archetypeVersion;
	private String baseDirectory;
	
	public SPPrimefacesGen(String baseDir) {
		setBaseDirectory(baseDir);
		setArchetypeVersion("1.0.0-SNAPSHOT");
	}

	
	public void createBaseProj(String groupId,String artifactId,String version){
			InvocationRequest request = new DefaultInvocationRequest();
			//request.setPomFile( new File( "/path/to/pom.xml" ) );
			request.setGoals( Collections.singletonList( "archetype:generate" ) );
			
			request.setInteractive(false);
	        Properties properties = new Properties();
	        properties.setProperty("groupId", groupId);
	        properties.setProperty("artifactId", artifactId);
	        properties.setProperty("archetypeVersion", archetypeVersion);
	        properties.setProperty("archetypeGroupId", "com.dsleng.archetype");
	        properties.setProperty("archetypeArtifactId", "com.dsleng.archetype.primefaces");
	        properties.setProperty("archetypeCatalog", "local");
	        
	        properties.setProperty("version", version);
	        properties.setProperty("package", artifactId);
	        
	       		
	        request.setProperties(properties);
	        
			request.setBaseDirectory(new File(baseDirectory));

			
			Invoker invoker = new DefaultInvoker();
			invoker.setLocalRepositoryDirectory(new File("/Data/m2/repository/"));
			invoker.setMavenHome(new File("/usr/share/maven"));
			try {
				InvocationResult result = invoker.execute( request );

				if ( result.getExitCode() != 0 )
				{
				    throw new IllegalStateException( "Build failed." );
				}
			} catch (MavenInvocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	public String getArchetypeVersion() {
		return archetypeVersion;
	}

	public void setArchetypeVersion(String archetypeVersion) {
		this.archetypeVersion = archetypeVersion;
	}

	public String getBaseDirectory() {
		return baseDirectory;
	}

	public void setBaseDirectory(String baseDirectory) {
		this.baseDirectory = baseDirectory;
	}
}
