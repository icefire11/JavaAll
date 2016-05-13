package builder;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {
	
	List<String>  sequence=new ArrayList<String>();

	
	
	public abstract void start();
	
	public abstract void stop();
	
	public abstract void alarm();
	
	public abstract void engineBoom();
	
	public void run(){
		for(int i=0;i<sequence.size();i++){
			String actionName=sequence.get(i);
			
			if(actionName.equalsIgnoreCase("start")){
				this.start();
			}
			
			if(actionName.equalsIgnoreCase("stop")){
				this.stop();
			}
			
			if(actionName.equalsIgnoreCase("alarm")){
				this.alarm();
			}
			
			if(actionName.equalsIgnoreCase("engineBoom")){
				this.engineBoom();
			}	
			
		}
		
	}
	
	public void setSequence(ArrayList<String> sequence){
		this.sequence=sequence;
		
	}
}
