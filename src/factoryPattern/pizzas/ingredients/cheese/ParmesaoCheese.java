package factoryPattern.pizzas.ingredients.cheese;

public class ParmesaoCheese implements Cheese {

	private String cheese = "parmesao";
	
	public ParmesaoCheese() {}
	
	@Override
	public Cheese createCheese() {
		return new ParmesaoCheese();
	}

	public String getCheese() {
		return cheese;
	}
}
