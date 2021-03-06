/**
 * 
 */
package com.dsleng.etool.external.maven;

import java.io.File;
import java.util.Collections;

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
public class SPMaven extends SPGenerator {
	public void execute(String pomFile,String task){
		InvocationRequest request = new DefaultInvocationRequest();
		request.setPomFile( new File( pomFile ) );
		request.setGoals( Collections.singletonList( task ) );
		request.setInteractive(false);
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
