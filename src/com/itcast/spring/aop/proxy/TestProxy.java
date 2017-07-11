package com.itcast.spring.aop.proxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

/**
* @author 叶林生 
* @date：2017年7月8日 下午9:47:20
* @version 1.0
* 
* 代理可以监测各个方法的性能，虽然静态代理可以完成，但是动态代理更加的灵活和方便
* 
*/
public class TestProxy {
	
	@Test
	public void test() {
		IUserDao userDao = new UserDao();
		LogInterceptor log = new LogInterceptor();
		log.setTarget(userDao);
		//参数说明，
		//userDao.getClass().getClassLoader()：为了得到代理，需要传入一个类加载器来得到代理对象，这个类加载器要和被代理的对象的类加载相同
		//new Class[]{IUserDao.class}或者userDao.getClass().getInterfaces()：传入这个是为了告诉代理需要实现哪些接口，一般是和被代理的对象相同的接口,接口里面有什么方法代理就有什么方法
		//log：产生代理之后调用代理里面的方法的时候指定那个Handler来处理，这里是日志处理的，所以使用日志的handler
		//返回值就是产生我们所需要的代理对象
		IUserDao proxy = (IUserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), new Class[]{IUserDao.class}, log);
		System.out.println(proxy.getClass());
		//调用任何方法的时候代理都会生效
		proxy.add();
		proxy.delete();
		
	}

}

/*
 * 动态代理实现的原理：
 * 生成代理对象（$Proxy5）
 * 代理对象实现了被代理的对象的接口
 * class $Proxy5 implements IUserDao{
 * 		//复写接口的方法
 * 		add(){
 * 			//具体的它是通过反射获取到Method对象
 * 			Method method = IUserDao.class.getMethod();
 * 
 * 			//然后再将自己传给生成代理对象的时候传进来的处理器（Handler，这里是LogInterceptor处理器）的方法，
 * 			//参数说明：this代表自己，将自己传给处理器
 * 			//method：把拿到的method对象传过去
 * 			//args：如果有参数就传参数，如果没有就传null
 * 			log.invoke(this, method, args)//通过反射调用log的方法
 * 		}
 * }
 * 
 * */
