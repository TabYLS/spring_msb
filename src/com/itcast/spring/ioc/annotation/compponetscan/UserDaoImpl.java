package com.itcast.spring.ioc.annotation.compponetscan;

import org.springframework.stereotype.Repository;

import com.itcast.spring.ioc.dao.IUserDao;

/**
* @author 叶林生 
* @date：2017年7月4日 下午9:48:53
* @version 1.0
* 
*/

//@Component注解默认的名字就是将类的首字母变成小写，最好是给它手动写上名字@Component(value="XXXX")或者@Component("XXX")都可以
//在2.5中 @Component, @Repository, @Service, or @Controller 它们可以视为相同的，但是还是区分一下，@Controller用在控制层，service用在service层，Repository用在数据那一层
@Repository("userDaoImpl")
public class UserDaoImpl implements IUserDao {
	
	public UserDaoImpl(){}
	
	private int daoID;
	
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
	
	public void destroy() {
		System.out.println("destroy................");
	}
	
}
