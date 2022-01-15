package strategyPattern;

public class Sum implements Calculate {

	@Override
	public Double calculate(Double a, Double b) {
		return a + b;
	}

}
