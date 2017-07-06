package com.itcast.spring.ioc.lifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author 叶林生 
* @date：2017年7月6日 下午3:39:32
* @version 1.0
* 
*/
public class LifeCycle {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/itcast/spring/ioc/lifeCycle/bean.xml");
		
		UserService userService = (UserService) ctx.getBean("userService");
		System.out.println(userService.getUserDao());
		ctx.destroy();//在web应用程序中可以不用显示的调用destroy的方法，因为web容器会自动帮我们调用
		
	}

}
