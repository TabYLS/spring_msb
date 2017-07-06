package com.itcast.spring.ioc.dao.impl;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.itcast.spring.ioc.dao.IUserDao;

/**
* @author 叶林生 
* @date：2017年7月4日 下午9:48:53
* @version 1.0
* 
*/
public class UserDaoImpl implements IUserDao {
	
	private List<String> listStr;
	private Set<String> setStr;
	private Map<String, String> mapStr;
	private Properties properties;

	@Override
	public void add() {
		System.out.println("插入用户spring。。。。。。。。。");
		
	}

	@Override
	public void select() {
		System.out.println("查找用户。。。。。。。。。。");
		
	}

	@Override
	public void delete() {
		System.out.println("删除用户.............");
		
	}

	public List<String> getListStr() {
		return listStr;
	}

	public void setListStr(List<String> listStr) {
		this.listStr = listStr;
	}

	public Set<String> getSetStr() {
		return setStr;
	}

	public void setSetStr(Set<String> setStr) {
		this.setStr = setStr;
	}

	public Map<String, String> getMapStr() {
		return mapStr;
	}

	public void setMapStr(Map<String, String> mapStr) {
		this.mapStr = mapStr;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "UserDaoImpl [listStr=" + listStr + ", setStr=" + setStr + ", mapStr=" + mapStr + ", properties="
				+ properties + "]";
	}

}
