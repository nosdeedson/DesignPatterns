package factoryPattern.pizzas.ingredients.sauce;

public class PlumTomatoeSauce implements Sauce {
	
	private String sauce = "Plum tomatoe sauce";
	
	public PlumTomatoeSauce() {	}
	
	@Override
	public Sauce createSauce() {
		return new PlumTomatoeSauce();
	}
	
	public String getSauce() {
		return sauce;
	}
}
