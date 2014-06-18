package inheritanceInSpring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
public class Main {
  public static void main(String[] args) throws Exception {
  XmlBeanFactory bf = new XmlBeanFactory(new ClassPathResource("context_InheritanceInSpring.xml"));
  System.out.println("===============Inheritance demo=================");
  System.out.println(bf.getBean("parent"));
  System.out.println(bf.getBean("child"));
  System.out.println(bf.getBean("subchild"));
 }
}
