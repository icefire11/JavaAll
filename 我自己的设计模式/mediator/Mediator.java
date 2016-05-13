package mediator;

public class Mediator extends AbstractMediator {

	@Override
	public void execute(String str, Object... objects) {
		// TODO Auto-generated method stub
		if(str.equals("purchase.buy")){
			this.buyComputer((Integer)objects[0]);
		}
		if(str.equals("sale.sell")){
			this.sellComputer((Integer)objects[0]);
		}
		if(str.equals("sale.offsell")){
			this.offsale();
		}
		if(str.equals("stock.clear")){
			this.clearStock();
		}

	}
	
	private void buyComputer(int number){
		int saleStatus=super.sale.getSaleStatus();
		if(saleStatus>80){
			System.out.println("�ɹ�IBM����:"+number+"̨");
			super.stock.increase(number);
		}else{
			int buyNumber=number/2;
			System.out.println("�ɹ�IBM����:"+buyNumber+"̨");
		}
	}
	private void sellComputer(int number){
		if(super.stock.getStockNumber()<number){
			super.purchase.buyIBMcomputer(number);
		}
		super.stock.decrease(number);
	}
	private void clearStock(){
		super.sale.offSale();
		super.purchase.refuseBuyIBM();
	}
	private void offsale(){
		System.out.println("�ۼ�����IBM����"+stock.getStockNumber()+"̨");
	}

}
