package observ;

public class LiSi implements Observer {

	@Override
	public void update(String context) {
		// TODO Auto-generated method stub
		System.out.println("观察到韩非子活动，向老板报道。。。。");
		this.reportToQin(context);

	}
	public void reportToQin(String reportContext){
		System.out.println("李斯：报告老板，韩非子在："+ reportContext);
		
	}

}
