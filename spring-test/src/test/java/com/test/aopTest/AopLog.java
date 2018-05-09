package com.test.aopTest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopLog {
	
	@Pointcut("execution(* *.printHelloWorld(..))")
	public void pointcut(){
		
	}
	
	@Before("pointcut()")
	public void before(){
		System.out.println("before");
	}
	
	@After("pointcut()")
	public void after(){
		System.out.println("after");
	}
	
	@Around("pointcut()")
	public void around(ProceedingJoinPoint pjp){
		System.out.println("around before");
        try {
            pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("around after");
	}
}
