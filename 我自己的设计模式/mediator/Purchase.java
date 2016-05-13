package mediator;

public class Purchase extends AbstractColleague {

	public Purchase(AbstractMediator _mediator) {
		super(_mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void buyIBMcomputer(int number){
		this.mediator.execute("purchase.buy", number);
		
	}
	
	public void refuseBuyIBM(){
		System.out.println("不再购买IBM的电脑");
	}


}
