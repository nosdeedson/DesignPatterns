package factoryPattern.ingredientFactory;

import factoryPattern.pizzas.ingredients.cheese.Cheese;
import factoryPattern.pizzas.ingredients.cheese.MozzarellaCheese;
import factoryPattern.pizzas.ingredients.clam.Clam;
import factoryPattern.pizzas.ingredients.clam.FreshClam;
import factoryPattern.pizzas.ingredients.dough.Dough;
import factoryPattern.pizzas.ingredients.dough.ThinCrustDough;
import factoryPattern.pizzas.ingredients.pepperoni.Pepperoni;
import factoryPattern.pizzas.ingredients.pepperoni.SlicedPepperoni;
import factoryPattern.pizzas.ingredients.sauce.MarinaSauce;
import factoryPattern.pizzas.ingredients.sauce.Sauce;
import factoryPattern.pizzas.ingredients.vegies.Garlic;
import factoryPattern.pizzas.ingredients.vegies.Mushroom;
import factoryPattern.pizzas.ingredients.vegies.RedPepper;
import factoryPattern.pizzas.ingredients.vegies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Clam createClam() {
		return new FreshClam();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Garlic(), new Mushroom(), new RedPepper()};
		return veggies;
	}

}
