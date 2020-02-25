package ProxyPattern;

public class SoldState implements State {
	GumballMachine gumball;

	public SoldState(GumballMachine gumball) {
		this.gumball = gumball;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub

	}

}
