package csd.training.calculator.strategy;

public class Division implements CalculationStrategy {

	public double operation(double num1, double num2) {
		if (num2 == 0)
			throw new ArithmeticException();
		return num1 / num2;
	}

}
