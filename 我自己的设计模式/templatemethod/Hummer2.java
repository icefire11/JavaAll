package templatemethod;

public class Hummer2 extends Hummer {
	public boolean flag=true;

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
		System.out.println("悍马2启动了");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
		System.out.println("悍马2停止了");

	}

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		
		System.out.println("悍马2  喇叭响了");

	}

	@Override
	public void engineBoom() {
		// TODO Auto-generated method stub
		
		System.out.println("悍马2引擎响了");

	}
	public boolean isAlarm(){
		return this.flag;
		
	}
	
	public void setFlag(boolean flag){
		this.flag=flag;
	}
}
