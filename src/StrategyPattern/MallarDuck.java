package StrategyPattern;

public class MallarDuck extends Duck {

	public MallarDuck() {
		quackbehavior = new Quack();
		flybehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("im a real mallard duck");
	}
	
}
