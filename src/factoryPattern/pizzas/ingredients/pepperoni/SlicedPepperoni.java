package factoryPattern.pizzas.ingredients.pepperoni;

public class SlicedPepperoni implements Pepperoni {
	
	private String slicedPepperoni = "sliced pepperoni";
	
	public SlicedPepperoni() {	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
	public String getPepperoni() {
		return slicedPepperoni;
	}
}
