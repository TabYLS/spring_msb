package com.itcast.spring.aop.noImpl;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
* @author 叶林生 
* @date：2017年7月9日 上午10:40:59
* @version 1.0
* 
*/
@Aspect
@Component("logInterceptor")
public class LogInterceptor {
	
	@Before("execution(public void com.itcast.spring.aop.noImpl.UserService.*())")
	public void beforeMethod() {
		System.out.println("给没有实现接口的类进行切入。。。。。。。。。。");
	}

}
