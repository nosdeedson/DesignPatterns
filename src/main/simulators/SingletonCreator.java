package main.simulators;

import singleton.simpleSingleton.WhoAmI;

public class SingletonCreator {

	public static WhoAmI whoAmICreator(String whoAmI) {
		return WhoAmI.getInstance(whoAmI);
	}
	
	public static void sigletonWorking() {
		
		WhoAmI i2 = SingletonCreator.whoAmICreator("Someone created me again, by I am still de same!!");
		System.out.println(i2.toString());
		WhoAmI i3 =SingletonCreator.whoAmICreator("You can call me as much as you want, I always will be the same!!");
		System.out.println(i3.toString());
	
	}
}
