package commandPattern.remoteControl;

import commandPattern.command.Command;
import commandPattern.command.NoCommand;

public class RemoteControl {

	private Command onCommand[];
	private Command offCommand[];
	
	private Command undoCommand;
	
	public RemoteControl() {
		this.onCommand = new Command[7];
		this.offCommand = new Command[7];
		
		for ( int i = 0; i < onCommand.length; i++) {
			onCommand[i] = new NoCommand();
			offCommand[i] = new NoCommand();
		}
		undoCommand = new NoCommand();
	}
	
	public void setCommands(int slot, Command onCommand, Command offCommand) {
		this.onCommand[slot] = onCommand;
		this.offCommand[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		this.onCommand[slot].execute();
		this.undoCommand = this.onCommand[slot];
	}
	
	public void offButtonWasPushed(int slot) {
		this.offCommand[slot].execute();
		this.undoCommand = this.offCommand[slot];
	}
	
	public void unDoButtonWasPushed() {
		this.undoCommand.unDo();
	}

	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n------ Remote control -----\n");
		for ( int i = 0; i < onCommand.length; i++) {
			stringBuffer.append("[ slot " + i + "]" + onCommand.getClass().getName() + " " 
					+ offCommand.getClass().getName() + "\n");
		}
		return stringBuffer.toString();
	}
	
	
}
