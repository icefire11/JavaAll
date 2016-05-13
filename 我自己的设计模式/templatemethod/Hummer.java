package templatemethod;

public abstract class Hummer {
	public abstract void start();
	
	public abstract void stop();
	
	public abstract void alarm();
	
	public abstract void engineBoom();
	
	public void run(){
		this.start();
		
		if(this.isAlarm()){
			this.alarm();
		}
		
		
		this.engineBoom();
		
		this.stop();
	}
	
	boolean isAlarm(){
		return true;
	}
	
	

}
