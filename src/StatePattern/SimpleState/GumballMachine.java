package StatePattern.SimpleState;

/**
 * 状态模式，建立一个状态转换机
 * 
 * 但是我们需要封装变化
 * 
 * @author loqiu
 *
 */
public class GumballMachine {

	public static final int SOLD_OUT = 0;
	public static final int NO_QUARTER = 1;
	public static final int HAS_QUARTER = 2;
	public static final int SOLD = 3;

	int state = SOLD_OUT;
	int count = 0;

	public GumballMachine(int count) {
		// TODO Auto-generated constructor stub
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}

	public void insertQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("you cant insert another quarter");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("you inserted a quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("you cant insert a quarter, the machine is sold out");
		} else if (state == SOLD) {
			System.out.println("please wait ,we are already giving you a gumball");
		}
	}

	/**
	 * 退钱
	 */
	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("quarter returned");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			System.out.println("you haven not inserted a quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("you cant eject,you have not insert a  quarter yet");
		} else if (state == SOLD) {
			System.out.println("sorry you already turned the crank");
		}
	}

	public void turnCrank() {
		if (state == HAS_QUARTER) {
			System.out.println("you turned...");
			state = SOLD;
			dispense();
		} else if (state == NO_QUARTER) {
			System.out.println("you turned but there is not quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("you turned but there is not gumballs");
		} else if (state == SOLD) {
			System.out.println("turning twice does not get you another gumall !");
		}
	}

	public void dispense() {
		if (state == SOLD) {
			System.out.println("a gumball comes rolling out the slot");
			count = count - 1;
			if (count == 0) {
				System.out.println("ops,out of gumballs!");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if (state == NO_QUARTER) {
			System.out.println("you need to pay first");
		} else if (state == SOLD_OUT) {
			System.out.println("no gumball dispensed");
		} else if (state == HAS_QUARTER) {
			System.out.println("no gumball dispensed");
		}
	}

	@Override
	public String toString() {
		return "GumballMachine [state=" + state + ", count=" + count + "]";
	}

}
