package com.dsleng.etool.primefaces.semantics

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.naming.IQualifiedNameProvider

import com.google.inject.Inject
import com.dsleng.etool.models.egov.Page

class EgovGenerator implements IGenerator {

	@Inject extension IQualifiedNameProvider
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (e : resource.allContents.toIterable.filter(Page)) {
			fsa.generateFile(e.fullyQualifiedName.toString("/") + ".java", e.compile)
		}
	}
	def compile(Page e) ''' 
	
	<Page name=«e.fullyQualifiedName»>
	</Page>
  	'''

}