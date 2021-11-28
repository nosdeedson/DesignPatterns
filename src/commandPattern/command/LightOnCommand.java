package commandPattern.command;

import commandPattern.devices.Light;

public class LightOnCommand implements Command {
	
	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void unDo() {
		light.off();		
	}
	
	

}
