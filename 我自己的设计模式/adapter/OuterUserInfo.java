package adapter;

import java.util.Map;

public class OuterUserInfo extends OuterUser implements IUserInfo {
	private Map baseInfo=super.getUserBaseInfo();
	private Map homeInfo=super.getUserHomeInfo();
	private Map officeInfo=super.getUserOfficeInfo();
	

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		String userName=(String) baseInfo.get("userName");
		System.out.println(userName);
		return userName;
	}

	@Override
	public String HomeAddress() {
		// TODO Auto-generated method stub
		String homeAddress=(String) baseInfo.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}

	@Override
	public String Job() {
		// TODO Auto-generated method stub
		String job=(String) baseInfo.get("job");
		System.out.println(job);
		return job;
	}

}
