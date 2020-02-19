package MethodInvocation.MethodPattern;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButton(int slot) {
		onCommands[slot].execute();
	}

	public void offButton(int slot) {
		offCommands[slot].execute();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		StringBuffer string = new StringBuffer();
		string.append("\n----------remote control-------------\n");
		for (int i = 0; i < onCommands.length; i++) {
			string.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "  "
					+ offCommands[i].getClass().getName() + "\n");
		}
		return string.toString();
	}

}
