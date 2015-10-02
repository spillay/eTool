/**
 * 
 */
package com.dsleng.etool.dsl.egov.eclipse.generators;

import org.eclipse.emf.ecore.EObject;
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
	public String getLangFile() {
		return langFile;
	}
	public void setLangFile(String langFile) {
		this.langFile = langFile;
	}
	public PFProject() {
		fileSep = "/";
	}
	public void Execute(EObject model){
		if ( model instanceof EService){
			EService e = (EService) model;
			OrgUnit dp = e.getBusinessUnit();
			SPPrimefacesGen pT = new SPPrimefacesGen(dp.getDirLocation());
			setLangFile(dp.getDirLocation() + fileSep + dp.getArtifactId() + fileSep + dp.getLangFile());
			pT.createBaseProj(dp.getGroupId(), dp.getArtifactId(), dp.getVersion(),dp.getLangFile(),dp.getWebDirectory());
		}
	}
	
}
