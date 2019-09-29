package calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatorView {
	private CalculatorModel model;
	private Stage stage;
	protected Label lblResult;
	protected Button button1;
	protected Button button2;
	protected Button button3;
	protected Button button4;
	protected Button button5;
	protected Button button6;
	protected Button button7;
	protected Button button8;
	protected Button button9;
	protected Button button0;


	protected Button buttonPlus;
	protected Button buttonEqual;

	
	protected CalculatorView(Stage stage, CalculatorModel model) {
		this.stage = stage;
		this.model = model;
		stage.setTitle("Calculator");
		
		GridPane pane = new GridPane();
		
		lblResult = new Label();
		lblResult.setText(Integer.toString(model.getValue()));
		GridPane.setColumnSpan(lblResult, 2);
		pane.add(lblResult, 0, 0, 4, 1);
		
		
		button1 = new Button();
		button1.setText("1");
		pane.add(button1, 0, 1);
		
		button2 = new Button();
		button2.setText("2");
		pane.add(button2, 1, 1);
		
		button3 = new Button();
		button3.setText("3");
		pane.add(button3, 2, 1);
		
		button4 = new Button();
		button4.setText("4");
		pane.add(button4, 0, 2);
		
		button5 = new Button();
		button5.setText("5");
		pane.add(button5, 1, 2);
		
		button6 = new Button();
		button6.setText("6");
		pane.add(button6, 2, 2);
		
		button7 = new Button();
		button7.setText("7");
		pane.add(button7, 0, 2);
		
		button8 = new Button();
		button8.setText("8");
		pane.add(button8, 1, 3);
		
		button9 = new Button();
		button9.setText("9");
		pane.add(button9, 2, 3);
		
		button0 = new Button();
		button0.setText("0");
		pane.add(button0, 0, 4);
		
		buttonPlus = new Button();
		buttonPlus.setText("+");
		pane.add(buttonPlus, 4, 1);
		
		buttonEqual = new Button();
		buttonEqual.setText("=");
		pane.add(buttonEqual, 1, 4);
		
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
