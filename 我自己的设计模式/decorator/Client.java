package decorator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SchoolReport sr;
		sr=new FourSchoolReport();
		
		
		sr=new HighScore(sr);
		sr=new SortReport(sr);
		
		
		sr.report();
		sr.sign("ÀÏÈý");
		

	}

}
