package strategy;

public class ZhaoYun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contex contex;
		System.out.println("拆开第一个锦囊");
		contex=new Contex(new BackDoor());
		contex.oprate();
		
		System.out.println("拆开第二个锦囊");
		contex=new Contex(new GreenLed());
		contex.oprate();
		
		System.out.println("拆开第三个锦囊");
		contex=new Contex(new BlockEnergy());
		contex.oprate();
		
		

	}

}
