package decorator;

public class HighScore extends Decorator {
	public HighScore(SchoolReport sr){
		super(sr);		
	}
	
	private void reportHighScore(){
		System.out.println("这次考试的最高分为。。。。");
	}
	@Override
	public void report(){
		this.reportHighScore();
		super.report();
	}


}
