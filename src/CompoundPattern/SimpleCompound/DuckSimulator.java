package CompoundPattern.SimpleCompound;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator duck = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountDuckFactory();

		duck.simulate(duckFactory);
	}

	public void simulate(AbstractDuckFactory duckFactory) {
//		Quackable maller = new QuackCounter(new MallerdDuck());
//		Quackable redhead = new QuackCounter(new RedheadDuck());
//		Quackable goose = new GooseAdapter(new Goose());
		//工厂模式
//		Quackable maller = duckFactory.createMallerDuck();
//		Quackable redhead = duckFactory.createRedheadDuck();
//		Quackable goose = new GooseAdapter(new Goose());

//		System.out.println("duck sinmulate \n");

//		System.out.println("duck sinmulate with DuckFactory \n");
//		simulate(maller);
//		simulate(redhead);
//		simulate(goose);
		//组合模式
		Flock flockOfMallards = new Flock();

		Quackable mallerone = duckFactory.createMallerDuck();
		Quackable mallertwo = duckFactory.createMallerDuck();
		flockOfMallards.add(mallerone);
		flockOfMallards.add(mallertwo);

		Flock flockOfDuck = new Flock();
		flockOfDuck.add(flockOfMallards);

		System.out.println("duck simulate : whole flock simulation");
		simulate(flockOfDuck);

		
		System.out.println("duck simulator with observers");
		Quackologist quack = new Quackologist();
		flockOfDuck.registerObserver(quack);
		
		simulate(flockOfDuck);
		
		System.out.println("the ducks quacked " + QuackCounter.getNumber() + " times");
	}

	public void simulate(Quackable quack) {
		quack.quack();
	}

}
