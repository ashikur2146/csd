package design.patterns.strategry;

public class SubOperation implements Strategy {

	@Override
	public int doOperation(final int num1, final int num2) {
		if (num1 >= num2)
			return num1 - num2;
		return num2 - num1;
	}

}
