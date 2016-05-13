package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A m2=new Aa();
		InvocationHandler m=new TraceHandler(m2);
		A proxy=(A) Proxy.newProxyInstance(A.class.getClassLoader(), new Class[]{A.class}, m);
		proxy.doSomething();
		

	}

}

