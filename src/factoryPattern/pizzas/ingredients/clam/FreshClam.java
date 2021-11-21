package factoryPattern.pizzas.ingredients.clam;

public class FreshClam implements Clam {
	
	private String clam = "fresh clam";
	
	public FreshClam() {}

	@Override
	public Clam createClam() {
		return new FreshClam();
	}

	public String getClam() {
		return clam;
	}

}
