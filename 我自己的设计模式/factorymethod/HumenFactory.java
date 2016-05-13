package factorymethod;

public class HumenFactory extends AbstractHumenFactoray {
     Humen humen=null;
	@Override
	public <T extends Humen> T createHumen(Class<T> c) {
		// TODO Auto-generated method stub
		try {
			 humen=(T) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (T) humen;
	}

}
