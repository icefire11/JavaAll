package duty;

import java.util.ArrayList;
import java.util.Random;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		ArrayList<IWomen> al=new ArrayList();
		for(int i=0;i<5;i++){
			al.add(new Women(rand.nextInt(3),"我要出去逛街"));
		}
		Handler father=new Father();
		Handler husband=new Husband();
		
		father.setNext(husband);
		for(IWomen women:al){
			father.HandleMessage(women);
		}

	}

}
