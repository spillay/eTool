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
			options[value=("Literal:String")]
		},
		SimpleWebCtrl Input<<inputText>> {
			options[value=("Literal:String")]
		},
		CompositeWebCtrl StringInput<<Label>> {
			sibling(Input)
		}
	}
		
}
			