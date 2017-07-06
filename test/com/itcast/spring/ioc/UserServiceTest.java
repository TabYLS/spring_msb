package com.itcast.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itcast.spring.ioc.service.UserService;

/**
* @author 叶林生 
* @date：2017年7月5日 下午2:48:15
* @version 1.0
* 
*/
public class UserServiceTest {

	@Test
	public void test() {
		//BeanFactory beanFactory = new ClassPathXmlApplicationContext("com/itcast/spring/ioc/bean.xml");
		//官网建议使用ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/itcast/spring/ioc/bean.xml");
		
		UserService userService = (UserService) ctx.getBean("userService");
		userService.add();
	}

}
