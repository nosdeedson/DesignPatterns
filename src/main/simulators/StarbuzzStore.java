package main.simulators;

import decorator.Large;
import decorator.Medium;
import decorator.Small;
import decorator.beverages.DarkRoast;
import decorator.beverages.Decaf;
import decorator.beverages.Expresso;
import decorator.beverages.HouseBlend;
import decorator.decorators.Milk;
import decorator.decorators.Mocha;
import decorator.decorators.Soy;

public class StarbuzzStore {
	
	public static void makeCoffes() {
	
		HouseBlend houseBlend = new HouseBlend("I am a simple houseblend. Without decoration",
				new Small("Small", 1.0));
		
		System.out.println(houseBlend.getDescription());
		System.out.println("House Blend costs: " + houseBlend.cost());
		
		DarkRoast darkRoast = new DarkRoast("I am a darkroast", new Medium("Medium", 1.5) );
		System.out.println(darkRoast.getDescription());
		System.out.println("Dark Roast costs: " + darkRoast.cost());
		
		Expresso expresso = new Expresso("I am a expressso", new Large("Large", 1.9));
		System.out.println(expresso.getDescription());
		System.out.println("Expresso costs:" + expresso.cost());
		
		Decaf decaf = new Decaf("I am a simple decaf, I don't have cafeine.", new Small("Small", 1.0));
		System.out.println(decaf.getDescription());
		System.out.println("Decaf costs: " + decaf.cost());
		
		System.out.println("lets increment de flavors.");
		
		
		Milk milk = new Milk("I am milk ", houseBlend);
		System.out.println("Milk costs: " + milk.cost());
		System.out.println("house blend costs " + houseBlend.cost() 
		+" Houseblend with milk costs: " + milk.cost());
		
		Mocha mocha = new Mocha("Mocha, I delicious. ", darkRoast);
		Soy soy  = new Soy("I am soy ", mocha);
		Mocha mocha2 = new Mocha("Mocha again, you really like me. ", soy);
		System.out.println(mocha2.getDescription());
		System.out.println("Mocha decorating: " + mocha2.cost());
		System.out.println(mocha2.toString());
		
  		System.out.println("costs testing: " +  mocha2.cost());
		
		Mocha mocha3 = new Mocha("Another me, the people really likes me ", expresso);
		Mocha mocha4 = new Mocha("You realy like mocha humm. ", mocha3);
		
		System.out.println("A lot of mocha in one expresso " + mocha4.cost());
		
		Soy soy1 = new Soy("I help you to be healthy. ",decaf);
		System.out.println("decaf with soy " + soy1.cost());
		
		
		
	}

}
