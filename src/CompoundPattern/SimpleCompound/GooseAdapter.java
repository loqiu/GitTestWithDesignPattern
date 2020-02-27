package CompoundPattern.SimpleCompound;

import java.util.Observer;

/**
 * 适配器模式
 * 
 * @author loqiu
 *
 */
public class GooseAdapter implements Quackable {

	Goose goose;

	public GooseAdapter(Goose goose) {
		// TODO Auto-generated constructor stub
		this.goose = goose;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		goose.honk();
	}
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerObserver(CompoundPattern.SimpleCompound.Observer obserber) {
		// TODO Auto-generated method stub
		
	}

}
