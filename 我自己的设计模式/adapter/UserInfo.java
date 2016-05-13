package adapter;

public class UserInfo implements IUserInfo {

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		System.out.println("这个员工的名字是...");
		return null;
	}

	@Override
	public String HomeAddress() {
		// TODO Auto-generated method stub
		System.out.println("这个员工的家庭住址是。。。、");
		return null;
	}

	@Override
	public String Job() {
		// TODO Auto-generated method stub
		System.out.println("这个员工的职位是。。。");
		return null;
	}

}
