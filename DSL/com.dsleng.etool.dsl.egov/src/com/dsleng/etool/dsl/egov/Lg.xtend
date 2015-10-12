package com.dsleng.etool.dsl.egov

import com.dsleng.etool.perspective.SPConsoleManager

class Lg {
	def static info(String mesg){
		SPConsoleManager.instance.Info(mesg)
	}
	def static debug(String mesg){
		SPConsoleManager.instance.Debug(mesg)
	}
}