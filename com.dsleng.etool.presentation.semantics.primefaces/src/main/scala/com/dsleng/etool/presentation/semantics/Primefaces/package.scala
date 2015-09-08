package com.dsleng.etool.presentation.semantics

/**
 * @author suresh

 */
import com.dsleng.etool.presentation.view.Page

package object Primefaces {
  implicit class LayoutGenerator(p: Page) {
    def Execute() {
      val content: String = "Execute in Page"
      println(content)
    }
  }
}