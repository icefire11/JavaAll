package duty;

public class Father extends Handler {
	
	public Father(){
		super(Handler.FATHER_LEVEL);
	}

	@Override
	protected void response(IWomen women) {
		// TODO Auto-generated method stub
	   System.out.println("---Ů��������ʾ---");
	   System.out.println(women.getRequest());
	   System.out.println("���׵Ĵ��ǣ�ͬ��\n");

	}

}
