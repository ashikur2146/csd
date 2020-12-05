package csd.training.calculator.strategy;

public class Addition implements CalculationStrategy {
	public double operation(double num1, double num2) {
		return num1 + num2;
	}
}