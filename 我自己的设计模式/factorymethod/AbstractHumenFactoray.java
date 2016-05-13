package factorymethod;

public abstract class AbstractHumenFactoray {
	public abstract <T extends Humen> T createHumen(Class<T> c);

}
