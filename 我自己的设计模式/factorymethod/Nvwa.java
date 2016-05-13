package factorymethod;

public class Nvwa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractHumenFactoray YinYangLu=new HumenFactory();
		
		System.out.println("第一次造人");
		Humen whiteHumen=YinYangLu.createHumen(WhiteHumen.class);
		whiteHumen.getColor();
		whiteHumen.talk();
		
		
		System.out.println("第2次造人");
		Humen blackHumen=YinYangLu.createHumen(BlackHumen.class);
		 blackHumen.getColor();
		 blackHumen.talk();
		 
		 
		 System.out.println("第3次造人");
		 Humen yellowHumen=YinYangLu.createHumen(YellowHumen.class);
		 yellowHumen.getColor();
		 yellowHumen.talk();



	}

}
