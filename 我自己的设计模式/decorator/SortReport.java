package decorator;

public class SortReport extends Decorator {
	
	public SortReport(SchoolReport sr){
		super(sr);	
	}
	private void reportSort(){
		System.out.println("��������100��");
	}
	
	@Override
	public void report(){
		super.report();
		this.reportSort();
	}

}
