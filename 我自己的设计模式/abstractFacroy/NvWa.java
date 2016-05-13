package abstractFacroy;

public class NvWa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumenFactory maleFactory=new MaleHumenFactory();
		HumenFactory femaleFactory=new FemaleHumenFactory();
		
		Humen femaleWhiteHumen=(FemaleWhiteHumen) femaleFactory.createWhiteHumen();
		Humen maleWhiteHumen=(MaleWhiteHumen) maleFactory.createWhiteHumen();
		
		System.out.println("������һ������Ů��");
		femaleWhiteHumen.getColor();
		femaleWhiteHumen.getSex();
		
		System.out.println("������һ����������");
		maleWhiteHumen.getColor();
		maleWhiteHumen.getSex();

	}

}
