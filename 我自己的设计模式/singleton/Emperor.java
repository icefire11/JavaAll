package singleton;

public class Emperor {
	private final static Emperor emperor=new Emperor();
	
	private Emperor(){
		System.out.println("我的构造函数是私有的，不知道能不能显示出来");
	}
	public static Emperor getInstance(){
		return emperor;
	}
	public static void say(){
		System.out.println("我他妈的在说话");
	}

}
