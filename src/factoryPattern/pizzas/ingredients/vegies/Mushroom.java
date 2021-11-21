package factoryPattern.pizzas.ingredients.vegies;

public class Mushroom implements Veggies {
	
	private String mushroom = "mushroom";
	
	public Mushroom() {}

	@Override
	public Veggies createVegies() {
		return new Mushroom();
	}

	public String getMushroom() {
		return mushroom;
	}

}
