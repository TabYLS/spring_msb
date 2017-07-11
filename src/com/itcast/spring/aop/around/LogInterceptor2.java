package com.itcast.spring.aop.around;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
* @author 叶林生 
* @date：2017年7月9日 上午10:40:59
* @version 1.0
* 
*/
@Aspect
@Component("logInterceptor2")
public class LogInterceptor2 {
	
	/*
	 * 如果织入语法都相同可以抽取出来
	 * @Before("execution(public void com.itcast.spring.aop.around.UserDao.add(com.itcast.spring.aop.domain.User))")
	public void beforeMethod() {
		System.out.println("方法执行之前2。。。。。。。。。。");
	}
	@AfterReturning("execution(public void com.itcast.spring.aop.around.UserDao.add(com.itcast.spring.aop.domain.User))")
	public void afterMethod() {
		System.out.println("方法执行之后。。。。。。。。。。");
	}*/
	
	//抽取织入语法，这里的写法会出现问题，网上查的说是可能是因为jdk的版本原因，所以先把这个知识点了解一下就行
	//jdk在1.7的应该使用aspectjrt-1.7.4  aspectjweaver-1.7.4
	@Pointcut("execution(public * com.itcast.spring.aop..*.*(..))")
	public void myMethod() {};
	
	@Before("myMethod()")
	public void beforeMethod() {
		System.out.println("方法执行之前2(抽取织入语法)。。。。。。。。。。");
	}
	@AfterReturning("myMethod()")
	public void afterMethod() {
		System.out.println("方法执行之后2(抽取织入语法)。。。。。。。。。。");
	}
	
	/*@Before("execution(public void com.itcast.spring.aop.around.UserDao.add(com.itcast.spring.aop.domain.User))")
	public void beforeMethod() {
		System.out.println("方法执行之前2。。。。。。。。。。");
	}
	@AfterReturning("execution(public void com.itcast.spring.aop.around.UserDao.add(com.itcast.spring.aop.domain.User))")
	public void afterMethod() {
		System.out.println("方法执行之后。。。。。。。。。。");
	}*/

}
