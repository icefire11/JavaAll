package observ;

public class LiuSi implements Observer {

	@Override
	public void update(String context) {
		// TODO Auto-generated method stub
		System.out.println("报道。。。。");
		this.report(context);

	}
	public void report(String reportContext){
		System.out.println("刘斯：韩非子在："+ reportContext);
		
	}

}
