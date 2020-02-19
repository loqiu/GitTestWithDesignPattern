package MethodInvocation;

import MethodInvocation.SimpleMethodPattern.Command;

/**
 * 命令队列
 * 
 * @author loqiu
 *
 */
public class MacroCommand implements Command {

	Command[] commands;

	public MacroCommand(Command[] commands) {
		// TODO Auto-generated constructor stub
		this.commands = commands;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}

	public void undo() {

	}

}
