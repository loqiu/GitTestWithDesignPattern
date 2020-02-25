package StatePattern.SimpleState;

public class GumballMachineTestDrive {

	public static void main(String[] args) {

		GumballMachine gumball = new GumballMachine(5);

		gumball.insertQuarter();
		gumball.turnCrank();

		System.out.println("-------------------------");
		System.out.println(gumball);

		gumball.insertQuarter();
		gumball.ejectQuarter();
		gumball.turnCrank();

		System.out.println("-------------------------");
		System.out.println(gumball);

	}

}
