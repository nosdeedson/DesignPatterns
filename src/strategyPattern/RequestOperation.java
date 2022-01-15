package strategyPattern;

public class RequestOperation {

	private Operation operation;
	private Double operator1;
	private Double operator2;
	public RequestOperation(Operation operation, Double operator1, Double operator2) {
		this.operation = operation;
		this.operator1 = operator1;
		this.operator2 = operator2;
	}
	public Operation getOperation() {
		return operation;
	}
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	public Double getOperator1() {
		return operator1;
	}
	public void setOperator1(Double operator1) {
		this.operator1 = operator1;
	}
	public Double getOperator2() {
		return operator2;
	}
	public void setOperator2(Double operator2) {
		this.operator2 = operator2;
	}
	
	
}
