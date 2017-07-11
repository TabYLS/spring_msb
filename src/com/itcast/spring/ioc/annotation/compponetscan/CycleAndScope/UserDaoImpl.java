package com.itcast.spring.ioc.annotation.compponetscan.CycleAndScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Repository;

import com.itcast.spring.ioc.dao.IUserDao;

/**
* @author 叶林生 
* @date：2017年7月4日 下午9:48:53
* @version 1.0
* 
*/
@Repository("userDaoImpl")
public class UserDaoImpl implements IUserDao {
	
	private int daoID;
	
	//在构造完成之后执行，也就是初始化
	@PostConstruct
	public void init() {
		System.out.println("init............");
	}
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
	public int getDaoID() {
		return daoID;
	}

	public void setDaoID(int daoID) {
		this.daoID = daoID;
	}

	@Override
	public String toString() {
		return "UserDaoImpl [daoID=" + daoID + "]";
	}
	
	//bean销毁之前执行
	@PreDestroy
	public void destroy() {
		System.out.println("destroy................");
	}
	
}
