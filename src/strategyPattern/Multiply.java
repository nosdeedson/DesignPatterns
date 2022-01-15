package strategyPattern;

public class Multiply implements Calculate {

	@Override
	public Double calculate(Double a, Double b) {
		return a * b;
	}

}
