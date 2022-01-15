package strategyPattern;

public class Subtract implements Calculate {

	@Override
	public Double calculate(Double a, Double b) {
		return a - b;
	}

}
