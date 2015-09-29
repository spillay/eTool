/**
 * 
 */
package com.dsleng.etool.external.maven;

import java.io.File;
import java.util.Collections;
import java.util.Properties;


import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.InvocationRequest;
import org.apache.maven.shared.invoker.InvocationResult;
import org.apache.maven.shared.invoker.Invoker;
import org.apache.maven.shared.invoker.MavenInvocationException;

public class Manager {
	private String baseDirectory;
	
	public Manager(String baseDir) {
		baseDirectory = baseDir;
	}
	
	public void Execute(){
		InvocationRequest request = new DefaultInvocationRequest();
		//request.setPomFile( new File( "/path/to/pom.xml" ) );
		request.setGoals( Collections.singletonList( "archetype:generate" ) );
		
		request.setInteractive(false);
        Properties properties = new Properties();
        properties.setProperty("groupId", "com.maven");
        properties.setProperty("artifactId", "mtest");
        properties.setProperty("archetypeVersion", "1.0-alpha-4");
        properties.setProperty("archetypeGroupId", "org.apache.maven.archetypes");
        properties.setProperty("archetypeArtifactId", "maven-archetype-j2ee-simple");
        properties.setProperty("archetypeCatalog", "http://repo1.maven.org/maven2/archetype-catalog.xml");
        request.setProperties(properties);
        
		request.setBaseDirectory(new File(baseDirectory));

		
		Invoker invoker = new DefaultInvoker();
		invoker.setLocalRepositoryDirectory(new File("/Data/m2/"));
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
	public void createLangProj(String groupId,String artifactId,String version,String langName,String langExt,String GenModelFile,String GenerateEPackage,String ModelURI,String ModelBundle,String ModelGrp,String ModelArt){
		SPLangGenerator pT = new SPLangGenerator(baseDirectory);
		pT.GenerateLang(groupId, artifactId, version, langName, langExt, GenModelFile, GenerateEPackage, ModelURI, ModelBundle,ModelGrp,ModelArt);
		
		
	}
}



