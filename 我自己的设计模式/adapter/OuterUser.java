package adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterInfo {

	@Override
	public Map getUserBaseInfo() {
		// TODO Auto-generated method stub
		HashMap baseInfo=new HashMap();
		baseInfo.put("userName", "这个员工的姓名是....");
		return baseInfo;
	}

	@Override
	public Map getUserOfficeInfo() {
		// TODO Auto-generated method stub
		HashMap officeInfo=new HashMap();
		officeInfo.put("job", "这个员工的职位是。。。");
		
		return officeInfo;
	}

	@Override
	public Map getUserHomeInfo() {
		// TODO Auto-generated method stub
		HashMap homeInfo=new HashMap();
		homeInfo.put("homeAddress", "这个员工的家庭住址是...");
		return homeInfo;
	}

}
