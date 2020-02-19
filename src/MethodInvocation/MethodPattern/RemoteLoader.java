package MethodInvocation.MethodPattern;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();

		Light livingRoomLight = new Light();

		LightOnCommand livingon = new LightOnCommand(livingRoomLight);
		LightOffCommand livingoff = new LightOffCommand(livingRoomLight);

		remote.setCommand(0, livingon, livingoff);
		
		System.out.println(remote);
		
		remote.onButton(0);
		remote.offButton(0);
	}

}
