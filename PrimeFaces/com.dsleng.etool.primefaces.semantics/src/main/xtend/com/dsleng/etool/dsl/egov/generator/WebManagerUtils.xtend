package com.dsleng.etool.dsl.egov.generator

import static extension com.dsleng.etool.dsl.egov.generator.WebManagerExt.*
import static extension com.dsleng.etool.dsl.egov.generator.BusinessManagerExt.*
import com.dsleng.etool.models.egov.Page
import com.dsleng.etool.models.Controls.Composite

class WebManagerUtils {
	var baseProjectDir = ""
	var webDir = ""
	var ControlManagerUtils uCtrl

	new(String baseProjectDir, String webDir, ControlManagerUtils uCtrl) {
		this.baseProjectDir = baseProjectDir
		this.webDir = webDir
		this.uCtrl = uCtrl
	}

	def getContents(Page e, ControlManagerUtils uCtrl) {
		var contents = ""
		if (e.BOMaps.size > 0) {
			// val bmap = e.BOMaps.get(0)
			for (bmap : e.BOMaps) {
				contents += uCtrl.getHeadSyntax(bmap.botype, bmap.botype.parameters, bmap.businessObject)
				for (a : bmap.businessObject.Prepare.attributes) {
					var processed = false
					for (ba : bmap.attributes) {
						if (ba.attribute == a) {
							// Use Control Type
							contents += uCtrl.getControlSyntax(ba.controltype, a)
							processed = true
						}
					}
					if (!processed) {
						contents += uCtrl.genSyntax(a)
					}
				}
				contents += uCtrl.getTailSyntax(bmap.botype)
			}
		}
		return contents
	}

	def createPage(Page p) {
		val pg = new PageManager(p, baseProjectDir, webDir)
		pg.pageTitle = p.title
		var contents = uCtrl.getHeadSyntax(p.pagetype, p.title)
		contents += p.getContents(uCtrl)
		contents += dialog
		contents += uCtrl.getTailSyntax(p.pagetype)
		pg.contents = contents
		return pg
	}

// <p:commandButton value="Submit" update="display" oncomplete="PF('dlg').show()" />
	private def dialog() '''
<p:dialog header="Greeting" widgetVar="dlg" modal="true" resizable="false">
    <h:panelGrid id="display" columns="1" cellpadding="4">
         <h:outputText value="TestDialog" />
    </h:panelGrid>
</p:dialog>

'''
}