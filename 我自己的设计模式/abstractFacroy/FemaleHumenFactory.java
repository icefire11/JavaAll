package abstractFacroy;

public class FemaleHumenFactory implements HumenFactory {

	@Override
	public Humen createWhiteHumen() {
		// TODO Auto-generated method stub
		return new FemaleWhiteHumen();
	}

	@Override
	public Humen createBlackHumen() {
		// TODO Auto-generated method stub
		return new FemaleBlackHumen();
	}

}
