package ProxyPattern;

public class GumballMonitor {

	GumballMachine machine;

	public GumballMonitor(GumballMachine machine) {
		this.machine = machine;
	}

	public  void report() {
		// TODO Auto-generated method stub
		System.out.println("machine: " + machine.getLocation());
		System.out.println("current inventory: " + machine.getCount());
		System.out.println("current state: " + machine.getState());
	}

}
