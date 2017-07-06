package com.itcast.myspring.dao.impl;

import com.itcast.myspring.dao.IUserDao;

/**
* @author 叶林生 
* @date：2017年7月4日 下午9:48:53
* @version 1.0
* 
*/
public class UserDaoImpl implements IUserDao {

	@Override
	public void add() {
		System.out.println("插入用户。。。。。。。。。");
		
	}

	@Override
	public void select() {
		System.out.println("查找用户。。。。。。。。。。");
		
	}

	@Override
	public void delete() {
		System.out.println("删除用户.............");
		
	}

}
