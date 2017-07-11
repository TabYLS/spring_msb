package com.itcast.spring.ioc.annotation.compponetscan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author 叶林生 
* @date：2017年7月8日 下午12:36:14
* @version 1.0
* 
*/
public class Component {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/itcast/spring/ioc/annotation/compponetscan/bean.xml");
		
		UserService userService = (UserService) ctx.getBean("userService");
		System.out.println(userService.getUserDao());
	}

}
