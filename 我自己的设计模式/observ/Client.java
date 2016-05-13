package observ;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LiSi liSi=new LiSi();
		LiuSi liuSi=new LiuSi();
		HanFeiZi hanFeiZi=new HanFeiZi();
		hanFeiZi.addObserver(liSi);
		hanFeiZi.addObserver(liuSi);
		hanFeiZi.havaBreakfast();
		hanFeiZi.haveFun();

	}

}
