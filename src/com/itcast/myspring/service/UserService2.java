package com.itcast.myspring.service;

import com.itcast.myspring.dao.IUserDao;

/**
* @author 叶林生 
* @date：2017年7月4日 下午9:53:15
* @version 1.0
* 
*/
public class UserService2 {
	
	private IUserDao userDao;
	
	public void add(){
		userDao.add();
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
}
