package com.itcast.spring.aop.proxy;
/**
* @author 叶林生 
* @date：2017年7月8日 下午9:27:50
* @version 1.0
* 
*/
public class UserDao implements IUserDao {

	@Override
	public void add() {
		System.out.println("添加用户。。。。。。。。。");
	}

	@Override
	public void delete() {
		System.out.println("删除用户。。。。。。。。。");
		
	}

}
