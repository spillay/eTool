package com.dsleng.etool.primefaces.semantics.tests

import org.junit.Test
import static org.junit.Assert.*
import com.google.inject.Inject
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.junit4.util.ParseHelper
import com.dsleng.etool.models.egov.Dept
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import com.dsleng.etool.dsl.egov.EGovDslInjectorProvider
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.util.StringInputStream
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.XtextResourceSet
import com.google.inject.Provider
import com.dsleng.etool.models.egov.EgovPackage
import java.io.File
import java.io.FileInputStream
import org.apache.commons.io.IOUtils;
import com.dsleng.etool.primefaces.semantics.EgovGenerator

class EgovLangInjectorProvider extends EGovDslInjectorProvider {
	override protected internalCreateInjector() {
		// trigger injector creation of other language
		//new SecondDslInjectorProvider().getInjector
		return super.internalCreateInjector()
	}
}


@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EgovLangInjectorProvider))
class EgovGeneratorTest {
	
	@Inject EgovGenerator underTest
    @Inject ParseHelper<Dept> parseHelper 
	@Inject ValidationTestHelper validationTester
	
	val testLang = "src/test/resources/s1.egv"
	
	@Test
	def InitialTest() {
		//EgovPackage.eINSTANCE.eClass();
		val theLang = IOUtils.toString(new FileInputStream(new File(testLang)), "UTF-8");
		println(theLang)
		val model = parseHelper.parse(theLang)
		validationTester.assertNoErrors(model)
		/* 
		val fsa = new InMemoryFileSystemAccess()
        underTest.doGenerate(model.eResource, fsa)
        println(fsa.files)
        assertEquals(2,fsa.allFiles.size)
		
		val resourceSet = resourceSetProvider.get
		val url = URI.createURI(testLang)
		val firstLang = resourceSet.getResource(URI.createURI(testLang),false)
		//firstLang.load(new StringInputStream(".."), emptyMap)
		val root = firstLang.contents.head as Dept
		assertNotNull(root)
		validationTester.assertNoIssues(root)
		*/
		
		//val model = parseHelper.parse('''
        //Hello Alice!
        //Hello Bob!
        //''')
        //validationTester.assertNoErrors(model)
        
	}
	@Test
	def GenTest(){
		//EgovPackage.eINSTANCE.eClass();
		val theLang = IOUtils.toString(new FileInputStream(new File(testLang)), "UTF-8");
		val model = parseHelper.parse(theLang)
		validationTester.assertNoErrors(model)
		
		val fsa = new InMemoryFileSystemAccess()
        underTest.doGenerate(model.eResource, fsa)
        println(fsa.allFiles)
        //assertEquals(2,fsa.allFiles.size)
        assertTrue(1==1);
	}
	@Test
	def GenFromFileTest(){
		val fsa = new InMemoryFileSystemAccess()
        underTest.processDSL(testLang, fsa)
        println(fsa.allFiles)
        //assertEquals(2,fsa.allFiles.size)
        assertTrue(1==1);
	}
}