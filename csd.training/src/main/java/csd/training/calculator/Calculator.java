package csd.training.calculator;

import csd.training.calculator.strategy.Addition;
import csd.training.calculator.strategy.CalculationContext;
import csd.training.calculator.strategy.Division;

public class Calculator {
	
	private double num1;
	private double num2;
	
	public Calculator(final double num1, final double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public double addNumbers() {
		CalculationContext calculationContext = new CalculationContext(new Addition());
		return (Double) calculationContext.executeCalculation(this.num1, this.num2);
	}

	public double divideNumbers() {
		CalculationContext calculationContext = new CalculationContext(new Division());
		return calculationContext.executeCalculation(num1, num2);
	}
}
