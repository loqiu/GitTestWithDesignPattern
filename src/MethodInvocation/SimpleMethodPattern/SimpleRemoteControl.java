package MethodInvocation.SimpleMethodPattern;

public class SimpleRemoteControl {

	Command command;

	public SimpleRemoteControl() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 提供一个注册接口
	 * 只调用command的execute方法，不关心传入的对象是谁
	 * @param command
	 */
	public void setCommand(Command command) {
		this.command = command;
	}

	public void buttonWasPressed() {
		command.execute();
	}

}
