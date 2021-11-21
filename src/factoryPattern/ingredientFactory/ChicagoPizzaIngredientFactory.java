package factoryPattern.ingredientFactory;

import factoryPattern.pizzas.ingredients.cheese.Cheese;
import factoryPattern.pizzas.ingredients.cheese.RegianoCheese;
import factoryPattern.pizzas.ingredients.clam.Clam;
import factoryPattern.pizzas.ingredients.clam.FrozenClam;
import factoryPattern.pizzas.ingredients.dough.Dough;
import factoryPattern.pizzas.ingredients.dough.ThickCrustDough;
import factoryPattern.pizzas.ingredients.pepperoni.GratedPepperoni;
import factoryPattern.pizzas.ingredients.pepperoni.Pepperoni;
import factoryPattern.pizzas.ingredients.sauce.PlumTomatoeSauce;
import factoryPattern.pizzas.ingredients.sauce.Sauce;
import factoryPattern.pizzas.ingredients.vegies.Mushroom;
import factoryPattern.pizzas.ingredients.vegies.Onion;
import factoryPattern.pizzas.ingredients.vegies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoeSauce();
	}

	@Override
	public Cheese createCheese() {
		return new RegianoCheese();
	}

	@Override
	public Clam createClam() {
		return new FrozenClam();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new GratedPepperoni();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Onion(), new Mushroom()};
		return veggies;
	}

}
