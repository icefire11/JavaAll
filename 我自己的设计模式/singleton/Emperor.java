package singleton;

public class Emperor {
	private final static Emperor emperor=new Emperor();
	
	private Emperor(){
		System.out.println("�ҵĹ��캯����˽�еģ���֪���ܲ�����ʾ����");
	}
	public static Emperor getInstance(){
		return emperor;
	}
	public static void say(){
		System.out.println("���������˵��");
	}

}
