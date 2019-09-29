package calculator;

public class CalculatorModel {
	private int value;
	private int valueToCalculate;
	
	protected CalculatorModel() {
		this.value = 0;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValueToCalculate(int value) {
		this.valueToCalculate = value;
	}
	
	public void calculateAddition() {
		value = value + valueToCalculate;
		System.out.println(value);
		//return(value);
	}
	
	public void calculateSubtraction() {
		value = value - valueToCalculate;
		//return(value);
	}
	
	public void calculateMultiplication() {
		value = value * valueToCalculate;
		//return(value);
	}
	
	

}
