package com.kashit.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kashit.customer.services.CustomerService;
 
public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(	new String[] { "Spring-Customer.xml" });
		// Normal Spring
 		CustomerService cust = (CustomerService) appContext.getBean("customerService");
 		//cust.printName();
 		
 		//ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Customer.xml");
	    //CustomerService cust = (CustomerService) context.getBean("customerService");
		
				
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Customer.xml");
	    //CustomerService cust = (CustomerService) context.getBean("customerService");
		
				
		// Before Advice
		CustomerService cust0 = (CustomerService) appContext.getBean("customerServiceProxy0");
		
		/**
		
		// After Returning Advice
		CustomerService cust1 = (CustomerService) appContext.getBean("customerServiceProxy1");
		
		// After Throwing Advice
	 	CustomerService cust2 = (CustomerService) appContext.getBean("customerServiceProxy2");
	 	
	 	// Around Advice
	 	CustomerService cust3 = (CustomerService) appContext.getBean("customerServiceProxy3");
	      
	      */
/*
		System.out.println("*************************");
		cust.printName();
		System.out.println("*************************");
		cust.printURL();
		System.out.println("*************************");
		
		*/
		/*
		try {
			cust.printThrowException();
		} catch (Exception e) {
			System.out.println("It is exception");
			}
		*/
		
		System.out.println("*************************Before Advice");
		cust0.printName();
		/*
		System.out.println("*************************Before Advice");
		cust0.printURL();
		System.out.println("*************************Before Advice");
		*/
		/*
		try {
			cust0.printThrowException();
		} catch (Exception e) {
			System.out.println("In is exception  -- Before Advice");
			}
	*/		
			
		/**
		System.out.println("*************************After Returning Advice");
		cust1.printName();
		System.out.println("*************************After Returning Advice");
		cust1.printURL();
		System.out.println("*************************After Returning Advice");
		try {
			cust1.printThrowException();
		} catch (Exception e) {
			System.out.println("In is exception  -- After Returning Advice");
			}
		
		System.out.println("*************************After Throwing Advice");
		cust2.printName();
		System.out.println("*************************After Throwing Advice");
		cust2.printURL();
		System.out.println("*************************After Throwing Advice");
		try {
			cust2.printThrowException();
		} catch (Exception e) {
			System.out.println("In is exception -- After Throwing Advice");
			}
		
		System.out.println("*************************Around Advice");
		cust3.printName();
		System.out.println("*************************Around Advice");
		cust3.printURL();
		System.out.println("*************************Around Advice");
		try {
			cust3.printThrowException();
		} catch (Exception e) {
			System.out.println("In is exception -- Around Advice");
			}

*/
		
	}
}