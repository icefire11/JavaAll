package facade;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facade letter=new Facade();
		String context="��������";
		String address="�Ҽ������Ϻ�������";
				
		letter.sendLetter(context, address);
		System.out.println(letter.toString());

	}

}
