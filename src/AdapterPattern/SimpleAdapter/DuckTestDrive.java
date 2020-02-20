package AdapterPattern.SimpleAdapter;

public class DuckTestDrive {
	
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		/**
		 * 把传进去的火鸡通过适配器适配成一只鸭子
		 */
		Duck adapter = new TurkeyAdapter(turkey);
		
		System.out.println("turkey say: \n");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("duck say: \n");
		duck.quack();
		duck.fly();
		
		System.out.println("adapter say:\n");
		adapter.quack();
		adapter.fly();
		
		
	}

}
