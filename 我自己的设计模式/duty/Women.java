package duty;

public class Women extends IWomen {
	
	private int type=0;
	
	private String request="";
	
	
	public Women(int _type,String _request){
		this.type=_type;
		switch(this.type){
		case 1:
			this.request="Ů����������: "+_request;
			break;
		case 2:
			this.request="���ӵ�������: "+_request;
			break;
		case 3:
			this.request="ĸ�׵�������: "+_request;
			break;
		}
		
	}

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public String getRequest() {
		// TODO Auto-generated method stub
		return this.request;
	}

}
