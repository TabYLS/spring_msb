package com.itcast.spring.ioc.injectionType.cons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author 叶林生 
* @date：2017年7月5日 下午5:43:51
* @version 1.0
* 
*/
public class Constructor {
	
	public static void main(String[] args) {
		//BeanFactory beanFactory = new ClassPathXmlApplicationContext("com/itcast/spring/ioc/bean.xml");
		//官网建议使用ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/itcast/spring/ioc/injectionType/cons/bean.xml");
		
		//一个参数
		//UserService userService = (UserService) ctx.getBean("userService");
		//userService.add();
		//两个相同类型的参数
		//UserService userService2 = (UserService) ctx.getBean("userService2");
		//两个不同类型的参数
		UserService userService3 = (UserService) ctx.getBean("userService3");
	}

}
