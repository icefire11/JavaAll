package string;

import java.util.Scanner;

public class getEveryChar {
	
	public void split(){
		Scanner input=new Scanner(System.in);
		String ss=input.nextLine();
		String[] sss=ss.split("");
		for(int i=0;i<sss.length;i++){
			System.out.println(sss[i]);
		}
	}
	public void charAt(){
		Scanner input=new Scanner(System.in);
		String ss=input.nextLine();
		for(int i=0;i<ss.length();i++){
			System.out.println(ss.charAt(i));
			System.out.println(ss.length());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ÇëÊäÈë×Ö·û");
		getEveryChar a=new getEveryChar();
		a.split();
		
		System.out.println("ÇëÔÙ´ÎÊäÈë×Ö·û");
		a.charAt();
		
		
		

	}

}
