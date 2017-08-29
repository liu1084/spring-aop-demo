package com.jim.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by jim on 2017/8/29.
 * This class is ...
 */
@Aspect
public class LogAspect {
	@Before("execution(* com.jim.aop.service.*.*(..))")
	public void before() {
		System.out.println("=============================================before...");
	}

}
