package factoryPattern.pizzas.ingredients.vegies;

public class Garlic implements Veggies{
	
	private String garlic = "garlic";
	
	public Garlic() {}

	@Override
	public Veggies createVegies() {
		return new Garlic();
	}

	public String getGarlic() {
		return garlic;
	}

}
