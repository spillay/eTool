package com.dsleng.etool.primefaces.semantics.tests

import static org.junit.Assert.*
import com.dsleng.etool.dsl.ControlsInjectorProvider
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import com.google.inject.Inject
import com.dsleng.etool.primefaces.semantics.CtrlGenerator
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.apache.commons.io.IOUtils
import java.io.FileInputStream
import java.io.File
import com.dsleng.etool.models.Controls.ControlManager

class CtrlLangInjectorProvider extends ControlsInjectorProvider {
	override protected internalCreateInjector() {
		// trigger injector creation of other language
		//new SecondDslInjectorProvider().getInjector
		return super.internalCreateInjector()
	}
}


@RunWith(typeof(XtextRunner))
@InjectWith(typeof(CtrlLangInjectorProvider))
class CtrlGeneratorTest {
	
	@Inject CtrlGenerator underTest
    @Inject ParseHelper<ControlManager> parseHelper 
	@Inject ValidationTestHelper validationTester
	
	val testLang = "src/test/resources/primefaces.ctl"
	
	@Test
	def InitialTest() {
		//EgovPackage.eINSTANCE.eClass();
		val theLang = IOUtils.toString(new FileInputStream(new File(testLang)), "UTF-8");
		println(theLang)
		val model = parseHelper.parse(theLang)
		validationTester.assertNoErrors(model)
	}
	@Test
	def GenTest(){
		//EgovPackage.eINSTANCE.eClass();
		val theLang = IOUtils.toString(new FileInputStream(new File(testLang).absolutePath), "UTF-8");
		val model = parseHelper.parse(theLang)
		//validationTester.assertNoErrors(model)
		
		println(underTest.doGenerate(model.eResource,"Label"))
		println(underTest.doGenerate(model.eResource,"StringInput"))
        
       
        assertTrue(1==1);
	}
		
}