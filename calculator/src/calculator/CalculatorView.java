package calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatorView {
	private CalculatorModel model;
	private Stage stage;
	protected Label lblResult;
	
	protected CalculatorView(Stage stage, CalculatorModel model) {
		this.stage = stage;
		this.model = model;
		stage.setTitle("Calculator");
		
		GridPane pane = new GridPane();
		lblResult = new Label();
		lblResult.setText(Integer.toString(model.getValue()));
		pane.add(lblResult, 0, 0);
		
		Scene scene = new Scene(pane);
		scene.getStylesheets().add(
		getClass().getResource("style.css").toExternalForm());
		stage.setScene(scene);
	}
	
	public void start() {
		stage.show();
	}
	
	public void stop() {
		stage.hide();
	}
	
	public Stage getStage() {
		return stage;
	}

}
