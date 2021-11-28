package main.simulators;

import commandPattern.command.LightOffCommand;
import commandPattern.command.LightOnCommand;
import commandPattern.command.StereoOffCommand;
import commandPattern.command.StereoOnCommand;
import commandPattern.devices.Light;
import commandPattern.devices.Stereo;
import commandPattern.remoteControl.RemoteControl;

public class RemoteControlSimulator {

	public static void remoteControlSimulator() {
		RemoteControl remoteControl = new RemoteControl();
		
		Light light = new Light();
		Stereo stereo = new Stereo();
		
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
		
		remoteControl.setCommands(0, stereoOnCommand, stereoOffCommand);
		remoteControl.setCommands(1, lightOnCommand, lightOffCommand);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		
		remoteControl.unDoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		
		remoteControl.unDoButtonWasPushed();
	}
}
