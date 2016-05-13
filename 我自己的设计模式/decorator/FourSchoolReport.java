package decorator;

public class FourSchoolReport extends SchoolReport {

	public void report() {
		System.out.println("尊敬的家长：");
		System.out.println(" 语文：62   数学63  体育98  自然63");
		System.out.println("             家长签名：");

	}

	
	public void sign(String name) {
		// TODO Auto-generated method stub
		System.out.println("家长签名为：  "+name);

	}

}
