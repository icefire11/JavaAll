package strategy;

public class ZhaoYun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contex contex;
		System.out.println("�𿪵�һ������");
		contex=new Contex(new BackDoor());
		contex.oprate();
		
		System.out.println("�𿪵ڶ�������");
		contex=new Contex(new GreenLed());
		contex.oprate();
		
		System.out.println("�𿪵���������");
		contex=new Contex(new BlockEnergy());
		contex.oprate();
		
		

	}

}
