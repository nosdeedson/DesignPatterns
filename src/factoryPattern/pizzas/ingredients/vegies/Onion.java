package factoryPattern.pizzas.ingredients.vegies;

public class Onion implements Veggies {
	
	private String onion = "onion";

	public Onion() {}
	
	@Override
	public Veggies createVegies() {
		return new Onion();
	}

	public String getOnion() {
		return onion;
	}

}
