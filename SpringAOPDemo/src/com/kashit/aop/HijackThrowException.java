package com.kashit.aop;

import org.springframework.aop.ThrowsAdvice;

public class HijackThrowException implements ThrowsAdvice {
	
	public void afterThrowing(Exception e) throws Throwable {
		System.out.println("HijackThrowException : Throw exception hijacked!");
	}
	
	//Printed  - HijackThrowException : Throw exception hijacked!
	//Printed - Stack Trace
	
	/*
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("HijackThrowException : Throw exception hijacked!");
	}
	*/
	//Printed  - HijackThrowException : Throw exception hijacked!
	//Printed - Stack Trace
	
	
	/*
	public void afterThrowing(IndexOutOfBoundsException e) throws Throwable {
		System.out.println("HijackThrowException : Throw exception hijacked!");
	}
	*/
	//Printed - Stack Trace
	/*
	public void afterThrowing() throws Throwable {
		System.out.println("HijackThrowException : Throw exception hijacked!");
	}
	*/
	//Stack trace from org.springframework.aop.framework.ProxyFactoryBean
}