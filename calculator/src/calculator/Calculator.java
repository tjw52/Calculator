package calculator;

import javafx.application.Application;
import javafx.stage.Stage;

public class Calculator extends Application {
	private CalculatorView view;
	private CalculatorController controller;
	private CalculatorModel model;

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		model = new CalculatorModel();
		view = new CalculatorView(primaryStage, model);
		controller = new CalculatorController(model, view);
		view.start();
	}
	
	@Override
	public void stop() {
		if (view != null) {
			view.stop();
		}
	}

}
