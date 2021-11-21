package factoryPattern.pizzas.ingredients.sauce;

public class MarinaSauce implements Sauce {
	
	private String sauce = "Marina Sauce";
	
	public MarinaSauce() {	}
	
	@Override
	public Sauce createSauce() {
		return new MarinaSauce();
	}

	public String getSauce() {
		return sauce;
	}

}
