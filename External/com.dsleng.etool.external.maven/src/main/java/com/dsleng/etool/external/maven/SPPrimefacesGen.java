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

public class SPPrimefacesGen extends SPGenerator {	
	public SPPrimefacesGen(String baseDir) {
		super();
		setBaseDirectory(baseDir);
		
	}

	
	public void createBaseProj(String groupId,String artifactId,String version,String langFile,String webdir){
			InvocationRequest request = new DefaultInvocationRequest();
			//request.setPomFile( new File( "/path/to/pom.xml" ) );
			request.setGoals( Collections.singletonList( "archetype:generate" ) );
			
			request.setInteractive(false);
	        Properties properties = new Properties();
	        properties.setProperty("groupId", groupId);
	        properties.setProperty("artifactId", artifactId);
	        properties.setProperty("archetypeVersion", getArchetypeVersion());
	        properties.setProperty("archetypeGroupId", "com.dsleng.archetype");
	        properties.setProperty("archetypeArtifactId", "com.dsleng.archetype.primefaces");
	        properties.setProperty("archetypeCatalog", "local");
	        
	        properties.setProperty("version", version);
	        properties.setProperty("package", artifactId);
	        properties.setProperty("langFile", langFile);
	        properties.setProperty("webdir", webdir);
	        
	       		
	        request.setProperties(properties);
	        
	        request.setBaseDirectory(new File(getBaseDirectory()));

			
			Invoker invoker = new DefaultInvoker();
			invoker.setLocalRepositoryDirectory(new File(this.getLocalRepository()));
			invoker.setMavenHome(new File(this.getMavenHome()));
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
}
