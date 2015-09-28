ControlManager {
	controls {
		Control input {ns "http" prefix "f"
			options { "mode" ("inline","popup") }
		},	
		Control label {ns "http" prefix "f"
			options { "mode" ("inline","popup") }
		}	
	} 
	composites { 
		SimpleWebCtrl Label<<label>> {
			options[mode=(inline)]
		},
		SimpleWebCtrl Input<<input>> {
			options[mode=(popup)]
		},
		CompositeWebCtrl StringInput<<Label>> {
			sibling(Input)
		}
	}
		
}
			