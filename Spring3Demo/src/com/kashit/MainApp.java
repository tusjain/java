package com.kashit;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
	      ApplicationContext context = new ClassPathXmlApplicationContext("SpringHelloWorld.xml");
	      
	     // ApplicationContext context1 = new ClassPathXmlApplicationContext("SpringHelloWorld.xml");

	      KashItHello obj = (KashItHello) context.getBean("KashItHelloBean");
	     // KashItHello obj1 = (KashItHello) context1.getBean("KashItHelloBean");

	      obj.hello();
	     // obj1.hello();
	      
	     // System.out.println("obj   : "  + obj);
	     // System.out.println("obj1   : "  + obj1);
	      
	      
	     // System.out.println("context   : "  + context);
	     // System.out.println("context1   : "  + context1);
	      
	      
	      //System.out.println("context   : "  + context.hashCode());
	      //System.out.println("context1   : "  + context1.hashCode());
	      
	      
	      
	      
	      
	   }

}
