package strategyPattern;

public class Divide implements Calculate {

	@Override
	public Double calculate(Double a, Double b) {
		if ( b == 0)
			return null;
		return a / b;
	}

}
