package com.itcast.spring.ioc.annotation.compponetscan;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itcast.spring.ioc.dao.IUserDao;

/**
* @author 叶林生 
* @date：2017年7月4日 下午9:53:15
* @version 1.0
* 
*/
@Service("userService")
public class UserService {
	
	public UserService(){}
	
	private IUserDao userDao;
	
	public void add(){
		userDao.add();
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	//默认是按照byName
	//@Resource
	
	@Resource(name="userDaoImpl")
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

}
