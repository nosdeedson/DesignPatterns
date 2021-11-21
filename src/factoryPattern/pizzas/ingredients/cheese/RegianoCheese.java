package factoryPattern.pizzas.ingredients.cheese;

public class RegianoCheese implements Cheese {
	
	private String cheese = "Regiano cheese";
	
	public RegianoCheese() {}

	@Override
	public Cheese createCheese() {
		return new RegianoCheese();
	}

	public String getCheese() {
		return cheese;
	}
}
