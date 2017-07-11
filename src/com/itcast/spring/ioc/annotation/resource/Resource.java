package com.itcast.spring.ioc.annotation.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author 叶林生 
* @date：2017年7月8日 下午12:07:56
* @version 1.0
* 
*/
public class Resource {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/itcast/spring/ioc/annotation/resource/bean.xml");
		
		UserService userService = (UserService) ctx.getBean("userService");
		System.out.println(userService.getUserDao());
	}

}
