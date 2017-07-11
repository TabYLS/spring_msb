package com.itcast.spring.aop.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author 叶林生 
* @date：2017年7月10日 上午12:39:51
* @version 1.0
* 
*/
public class TestXML {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/itcast/spring/aop/xml/bean.xml");
		
		UserService userService = (UserService) ctx.getBean("userService");
		userService.add();
	}

}
