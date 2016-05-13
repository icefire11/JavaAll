package duty;

public class Husband extends Handler {

	public Husband(){
		super(Handler.HUSBAND_LEVEL);
	}

	@Override
	protected void response(IWomen women) {
		// TODO Auto-generated method stub
	   System.out.println("---女儿向丈夫请示---");
	   System.out.println(women.getRequest());
	   System.out.println("丈夫的答复是：同意\n");

	}

}
