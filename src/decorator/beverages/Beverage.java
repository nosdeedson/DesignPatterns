package decorator.beverages;

public abstract class Beverage {

	public String description = "I am a generic beverage" ;
	
	public Beverage(String description) {
		this.description = description;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public Double cost() {
		return 0.0;
	}
}
