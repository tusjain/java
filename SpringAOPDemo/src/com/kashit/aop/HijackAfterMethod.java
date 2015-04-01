package com.kashit.aop;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
 
public class HijackAfterMethod implements AfterReturningAdvice{
	//int x =1;
	@Override

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
	        System.out.println("HijackAfterMethod : After method hijacked!");
	}
	
	/*
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		if(x==1){
			throw new IllegalArgumentException();
		}
	}
	*/
}