package adapterPattern.turkey;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("I am a turkey and I am  doing glu glu");
	}

	@Override
	public void fly() {
		System.out.println("I am a turkey and I am flying a little distance at time");
	}

}
