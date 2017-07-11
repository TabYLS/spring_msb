package com.itcast.spring.aop.noImpl;

import org.springframework.stereotype.Repository;

import com.itcast.spring.aop.domain.User;

/**
* @author 叶林生 
* @date：2017年7月8日 下午9:27:50
* @version 1.0
* 
*/
@Repository("userDao")
public class UserDao implements IUserDao {

	@Override
	public void add(User user) {
		System.out.println("noImpl添加用户。。。。。。。。。");
	}

	@Override
	public void delete() {
		System.out.println("删除用户。。。。。。。。。");
		
	}

}
