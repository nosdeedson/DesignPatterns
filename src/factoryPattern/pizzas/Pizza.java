package factoryPattern.pizzas;

import factoryPattern.pizzas.ingredients.cheese.Cheese;
import factoryPattern.pizzas.ingredients.clam.Clam;
import factoryPattern.pizzas.ingredients.dough.Dough;
import factoryPattern.pizzas.ingredients.sauce.Sauce;

public abstract class Pizza {
		
	private String name;
	
	private Dough dough;
	
	private Sauce sauce;
	
	private Cheese cheese;
	
	private Clam clam;
	
	private String cuttingShape = "Cutting the pizza into diagonal slices";
	
	public Pizza() {}

	public Pizza(String name) {
		this.name = name;
	}
	
	abstract void prepare();
	
	public void bake() {
		System.out.println("Baking the " + this.name + " for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println(this.cuttingShape);
	}
	
	public void box() {
		System.out.println("Place the " + this.name + " in the official PizaStore box.");
	}
	
	@Override
	public String toString() {
		return "Pizza [name=" + this.getName() +"]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dough getDough() {
		return dough;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	public String getCuttingShape() {
		return cuttingShape;
	}

	public void setCuttingShape(String cuttingShape) {
		this.cuttingShape = cuttingShape;
	}

	public Clam getClam() {
		return clam;
	}

	public void setClam(Clam clam) {
		this.clam = clam;
	}
	
	
	
}
