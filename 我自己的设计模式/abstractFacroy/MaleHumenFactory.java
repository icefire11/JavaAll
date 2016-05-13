package abstractFacroy;

public class MaleHumenFactory implements HumenFactory {

	@Override
	public Humen createWhiteHumen() {
		// TODO Auto-generated method stub
		return new MaleWhiteHumen();
	}

	@Override
	public Humen createBlackHumen() {
		// TODO Auto-generated method stub
		return new MaleBlackHumen();
	}

}
