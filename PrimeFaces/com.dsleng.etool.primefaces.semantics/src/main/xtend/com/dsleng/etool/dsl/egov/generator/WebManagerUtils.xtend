package com.dsleng.etool.dsl.egov.generator

import static extension com.dsleng.etool.dsl.egov.generator.WebManagerExt.*
import static extension com.dsleng.etool.dsl.egov.generator.BusinessManagerExt.*
import com.dsleng.etool.models.egov.Page
import com.dsleng.etool.models.bobjs.BobjsPackage
import com.dsleng.etool.models.Controls.Composite
import com.dsleng.etool.models.bobjs.BobjsFactory
import com.dsleng.etool.models.bobjs.DataTypes

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
		var BusUtils = new BusinessManagerUtils()
		val pageContents = new OptionManager(e)
		if (e.BOMaps.size > 0) {
			// val bmap = e.BOMaps.get(0)
			for (bmap : e.BOMaps) {
				BusUtils.doPredefinedData(bmap)
				contents += uCtrl.getHeadSyntax(bmap.botype, bmap.botype.parameters, bmap.businessObject)
				for (a : bmap.businessObject.Prepare.attributes.filter[elem|!elem.dataManagement]) {
					var processed = false
					for (ba : bmap.attributes) {
						if (ba.attribute == a) {
							// Use Control Type
							contents += uCtrl.getControlSyntax(ba, a,pageContents,e)
							processed = true
						}
					}
					if (!processed) {
						// Uncomment to generate defaults
						//contents += uCtrl.genSyntax(a)
					}
				}
				contents += uCtrl.getTailSyntax(bmap.botype, bmap.botype.parameters, bmap.businessObject,pageContents)
			}
		}
		return contents
	}

	def createPage(Page p) {
		val pageContents = new OptionManager(p)
		val pg = new PageManager(p, baseProjectDir, webDir)
		pg.pageTitle = p.title
		var contents = uCtrl.getHeadSyntax(p.pagetype, p.title)
		var innerContents = p.getContents(uCtrl)
		innerContents += dialog
		contents += uCtrl.getTailSyntax(p.pagetype,p.title,pageContents)
		contents = contents.replace("spContents",innerContents)
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