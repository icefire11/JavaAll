package adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterInfo {

	@Override
	public Map getUserBaseInfo() {
		// TODO Auto-generated method stub
		HashMap baseInfo=new HashMap();
		baseInfo.put("userName", "���Ա����������....");
		return baseInfo;
	}

	@Override
	public Map getUserOfficeInfo() {
		// TODO Auto-generated method stub
		HashMap officeInfo=new HashMap();
		officeInfo.put("job", "���Ա����ְλ�ǡ�����");
		
		return officeInfo;
	}

	@Override
	public Map getUserHomeInfo() {
		// TODO Auto-generated method stub
		HashMap homeInfo=new HashMap();
		homeInfo.put("homeAddress", "���Ա���ļ�ͥסַ��...");
		return homeInfo;
	}

}
