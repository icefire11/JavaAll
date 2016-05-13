package singleton;

public class Minister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emperor emperor=Emperor.getInstance();
		emperor.say();

	}

}
