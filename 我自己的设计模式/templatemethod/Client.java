package templatemethod;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Hummer1 hummer1=new Hummer1();
		
		Hummer hummer2=new Hummer2();
		
		System.out.println("悍马1是否需要响铃  1响铃  2不响");
		Scanner input1=new Scanner(System.in);
		if(input1.nextLine().equals("2")){
			hummer1.setFlag(false);
		}
		hummer1.run();
		
		
		hummer2.run();

	}

}
