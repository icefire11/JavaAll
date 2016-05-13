package templatemethod;

public class Hummer1 extends Hummer {
	public boolean flag=true;

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
		System.out.println("悍马1启动了");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
		System.out.println("悍马1停止了");

	}

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		
		System.out.println("悍马1  喇叭响了");

	}

	@Override
	public void engineBoom() {
		// TODO Auto-generated method stub
		
		System.out.println("悍马1引擎响了");

	}
	
	public boolean isAlarm(){
		return this.flag;
		
	}
	
	public void setFlag(boolean flag){
		this.flag=flag;
	}

}
