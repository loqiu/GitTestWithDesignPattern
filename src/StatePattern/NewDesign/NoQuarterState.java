package StatePattern.NewDesign;

public class NoQuarterState implements State {

	GumballMachine gumball;

	public NoQuarterState(GumballMachine gumball) {
		this.gumball = gumball;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("you inserted a quarter");
		//用来改变状态机状态
		gumball.setState(gumball.getHasQuarterState());
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
