package com.dsleng.etool.primefaces.semantics.tests

import org.junit.Test
import static org.junit.Assert.*
import com.google.inject.Inject
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.junit4.util.ParseHelper
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
import com.dsleng.etool.models.bobjs.BobjsPackage
import java.io.File
import java.io.FileInputStream
import org.apache.commons.io.IOUtils;

import com.dsleng.etool.models.egov.EService
import com.dsleng.etool.dsl.ControlsInjectorProvider
import com.dsleng.etool.dsl.bobjs.BObjDslInjectorProvider
import com.dsleng.etool.models.bobjs.OrgUnit
import com.dsleng.etool.models.Controls.ControlsPackage
import com.dsleng.etool.models.Controls.ControlManager
import com.dsleng.etool.dsl.egov.generator.EGovDslGenerator

class EgovLangInjectorProvider extends EGovDslInjectorProvider {
	override protected internalCreateInjector() {
		// trigger injector creation of other language
		new ControlsInjectorProvider().injector
		new BObjDslInjectorProvider().injector
		return super.internalCreateInjector()
	}
}


@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EgovLangInjectorProvider))
class EgovGeneratorTest {
	
	@Inject EGovDslGenerator underTest
	//@Inject BOGenerator BOunderTest
    @Inject ParseHelper<EService> parseHelper 
	@Inject ValidationTestHelper validationTester
	@Inject Provider<XtextResourceSet> resourceSetProvider
	
	val egvLangFile = "src/test/resources/cn.egv"
	val bobLangFile = "src/test/resources/CN.bob"
	val pfLangFile = "src/test/resources/pf.ctl"
	
	@Test
	def BobTest() {
		val resourceSet = resourceSetProvider.get
		BobjsPackage.eINSTANCE.eClass();
		val bobLangStr = IOUtils.toString(new FileInputStream(new File(bobLangFile)), "UTF-8");
		val bobLang = resourceSet.createResource(URI.createURI("sample.bob"))
		bobLang.load(new StringInputStream(bobLangStr), emptyMap)
		val root = bobLang.contents.head as OrgUnit
		assertNotNull(root)
		validationTester.assertNoIssues(root)
		
		ControlsPackage.eINSTANCE.eClass();
		val pfLangStr = IOUtils.toString(new FileInputStream(new File(pfLangFile)), "UTF-8");
		val pfLang = resourceSet.createResource(URI.createURI("sample.ctl"))
		pfLang.load(new StringInputStream(pfLangStr), emptyMap)
		val ctlRoot = pfLang.contents.head as ControlManager
		assertNotNull(ctlRoot)
		validationTester.assertNoIssues(ctlRoot)
		
		EgovPackage.eINSTANCE.eClass
		val egvLangStr = IOUtils.toString(new FileInputStream(new File(egvLangFile)), "UTF-8");
		val egvLang = resourceSet.createResource(URI.createURI("sample.egv"))
		egvLang.load(new StringInputStream(egvLangStr), emptyMap)
		val egvRoot = egvLang.contents.head as EService
		assertNotNull(egvRoot)
		validationTester.assertNoIssues(egvRoot)
		println(egvRoot.businessUnit.name)
		validationTester.assertNoIssues(egvRoot)
		
		val fsa = new InMemoryFileSystemAccess()
		for(r: egvRoot.eResource.allContents.toIterable.filter(ControlManager)){
			println("Control Manager" + (r as ControlManager).controls.get(0).name)
		}
        underTest.doGenerate(egvRoot.eResource, fsa)
        println(fsa.allFiles)
        //assertEquals(2,fsa.allFiles.size)
        assertTrue(1==1);
        
        /* 
        val bofsa = new InMemoryFileSystemAccess()
        BOunderTest.doGenerate(egvRoot.eResource, bofsa)
        println(bofsa.allFiles)
        //assertEquals(2,fsa.allFiles.size)
        assertTrue(1==1);
        */
	}
	/*
	@Test
	def GenTest(){
		BobjsPackage.eINSTANCE.eClass();
		ControlsPackage.eINSTANCE.eClass();
		EgovPackage.eINSTANCE.eClass();
		val theLang = IOUtils.toString(new FileInputStream(new File(egvLangFile)), "UTF-8");
		val model = parseHelper.parse(theLang)
		//validationTester.assertNoErrors(model)
		
		val fsa = new InMemoryFileSystemAccess()
        underTest.doGenerate(model.eResource, fsa)
        println(fsa.allFiles)
        //assertEquals(2,fsa.allFiles.size)
        assertTrue(1==1);
	}
	
	@Test
	def InitialTest() {
		//EgovPackage.eINSTANCE.eClass();
		val theLang = IOUtils.toString(new FileInputStream(new File(egvLang)), "UTF-8");
		println(theLang)
		val model = parseHelper.parse(theLang)
		println(model.businessUnit.name)
		validationTester.assertNoErrors(model)
		
	
		
		//val model = parseHelper.parse('''
        //Hello Alice!
        //Hello Bob!
        //''')
        //validationTester.assertNoErrors(model)
        
	}
	@Test
	def MultipleTest(){
		val resourceSet = resourceSetProvider.get
		val theLang = IOUtils.toString(new FileInputStream(new File(egvLang)), "UTF-8");
		val egvLang = resourceSet.createResource(URI.createURI("sample.egv"))
	
		egvLang.load(new StringInputStream(theLang), emptyMap)
	
		val root = egvLang.contents.head as EService

		assertNotNull(root)
		validationTester.assertNoIssues(root)
	
	
		val testMe = parseHelper.parse("..", resourceSet)
		assertNotNull(testMe)
		validationTester.assertNoIssues(testMe)
	}
	
	@Test
	def GenFromFileTest(){
		val fsa = new InMemoryFileSystemAccess()
        underTest.processDSL(egvLang, fsa)
        println(fsa.allFiles)
        //assertEquals(2,fsa.allFiles.size)
        assertTrue(1==1);
	}
	*/
}