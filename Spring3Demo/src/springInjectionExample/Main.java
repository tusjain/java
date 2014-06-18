package springInjectionExample;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
public class Main {
  public static void main(String[] args) {
  XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("context_springInjectionExample.xml"));
  Inject demo = (Inject) beanFactory.getBean("mybean");
  System.out.println(demo);
  }
}