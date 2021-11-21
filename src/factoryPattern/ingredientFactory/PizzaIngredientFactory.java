package factoryPattern.ingredientFactory;

import factoryPattern.pizzas.ingredients.cheese.Cheese;
import factoryPattern.pizzas.ingredients.clam.Clam;
import factoryPattern.pizzas.ingredients.dough.Dough;
import factoryPattern.pizzas.ingredients.pepperoni.Pepperoni;
import factoryPattern.pizzas.ingredients.sauce.Sauce;
import factoryPattern.pizzas.ingredients.vegies.Veggies;

public interface PizzaIngredientFactory {
	
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Clam createClam();
	public Pepperoni createPepperoni();
	public Veggies[] createVeggies();

}
