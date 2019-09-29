package calculator;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

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
		
		view.button1.setOnAction(this::numberToCalculate);
		view.button2.setOnAction(this::numberToCalculate);
		view.button3.setOnAction(this::numberToCalculate);
		view.button4.setOnAction(this::numberToCalculate);
		view.button5.setOnAction(this::numberToCalculate);
		view.button6.setOnAction(this::numberToCalculate);
		view.button7.setOnAction(this::numberToCalculate);
		view.button8.setOnAction(this::numberToCalculate);
		view.button9.setOnAction(this::numberToCalculate);
		view.button0.setOnAction(this::numberToCalculate);
		
		view.buttonPlus.setOnAction(e -> {
			//view.lblResult.setText(model.calculateAddition()));
			model.calculateAddition();
		});
		
		view.buttonEqual.setOnAction(e -> {
			view.lblResult.setText(Integer.toString(model.getValue()));
		});

		
		
		
	}
	
	private void numberToCalculate(ActionEvent e) {
		int value = Integer.valueOf(((Button) e.getSource()).getText());
		view.lblResult.setText(Integer.toString(value));
		model.setValueToCalculate(value);
	}
	
	

}
