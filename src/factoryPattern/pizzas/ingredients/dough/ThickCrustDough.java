package factoryPattern.pizzas.ingredients.dough;

public class ThickCrustDough implements Dough {
	
	private String dough = "Thick crust dough";
	
	public ThickCrustDough() {}
	
	@Override
	public Dough createDough() {
		return  new ThickCrustDough();
	}

	public String getDough() {
		return dough;
	}

}
