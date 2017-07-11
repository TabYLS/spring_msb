package com.itcast.spring.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author 叶林生 
* @date：2017年7月8日 上午11:23:04
* @version 1.0
* 
* 在bean中加入qualifier之后，它的value可以代表bean的id，因此是用默认的byType方式进行注入的时候会报错，这个一定要注意
*/


public class Qualifier {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/itcast/spring/ioc/annotation/bean.xml");
		
		UserService userService = (UserService) ctx.getBean("userService");
		System.out.println(userService.getQualifier());
		
		//使用qualifier来进行注解
		System.out.println(userService.getUserDao2());
	}
	
}