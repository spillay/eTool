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
import com.dsleng.etool.dsl.egov.generator.JavaClass
import com.dsleng.etool.models.bobjs.BobjsFactory

class TestGenerator {
	@Test
	def selectionTest(){
		var e = BobjsFactory.eINSTANCE.createBusinessObject
		e.name =  "TestBean"
		var jc = new JavaClass(e,"Impl");
		jc.package = "package" + ".beans"
		println(jc.syntax)
	}
}