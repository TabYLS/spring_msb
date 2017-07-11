package com.itcast.spring.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author 叶林生 
* @date：2017年7月6日 下午3:39:32
* @version 1.0
* 
*/
public class AutoWire {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/itcast/spring/ioc/annotation/bean.xml");
		
		UserService userService = (UserService) ctx.getBean("userService");
		System.out.println(userService.getUserDao());
	}

}
