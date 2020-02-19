package MethodInvocation.SimpleMethodPattern;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		// 注册lightonCommand
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		// 把lightcommand方法传入到setcommand中
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
	}
}
