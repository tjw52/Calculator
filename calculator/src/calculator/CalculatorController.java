package calculator;

import javafx.application.Platform;

public class CalculatorController {
	final private CalculatorModel model;
	final private CalculatorView view;
	
	protected CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;
		
		view.getStage().setOnCloseRequest((event) -> {
			view.stop();
			Platform.exit();
		});
	}
	
	

}
