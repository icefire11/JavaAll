package decorator;

public abstract class Decorator extends SchoolReport {
	private SchoolReport sr;
     
	public Decorator(SchoolReport sr){
		this.sr=sr;
		
	}

	public void report() {
		// TODO Auto-generated method stub
		this.sr.report();

	}


	public void sign(String name) {
		// TODO Auto-generated method stub
		this.sr.sign(name);

	}

}
