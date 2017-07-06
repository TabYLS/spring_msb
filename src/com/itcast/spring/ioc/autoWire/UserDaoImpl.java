package com.itcast.spring.ioc.autoWire;

import com.itcast.spring.ioc.dao.IUserDao;

/**
* @author 叶林生 
* @date：2017年7月4日 下午9:48:53
* @version 1.0
* 
*/
public class UserDaoImpl implements IUserDao {
	
	private int daoID;

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
	
}
