package design.patterns.behavioral;

import design.patterns.strategry.AddOperation;
import design.patterns.strategry.StrategyContext;
import design.patterns.strategry.SubOperation;

public class StrategyPattern {
	public static void main(String[] args) {
		StrategyContext strategyContext = new StrategyContext(new AddOperation());
		System.out.println(strategyContext.executeStrategy(5, 10));
		
		StrategyContext subStrategy = new StrategyContext(new SubOperation());
		System.out.println(subStrategy.executeStrategy(5, 10));
	}
}