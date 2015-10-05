/*
 * generated by Xtext
 */
package com.dsleng.etool.dsl.egov.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import com.dsleng.etool.models.egov.EService
import com.dsleng.etool.models.Controls.ControlManager

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class EGovDslGenerator implements IGenerator {
	// Only Relying on One set of controls
	var ControlManager cm
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(c : resource.resourceSet.allContents.toIterable.filter(ControlManager)){
			println(c.toString)
			cm = c
		}
		val eg = new PageGenerator
		for (e : resource.allContents.toIterable.filter(EService)) {
			eg.doGenerate(resource,fsa,e.businessUnit.artifactId,e.businessUnit.package,cm)
		}
	}
	
}
