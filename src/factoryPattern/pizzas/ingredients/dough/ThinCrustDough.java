package factoryPattern.pizzas.ingredients.dough;

public class ThinCrustDough implements Dough {
	
	private String dough = "Thin crust dough";
	
	public ThinCrustDough() {}

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	public String getDough() {
		return dough;
	}

}
