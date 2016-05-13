package strategy;

public class Contex {
	private IStrategy strategy;
	
	public Contex(IStrategy strategy){
		this.strategy=strategy;
	}
	
	public void oprate(){
		this.strategy.oprerate();
	}
	

}
