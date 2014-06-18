package bean;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.rose.Spring3HelloWorld;

import bean.Address;
import bean.Company;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
		
		
		//XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("SpringHelloWorld.xml"));
		
		//Spring3HelloWorld myBean = (Spring3HelloWorld) beanFactory.getBean("Spring3HelloWorldBean");
		
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("SpringHelloWorld.xml");
	    
	    // KashItHello obj = (KashItHello) context.getBean("KashItHelloBean");

		/*
		 * Below line will scan the given package for Components. It will be
		 * refreshed then to get bean from the same.
		 */
		annotationContext.scan("bean");
		annotationContext.refresh();

		/*
		 * Here Class name is used to get the object of Address class
		 */
		Address address = annotationContext.getBean(Address.class);

		/*
		 * Here ID name is used to get the Object of Company Class
		 */
		Company company = (Company) annotationContext.getBean("company1");

		System.out.println("Address Object :::::" + address.toString());

		System.out.println("Company Object :::::" + company.toString());

	}

}