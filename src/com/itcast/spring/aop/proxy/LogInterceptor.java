package com.itcast.spring.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
* @author 叶林生 
* @date：2017年7月8日 下午9:35:40
* @version 1.0
* 
*/
public class LogInterceptor implements InvocationHandler {
	
	private Object target;//被代理的对象
	
	public void beforMethod(Method method){
		System.out.println(method.getName() + "方法执行，并且在执行方法之前通过动态代理调用日志。。。。。。。。。。。。。。");
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		/*System.out.println(proxy);
		System.out.println(method);
		System.out.println(args);*/
		beforMethod(method);
		Object object = method.invoke(target, args);
		afterMethod(method);
		return object;
	}
	
	public void afterMethod(Method method) {
		System.out.println(method.getName() + "方法结束，并且在方法执行之后通过动态代理调用日志。。。。。。。。。。。。。。");
	}

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}
	
}
