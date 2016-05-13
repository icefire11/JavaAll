package decorator;

public class HighScore extends Decorator {
	public HighScore(SchoolReport sr){
		super(sr);		
	}
	
	private void reportHighScore(){
		System.out.println("��ο��Ե���߷�Ϊ��������");
	}
	@Override
	public void report(){
		this.reportHighScore();
		super.report();
	}


}
