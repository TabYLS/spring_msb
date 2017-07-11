package com.itcast.spring.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.itcast.spring.ioc.dao.IUserDao;

/**
* @author 叶林生 
* @date：2017年7月4日 下午9:53:15
* @version 1.0
* 
*/
public class UserService {
	
	//@Autowired  建议不要使用这种方式，破坏封装性
	private IUserDao userDao;
	
	private IUserDao userDao2;
	
	private String qualifier;
	
	public void add(){
		userDao.add();
	}

	public IUserDao getUserDao() {
		System.out.println("通过注解注入bean");
		return userDao;
	}

	/*@Autowired
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}*/
	
	//配合qualifier一起使用,可以使用byName默认是byType
	@Autowired
	public void setQualifier(@Qualifier("qualifier1")String qualifier) {
		this.qualifier = qualifier;
		System.out.println("AAAAAAAA" + qualifier);
	}
	
	public String getQualifier() {
		return this.qualifier;
	}

	public IUserDao getUserDao2() {
		return userDao2;
	}

	@Autowired
	public void setUserDao2(@Qualifier("userDao")IUserDao userDao2) {
		this.userDao2 = userDao2;
	}
	
}
