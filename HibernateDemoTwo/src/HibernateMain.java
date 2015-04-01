import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateMain {

	public static void main(String[] args) {
		
		Country countryChina=new Country("China",50000000);
		
		State hubei=new State("Hubei",1000000);
		State henan=new State("Henan",2000000);
		
		countryChina.getListOfStates().add(hubei);
		countryChina.getListOfStates().add(henan);
		/*		
		Configuration configuration=new Configuration();
		configuration.configure();
		ServiceRegistry sr= new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		SessionFactory sf=configuration.buildSessionFactory(sr);
		Session ss=sf.openSession();
		*/
		
		Session ss = Util.retunSession();
		
		ss.beginTransaction();
		ss.save(countryChina);
		ss.getTransaction().commit();
		ss.close();
	}
}