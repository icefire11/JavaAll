package observ;

public class LiSi implements Observer {

	@Override
	public void update(String context) {
		// TODO Auto-generated method stub
		System.out.println("�۲쵽�����ӻ�����ϰ屨����������");
		this.reportToQin(context);

	}
	public void reportToQin(String reportContext){
		System.out.println("��˹�������ϰ壬�������ڣ�"+ reportContext);
		
	}

}
