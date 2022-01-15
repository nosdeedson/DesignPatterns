package main.simulators;

import strategyPattern.Calculate;
import strategyPattern.Divide;
import strategyPattern.Multiply;
import strategyPattern.Operation;
import strategyPattern.RequestOperation;
import strategyPattern.Sum;
import strategyPattern.Subtract;

public class StrategySimulator {

	private static Calculate calculo;
	
	public static void calculate(RequestOperation operation) {
		calculo = createOperation(operation.getOperation());
		Double result = calculo.calculate(operation.getOperator1(), operation.getOperator2());
		System.out.println("Result of the " + operation.getOperation() + ": " + result);
	}
	
	private static Calculate createOperation(Operation operation) {
		String action = operation.toString();
		switch (action) {
		case "sum": {
			return new Sum();
		}
		case "divide":{
			return new Divide();
		}
		case "substract":{
			return new Subtract();
		}
		case "multiply":{
			return new Multiply();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operation);
		}
	}
	
	
}
