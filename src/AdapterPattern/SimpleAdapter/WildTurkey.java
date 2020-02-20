package AdapterPattern.SimpleAdapter;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		System.out.println("turkey-gobble");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("tirkey-fly");
	}

}
