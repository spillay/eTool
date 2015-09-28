/**
 * 
 */
package com.dsleng.etool.external.maven;

/**
 * @author suresh
 *
 */
public class SPGenerator {
	private String localRepository;
	
	public String getLocalRepository() {
		return localRepository;
	}
	public void setLocalRepository(String localRepository) {
		this.localRepository = localRepository;
	}
	private String archetypeVersion;
	public String getArchetypeVersion() {
		return archetypeVersion;
	}
	public void setArchetypeVersion(String archetypeVersion) {
		this.archetypeVersion = archetypeVersion;
	}
	public String getMavenHome() {
		return mavenHome;
	}
	public void setMavenHome(String mavenHome) {
		this.mavenHome = mavenHome;
	}
	private String baseDirectory;
	private String mavenHome;
	SPGenerator(){
		mavenHome="/usr/local/maven/apache-maven-3.3.3";
		archetypeVersion = "1.0.0-SNAPSHOT";
		localRepository = "/Data/m2/repository/"; 
	}
	public String getBaseDirectory() {
		return baseDirectory;
	}
	public void setBaseDirectory(String baseDirectory) {
		this.baseDirectory = baseDirectory;
	}
}
