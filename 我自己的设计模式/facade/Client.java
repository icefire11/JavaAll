package facade;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facade letter=new Facade();
		String context="我想你了";
		String address="我家在中南海怀仁堂";
				
		letter.sendLetter(context, address);
		System.out.println(letter.toString());

	}

}
