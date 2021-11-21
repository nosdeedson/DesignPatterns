package factoryPattern.pizzas.ingredients.cheese;

public class MozzarellaCheese implements Cheese {
	
	private String cheese = "mozzarella";
	
	public MozzarellaCheese() {	}
	
	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public String getCheese() {
		return cheese;
	}

	
}
