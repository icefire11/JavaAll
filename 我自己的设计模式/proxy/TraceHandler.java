package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TraceHandler implements InvocationHandler {
	public Object proxy2;
	public TraceHandler(Object t){
		this.proxy2=t;
		
			
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(proxy2);
	    
	}

}
