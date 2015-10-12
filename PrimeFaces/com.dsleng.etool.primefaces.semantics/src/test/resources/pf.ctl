ControlManager {
	controls {
		Control nullControl {ns "http://primefaces.org/ui" prefix "p"},	
		Control spContents {ns "http://primefaces.org/ui" prefix "p"
			options {"position"("North","South","West","East","Center")}
		},
		Control inputText {ns "http://primefaces.org/ui" prefix "p"
			options { "value" ("Literal:String") }
		},	
		Control outputText {ns "http://java.sun.com/jsf/html" prefix "h"
			options { "value" ("Literal:String") }
		},
		Control panelGrid {ns "http://primefaces.org/ui" prefix "p"
			options{columns("2","4"), cellpadding("4") }
		},
		Control layout {ns "http://primefaces.org/ui" prefix "p"
			options{style("min-width:400px;min-height:200px;") }
		},
		Control layoutUnit {ns "http://primefaces.org/ui" prefix "p"
			options{position("west","north","south","east","center"),resizable("true",'false'),size("100"),minSize("40"),maxSize("200") }
		},
		Control body {ns "http://java.sun.com/jsf/html" prefix "h"},
		Control form {ns "http://java.sun.com/jsf/html" prefix "h"},
		Control panel {ns "http://primefaces.org/ui" prefix "p"
			options{header("Literal:String")}
		},
		Control calendar {ns "http://primefaces.org/ui" prefix "p"
			options { mode("popup","inline"),value("Literal:String") }
		},
		Control inputMask {ns "http://primefaces.org/ui" prefix "p"
			options { mask("9-9-9-9-9-9-9-9-9-9-9-9-9","(999) 999-9999","a*@a*"),value("Literal:String") }
		},
		Control commandButton {ns "http://primefaces.org/ui" prefix "p"
			options { value("Submit"),update("display"),oncomplete("PF('dlg').show()")}
		},
		Control selectOneMenu {ns "http://primefaces.org/ui" prefix "p"
			options { value("Literal:String"),style("width:150px") }
		},
		Control ajax {ns "http://primefaces.org/ui" prefix "p"
			options { listener("Literal:String"),update("Literal:String")}
		},
		Control selectItem {ns "http://primefaces.org/ui" prefix "f"
			options { itemLabel("Literal:String"),itemValue(""),noSelectionOption(true,false)}
		},
		Control selectItems {ns "http://primefaces.org/ui" prefix "f"
			options {value("Literal:String")}
		},
		Control dataTable {ns "http://primefaces.org/ui" prefix "p"
			options {var("Literal:String")}
		},
		Control column {ns "http://primefaces.org/ui" prefix "p"
			options {headerText("Literal:String"),value("Literal:String")}
		}
		
	} 
	composites { 
		SimpleWebCtrl Null<<nullControl>> {},
		SimpleWebCtrl CenterContents<<spContents>> {
			options["spContents.position"=("spContents.position.Center")]
		},
		SimpleWebCtrl WestContents<<spContents>> {
			options["spContents.position"=("spContents.position.West")]
		},
		SimpleWebCtrl NorthContents<<spContents>> {
			options["spContents.position"=("spContents.position.North")]
		},
		SimpleWebCtrl CommandButton<<commandButton>>{
			options["commandButton.value"=("commandButton.value.Submit"),
			"commandButton.update"=("commandButton.update.display"),
			"commandButton.oncomplete"=("commandButton.oncomplete.PF(\'dlg\').show()")]
		},
		SimpleWebCtrl Layout<<layout>> {
			options["layout.style"=("layout.style.min-width:400px;min-height:200px;")]
		},
		SimpleWebCtrl WestLayout<<layoutUnit>> {
			options["layoutUnit.position"=("layoutUnit.position.west"),"layoutUnit.size"=("layoutUnit.size.100"),"layoutUnit.minSize"=("layoutUnit.minSize.40"),"layoutUnit.maxSize"=("layoutUnit.maxSize.200")]
		},
		SimpleWebCtrl NorthLayout<<layoutUnit>> {
			options["layoutUnit.position"=("layoutUnit.position.north"),"layoutUnit.size"=("layoutUnit.size.100"),"layoutUnit.minSize"=("layoutUnit.minSize.40"),"layoutUnit.maxSize"=("layoutUnit.maxSize.200")]
		},
		SimpleWebCtrl CenterLayout<<layoutUnit>> {
			options["layoutUnit.position"=("layoutUnit.position.center"),"layoutUnit.size"=("layoutUnit.size.100"),"layoutUnit.minSize"=("layoutUnit.minSize.40"),"layoutUnit.maxSize"=("layoutUnit.maxSize.200")]
		},
		SimpleWebCtrl Panel<<panel>> {
			options["panel.header"=("panel.header.Literal:String")]
		},
		SimpleWebCtrl Label<<outputText>> {
			options["outputText.value"=("inputText.value.Literal:String")]
		},
		SimpleWebCtrl Input<<inputText>> {
			options["inputText.value"=("inputText.value.Literal:String")]
		},
		SimpleWebCtrl TwoPanelGrid<<panelGrid>> {
			options["panelGrid.columns"=("panelGrid.columns.2"),"panelGrid.cellpadding"=("panelGrid.cellpadding.4")]
		},
		SimpleWebCtrl PopupCalendar<<calendar>> {
			options["calendar.mode"=("calendar.mode.popup"),"calendar.value"=("calendar.value.Literal:String")]
		},
		SimpleWebCtrl InlineCalendar<<calendar>> {
			options["calendar.mode"=("calendar.mode.inline"),"calendar.value"=("calendar.value.Literal:String")]
		},
		SimpleWebCtrl ID<<inputMask>> {
			options["inputMask.mask"=("inputMask.mask.9-9-9-9-9-9-9-9-9-9-9-9-9"),"inputMask.value"=("inputMask.value.Literal:String")]
		},
		SimpleWebCtrl Telephone<<inputMask>> {
			options["inputMask.mask"=("inputMask.mask.(999) 999-9999"),"inputMask.value"=("inputMask.value.Literal:String")]
		},
		SimpleWebCtrl Email<<inputMask>> {
			options["inputMask.mask"=("inputMask.mask.a*@a*"),"inputMask.value"=("inputMask.value.Literal:String")]
		},
		SimpleWebCtrl SelectOneMenu<<selectOneMenu>> {
			options["selectOneMenu.style"=("selectOneMenu.style.width:150px"),"selectOneMenu.value"=("selectOneMenu.value.Literal:String")]
		},
		SimpleWebCtrl Ajax<<ajax>> {
		},
		SimpleWebCtrl SelectItem<<selectItem>> {
			options["selectItem.noSelectionOption"=("selectItem.noSelectionOption.true")]
		},
		SimpleWebCtrl SelectItems<<selectItems>> {
			options["selectItems.value"=("selectItems.value.Literal:String")]
		},
		SimpleWebCtrl Body<<body>> {},
		SimpleWebCtrl Form<<form>> {},
		SimpleWebCtrl DataTable<<dataTable>> {
			options["dataTable.var"=("dataTable.var.Literal:String")]
		},
		SimpleWebCtrl Column<<column>>{
			options["column.headerText"=("column.headerText.Literal:String"),"column.value"=("column.value.Literal:String")]
		},
		CompositeWebCtrl CPanel<<Panel>>{
			nestedControls(CenterContents)
		},
		CompositeWebCtrl CForm<<Form>>{
			nestedControls(CPanel)
		},
		CompositeWebCtrl CBody<<Body>> {
			nestedControls(CForm)
		},
		CompositeWebCtrl StringInput<<Label>> {
			sibling(Input)
		},
		CompositeWebCtrl IntInput<<Label>> {
			sibling(Input)
		},
		CompositeWebCtrl IDInput<<Label>> {
			sibling(ID)
		},
		CompositeWebCtrl TelephoneInput<<Label>> {
			sibling(Telephone)
		},
		CompositeWebCtrl EmailInput<<Label>> {
			sibling(Email)
		},
		CompositePageCtrl PageForm<<CBody>> {
		},
		
		CompositeWebCtrl InlineCalendarInput<<Label>> {
			sibling(InlineCalendar)
		},
		CompositeWebCtrl SelectOneMenuInput<<SelectOneMenu>>{
			nestedControls(Ajax,SelectItem,SelectItems)
		},
		CompositeWebCtrl DropDown<<Label>> {
			sibling(SelectOneMenuInput)
		},
		CompositeBOCtrl TwoPanelBO<<Panel>> {
			nestedControls(TwoPanelGrid)
		},
		CompositeWebCtrl CalendarInput<<Label>> {
			sibling(PopupCalendar)
		},
		CompositeWebCtrl Center<<CenterLayout>> {
			nestedControls(CBody)
		},
		CompositeWebCtrl West<<WestLayout>> {
			nestedControls(WestContents)
		},
		CompositeWebCtrl North<<NorthLayout>> {
			nestedControls(NorthContents)
		},
		CompositeWebCtrl WC<<Null>> {
			sibling(West,North,Center)
		},
		CompositePageCtrl PageLayout<<Layout>> {
			nestedControls(WC)
		}
		
	}
	AttributeTypes {
		[Name=String Control=StringInput]
			Parameters{ 
				Label => "outputText.value",
				Name => "inputText.value"
			},
	    [Name=Int Control=IntInput] 
		Parameters {
			Label => "outputText.value",
			Name => "inputText.value"
		},
		[Name=IDControl Control=IDInput]
		Parameters {
			Label => "outputText.value",
			Name => "inputMask.value"
		},
		[Name=Date Control=CalendarInput]
		Parameters {
			Label => "outputText.value",
			Name => "calendar.value"
		},
		[Name=Telephone Control=TelephoneInput]
		Parameters {
			Label => "outputText.value",
			Name => "inputMask.value"
		},
		[Name=Email Control=EmailInput]
		Parameters {
			Label => "outputText.value",
			Name => "inputMask.value"
		},
		[Name=Selection Control=DropDown]
		Parameters {
			Label => "outputText.value",
			Name => "selectOneMenu.value"
		},
		[Name=SubmitButton Control=CommandButton],
		[Name=DataColumn Control=Column]
		Parameters{
			Label => "column.headerText",
			Name => "column.value"
		}
		
	}
	BOTypes {
		[Name="TwoPanelGrid" Control=TwoPanelBO]
		Parameters {
			Name => "panel.header"
		}
		,
		[Name="DataTable" Control=DataTable]
		Parameters {
			Name => "dataTable.var"
		}
	}
	PageTypes {
		[Name="PageForm" Control=PageForm]
		Parameters{
			Name => "panel.header"
		},
		[Name="PageLayout" Control=PageLayout]
		Parameters {
			Name => "panel.header"
		},
		[Name="PageFour" Control=PageLayout]
	}
		
}
