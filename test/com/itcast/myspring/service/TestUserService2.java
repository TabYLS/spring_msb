package com.itcast.myspring.service;

import com.itcast.myspring.BeanFactory;
import com.itcast.myspring.ClassPathXmlApplicationContext2;

/**
* @author 叶林生 
* @date：2017年7月4日 下午9:55:09
* @version 1.0
* 
*/
public class TestUserService2 {
	
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext2("com/itcast/myspring/myBean2.xml");
		
		//IUserDao userDao = (IUserDao) beanFactory.getBean("userDao");
		UserService2 userService = (UserService2) beanFactory.getBean("userService");
		//userService.setUserDao(userDao);
		userService.add();
	}

}
