package duty;

public class Husband extends Handler {

	public Husband(){
		super(Handler.HUSBAND_LEVEL);
	}

	@Override
	protected void response(IWomen women) {
		// TODO Auto-generated method stub
	   System.out.println("---Ů�����ɷ���ʾ---");
	   System.out.println(women.getRequest());
	   System.out.println("�ɷ�Ĵ��ǣ�ͬ��\n");

	}

}
