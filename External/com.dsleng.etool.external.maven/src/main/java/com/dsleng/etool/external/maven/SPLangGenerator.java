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

/**
 * @author suresh
 *
 */
public class SPLangGenerator extends SPGenerator {
	public SPLangGenerator(String baseDir) {
		super();
		this.setBaseDirectory(baseDir);
	}
	public void GenerateLang(String groupId,String artifactId,String version,String langName,String langExt,String GenModelFile,String GenerateEPackage,String ModelURI,String ModelBundle){
		this.createParentProj(groupId, artifactId + ".parent", version);
		this.createLangProj(groupId, artifactId, version, langName, langExt, GenModelFile, GenerateEPackage, ModelURI, ModelBundle);
		this.createUIProj(groupId, artifactId +".ui", version, artifactId, ModelBundle);
		this.createSDKProj(groupId, artifactId + ".sdk", version, artifactId, ModelBundle);
		this.createTestProj(groupId, artifactId + ".tests", version, artifactId, ModelBundle);
	}
	
	public void createParentProj(String groupId,String artifactId,String version){
		InvocationRequest request = new DefaultInvocationRequest();
		//request.setPomFile( new File( "/path/to/pom.xml" ) );
		request.setGoals( Collections.singletonList( "archetype:generate" ) );
		
		request.setInteractive(false);
        Properties properties = new Properties();
        properties.setProperty("groupId", groupId);
        properties.setProperty("artifactId", artifactId);
        properties.setProperty("archetypeVersion", getArchetypeVersion());
        properties.setProperty("archetypeGroupId", "com.dsleng.archetype");
        properties.setProperty("archetypeArtifactId", "com.dsleng.archetype.xtext.parent");
        properties.setProperty("archetypeCatalog", "local");
        
        properties.setProperty("version", version);
        properties.setProperty("package", artifactId);
        
       		
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
	public void createLangProj(String groupId,String artifactId,String version,String langName,String langExt,String GenModelFile,String GenerateEPackage,String ModelURI,String ModelBundle){
		InvocationRequest request = new DefaultInvocationRequest();
		//request.setPomFile( new File( "/path/to/pom.xml" ) );
		request.setGoals( Collections.singletonList( "archetype:generate" ) );
		
		request.setInteractive(false);
        Properties properties = new Properties();
        properties.setProperty("groupId", groupId);
        properties.setProperty("artifactId", artifactId);
        properties.setProperty("archetypeVersion", getArchetypeVersion());
        properties.setProperty("archetypeGroupId", "com.dsleng.archetype");
        properties.setProperty("archetypeArtifactId", "com.dsleng.archetype.xtext.lang");
        properties.setProperty("archetypeCatalog", "local");
        
        properties.setProperty("version", version);
        properties.setProperty("package", artifactId);
        properties.setProperty("parentId", artifactId + ".parent");
        properties.setProperty("langName", langName);
        properties.setProperty("langExt", langExt);
        
        properties.setProperty("GenModelFile", GenModelFile);
        properties.setProperty("GenerateEPackage", GenerateEPackage);
        properties.setProperty("ModelURI", ModelURI);
        properties.setProperty("ModelBundle", ModelBundle);
        
        
       		
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
	public void createUIProj(String groupId,String artifactId,String version,String base,String ModelBundle){
		InvocationRequest request = new DefaultInvocationRequest();
		//request.setPomFile( new File( "/path/to/pom.xml" ) );
		request.setGoals( Collections.singletonList( "archetype:generate" ) );
		
		request.setInteractive(false);
        Properties properties = new Properties();
        properties.setProperty("groupId", groupId);
        properties.setProperty("artifactId", artifactId);
        properties.setProperty("archetypeVersion", getArchetypeVersion());
        properties.setProperty("archetypeGroupId", "com.dsleng.archetype");
        properties.setProperty("archetypeArtifactId", "com.dsleng.archetype.xtext.ui");
        properties.setProperty("archetypeCatalog", "local");
        
        properties.setProperty("version", version);
        properties.setProperty("package", artifactId);
        properties.setProperty("parentId", artifactId + ".parent");
        properties.setProperty("base", base);
      
        properties.setProperty("ModelBundle", ModelBundle);
        
        
       		
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
	public void createSDKProj(String groupId,String artifactId,String version,String base,String ModelBundle){
		InvocationRequest request = new DefaultInvocationRequest();
		//request.setPomFile( new File( "/path/to/pom.xml" ) );
		request.setGoals( Collections.singletonList( "archetype:generate" ) );
		
		request.setInteractive(false);
        Properties properties = new Properties();
        properties.setProperty("groupId", groupId);
        properties.setProperty("artifactId", artifactId);
        properties.setProperty("archetypeVersion", getArchetypeVersion());
        properties.setProperty("archetypeGroupId", "com.dsleng.archetype");
        properties.setProperty("archetypeArtifactId", "com.dsleng.archetype.xtext.sdk");
        properties.setProperty("archetypeCatalog", "local");
        
        properties.setProperty("version", version);
        properties.setProperty("package", artifactId);
        properties.setProperty("parentId", artifactId + ".parent");
        properties.setProperty("base", base);
      
        properties.setProperty("ModelBundle", ModelBundle);
        
        
       		
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
	public void createTestProj(String groupId,String artifactId,String version,String base,String ModelBundle){
		InvocationRequest request = new DefaultInvocationRequest();
		//request.setPomFile( new File( "/path/to/pom.xml" ) );
		request.setGoals( Collections.singletonList( "archetype:generate" ) );
		
		request.setInteractive(false);
        Properties properties = new Properties();
        properties.setProperty("groupId", groupId);
        properties.setProperty("artifactId", artifactId);
        properties.setProperty("archetypeVersion", getArchetypeVersion());
        properties.setProperty("archetypeGroupId", "com.dsleng.archetype");
        properties.setProperty("archetypeArtifactId", "com.dsleng.archetype.xtext.tests");
        properties.setProperty("archetypeCatalog", "local");
        
        properties.setProperty("version", version);
        properties.setProperty("package", artifactId);
        properties.setProperty("parentId", artifactId + ".parent");
        properties.setProperty("base", base);
      
        properties.setProperty("ModelBundle", ModelBundle);
        
        
       		
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
