package encapsulatingAlgorithmsPattern;

public abstract class CafeineBerage {

	public final void prepareRecipe() {
		this.boilWater();
		brew();
		this.pourInCup();
		if ( clientWantsCondiments()) {
			addCondiments();			
		}
	}
	
	public boolean clientWantsCondiments() {
		return true;
	}

	public void pourInCup() {
		System.out.println("beverage in cup");
	}

	public final  void boilWater() {
		System.out.println("water boiled");
	}
	
	public abstract void brew();
	public abstract void addCondiments();
}
