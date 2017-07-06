package com.itcast.spring.ioc.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itcast.spring.ioc.dao.IUserDao;

/**
* @author 叶林生 
* @date：2017年7月6日 下午2:55:12
* @version 1.0
* 
*/
public class Collection {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/itcast/spring/ioc/collection/bean.xml");
		IUserDao userDao = (IUserDao) ctx.getBean("userDao");
		System.out.println(userDao);
	}

}
