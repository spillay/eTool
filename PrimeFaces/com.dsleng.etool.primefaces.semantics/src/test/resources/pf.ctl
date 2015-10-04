ControlManager {
	controls {
		Control inputText {ns "http://primefaces.org/ui" prefix "p"
			options { "value" ("Literal:String") }
		},	
		Control outputText {ns "http://primefaces.org/ui" prefix "p"
			options { "value" ("Literal:String") }
		}	
	} 
	composites { 
		SimpleWebCtrl Label<<outputText>> {
			options["outputText.value"=("inputText.value.Literal:String")]
		},
		SimpleWebCtrl Input<<inputText>> {
			options["inputText.value"=("inputText.value.Literal:String")]
		},
		SimpleWebCtrl IDInput<<inputText>> {
			options["inputText.value"=("inputText.value.Literal:String")]
		},
		CompositeWebCtrl StringInput<<Label>> {
			sibling(Input)
		},
		CompositeWebCtrl IntInput<<Label>> {
			sibling(Input)
		},
		CompositeWebCtrl ID<<Label>> {
			sibling(IDInput)
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
		[Name=IDControl Control=ID]
		Parameters {
			Label => "outputText.value",
			Name => "inputText.value"
		}
	}
	BOTypes {
		[Name="DataTable" Control=Label]
	}
		
}
