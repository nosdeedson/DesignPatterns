package factoryPattern.pizzas.ingredients.vegies;

public class RedPepper implements Veggies {
	
	private String redPepper = "red pepper";
	
	public RedPepper() {}

	@Override
	public Veggies createVegies() {
		return new RedPepper();
	}

	public String getRedPepper() {
		return redPepper;
	}

}
