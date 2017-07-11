package com.itcast.spring.aop.before;

import com.itcast.spring.aop.domain.User;

/**
* @author 叶林生 
* @date：2017年7月8日 下午9:27:12
* @version 1.0
* 
*/
public interface IUserDao {
	
	public void add(User user);
	public void delete();

}
