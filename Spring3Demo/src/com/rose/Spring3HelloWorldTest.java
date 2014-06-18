package com.rose;

import java.util.Map;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.Assert;

import com.kashit.*;

public class Spring3HelloWorldTest {

public static void main(String[] args) {


	@SuppressWarnings("deprecation")
	XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("SpringHelloWorld.xml"));
	
	//ApplicationContext context = new ClassPathXmlApplicationContext("SpringHelloWorld.xml");
	
	Spring3HelloWorld myBean = (Spring3HelloWorld) beanFactory.getBean("Spring3HelloWorldBean");
	
	
	//ApplicationContext context = new ClassPathXmlApplicationContext("SpringHelloWorld.xml");
    
    // KashItHello obj = (KashItHello) context.getBean("KashItHelloBean");
	
	
	
	myBean.sayHello();
	
	
	KashItHello myHello = (KashItHello) beanFactory.getBean("KashItHelloBean");
	
	myHello.hello();
	}
}       