package design.patterns.strategry;

public class StrategyContext {
	
	private Strategy strategy;

	public StrategyContext(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public int executeStrategy(int num1, int num2){
	      return strategy.doOperation(num1, num2);
	}
}
