package factoryPattern.pizzas.ingredients.clam;

public class FrozenClam implements Clam {

	private String clam = "Frozen clam";
	
	public FrozenClam() {}
	
	@Override
	public Clam createClam() {
		return new FrozenClam();
	}
	
	public String getClam() {
		return clam;
	}
}
