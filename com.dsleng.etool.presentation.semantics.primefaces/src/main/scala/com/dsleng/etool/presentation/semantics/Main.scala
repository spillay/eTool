package com.dsleng.etool.presentation.semantics

import com.dsleng.etool.presentation.view.Page
import com.dsleng.etool.presentation.view.ViewFactory
import com.dsleng.etool.presentation.semantics.Primefaces._
/**
 * @author suresh
 */
object Main extends App {
  println( "Hello World!" );
  var p: Page = ViewFactory.eINSTANCE.createPage()
  p.Execute()
}