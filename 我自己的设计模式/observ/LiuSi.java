package observ;

public class LiuSi implements Observer {

	@Override
	public void update(String context) {
		// TODO Auto-generated method stub
		System.out.println("������������");
		this.report(context);

	}
	public void report(String reportContext){
		System.out.println("��˹���������ڣ�"+ reportContext);
		
	}

}
