package commandPattern.command;

public class NoCommand implements Command{

	@Override
	public void execute() {
		System.out.println("Do nothing");
	}

	@Override
	public void unDo() {
		System.out.println("Do nothing");
	}
	
}
