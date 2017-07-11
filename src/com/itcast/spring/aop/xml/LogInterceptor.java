package com.itcast.spring.aop.xml;


/**
* @author 叶林生 
* @date：2017年7月9日 上午10:40:59
* @version 1.0
* 
*/
public class LogInterceptor {
	
	public void beforeMethod() {
		System.out.println("方法执行之前(基于xml的配置方式)。。。。。。。。。。");
	}
	
	public void afterMethod() {
		System.out.println("方法执行之后(基于xml的配置方式)。。。。。。。。。。");
	}

}
