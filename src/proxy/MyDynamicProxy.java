package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyDynamicProxy implements InvocationHandler {

	private RealSubject realSubject = new RealSubject();

	@Override
	public Object invoke(Object proxy, Method method, Object[] os) throws Throwable {
		System.out.println("MyDynamicProxy ");
		return method.invoke(realSubject, os);
	}
}
