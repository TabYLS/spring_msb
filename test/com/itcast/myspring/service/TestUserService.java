package com.itcast.myspring.service;

import com.itcast.myspring.BeanFactory;
import com.itcast.myspring.ClassPathXmlApplicationContext;
import com.itcast.myspring.dao.IUserDao;

/**
* @author 叶林生 
* @date：2017年7月4日 下午9:55:09
* @version 1.0
* 
*/
public class TestUserService {
	
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("com/itcast/myspring/myBean.xml");
		
		IUserDao userDao = (IUserDao) beanFactory.getBean("userDao");
		UserService userService = new UserService();
		userService.setUserDao(userDao);
		userService.add();
	}

}
