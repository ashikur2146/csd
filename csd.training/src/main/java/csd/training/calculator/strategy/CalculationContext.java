package csd.training.calculator.strategy;

public class CalculationContext {
	private CalculationStrategy strategy;

	public CalculationContext(CalculationStrategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public double executeCalculation(double num1, double num2) {
		return this.strategy.operation(num1, num2);
	}
}
