/**
 * 
 */
package com.dsleng.etool.dsl.egov.eclipse.generators;

import org.eclipse.emf.ecore.EObject;
import com.dsleng.etool.external.maven.SPPrimefacesGen;

/**
 * @author suresh
 *
 */
public class PFProject {
	private String baseDirectory;
	public PFProject(EObject model) {
		baseDirectory = "/Data/maventest/";
	}
	public void Execute(){
		createBaseProj(baseDirectory);
	}
	private void createBaseProj(String baseDir){
		SPPrimefacesGen pT = new SPPrimefacesGen(baseDirectory);
		pT.createBaseProj("za.co.egov", "za.co.egov.dept", "1.0.0-SNAPSHOT");
	}
}
