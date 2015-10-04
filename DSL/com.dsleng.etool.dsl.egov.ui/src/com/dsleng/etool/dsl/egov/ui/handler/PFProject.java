/**
 * 
 */
package com.dsleng.etool.dsl.egov.ui.handler;

import org.eclipse.emf.ecore.EObject;

import com.dsleng.etool.external.maven.EclipseGen;
import com.dsleng.etool.external.maven.SPMaven;
import com.dsleng.etool.external.maven.SPPrimefacesGen;
import com.dsleng.etool.models.bobjs.OrgUnit;
import com.dsleng.etool.models.egov.EService;

/**
 * @author suresh
 *
 */
public class PFProject {
	String langFile;
	String fileSep;
	String baseDir;
	String artifactid;
	public String getLangFile() {
		return langFile;
	}
	public String getBaseDir(){ return baseDir; }
	public String getProjectName(){ return artifactid; }
	public void setLangFile(String langFile) {
		this.langFile = langFile;
	}
	public PFProject() {
		fileSep = "/";
		this.baseDir = null;
	}
	public PFProject(String baseDir) {
		fileSep = "/";
		this.baseDir = baseDir;
	}
	public void Eclisify(){
		EclipseGen pT = new EclipseGen();
		pT.makeEclipseProj(getBaseDir(), getProjectName());
	}
	public void Deploy(){
		SPMaven o = new SPMaven();
		o.execute(baseDir+artifactid+"/pom.xml", "wildfly:deploy");
	}
	public void Execute(EObject model){
		if ( model instanceof EService){
			EService e = (EService) model;
			OrgUnit dp = e.getBusinessUnit();
			SPPrimefacesGen pT;
			if ( baseDir == null){
				pT = new SPPrimefacesGen(dp.getDirLocation());
			} else {
				pT = new SPPrimefacesGen(baseDir);
			}
			artifactid = dp.getArtifactId();
			setLangFile(dp.getDirLocation() + fileSep + dp.getArtifactId() + fileSep + dp.getLangFile());
			pT.createBaseProj(dp.getGroupId(), dp.getArtifactId(), dp.getVersion(),dp.getLangFile(),dp.getWebDirectory());
		}
	}
	
}
