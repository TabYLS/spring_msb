package com.itcast.spring.aop.xml;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
* @author 叶林生 
* @date：2017年7月4日 下午9:53:15
* @version 1.0
* 
*/
@Service("userService")
public class UserService {
	
	private IUserDao userDao;
	
	public void add(){
		userDao.add(null);
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	@Resource(name="userDao")
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
}
