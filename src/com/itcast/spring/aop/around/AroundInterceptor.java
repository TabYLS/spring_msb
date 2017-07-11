package com.itcast.spring.aop.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
* @author 叶林生 
* @date：2017年7月9日 下午9:26:23
* @version 1.0
* 
*/
@Aspect
@Component("aroundInterceptor")
public class AroundInterceptor {

	@Around("execution(public void com.itcast.spring.aop.around.UserDao.add(com.itcast.spring.aop.domain.User))")
	public Object  around(ProceedingJoinPoint pjp) throws Throwable {
		// start stopwatch
		System.out.println("around开始。。。。");
	    Object retVal = pjp.proceed();
	    // stop stopwatch
	    System.out.println("around结束。。。。");
	    return retVal;
	}
}
