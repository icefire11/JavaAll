package abstractFacroy;

public class NvWa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumenFactory maleFactory=new MaleHumenFactory();
		HumenFactory femaleFactory=new FemaleHumenFactory();
		
		Humen femaleWhiteHumen=(FemaleWhiteHumen) femaleFactory.createWhiteHumen();
		Humen maleWhiteHumen=(MaleWhiteHumen) maleFactory.createWhiteHumen();
		
		System.out.println("创建了一个白人女性");
		femaleWhiteHumen.getColor();
		femaleWhiteHumen.getSex();
		
		System.out.println("创建了一个白人男性");
		maleWhiteHumen.getColor();
		maleWhiteHumen.getSex();

	}

}
