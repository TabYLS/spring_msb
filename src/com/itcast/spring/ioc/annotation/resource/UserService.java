package com.itcast.spring.ioc.annotation.resource;

import javax.annotation.Resource;

import com.itcast.spring.ioc.dao.IUserDao;

/**
* @author 叶林生 
* @date：2017年7月4日 下午9:53:15
* @version 1.0
* 
*/
public class UserService {
	
	private IUserDao userDao;
	
	public void add(){
		userDao.add();
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	//默认是按照byName
	//@Resource
	
	@Resource(name="userDao2")
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

}
