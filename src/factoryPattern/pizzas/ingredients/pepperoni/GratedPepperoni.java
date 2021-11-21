package factoryPattern.pizzas.ingredients.pepperoni;

public class GratedPepperoni implements Pepperoni {
	
	private String pepperoni = "grated pepperoni";
	
	public GratedPepperoni() {}

	@Override
	public Pepperoni createPepperoni() {
		return new GratedPepperoni();
	}

	public String getPepperoni() {
		return pepperoni;
	}

}
