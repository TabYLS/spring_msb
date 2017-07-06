package com.itcast.spring.ioc.injectionType.cons;

import com.itcast.spring.ioc.dao.IUserDao;

/**
* @author 叶林生 
* @date：2017年7月5日 下午5:45:29
* @version 1.0
* 
*/
public class UserService {

	private IUserDao userDao;
	
	public UserService(IUserDao userDao) {
		this.userDao = userDao;
		System.out.println(userDao);
	}
	
	//给a赋值30，b赋值50
	public UserService(int a, int b) {
		System.out.println("a=" + a + "  :  " + "b=" + b);
	}
	
	public UserService(int c, String d) {
		System.out.println("c=" + c + "  :  " + "d=" + d);
	}
	
	public void add(){
		userDao.add();
	}
}
