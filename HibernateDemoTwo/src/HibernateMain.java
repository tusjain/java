import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateMain {

	public static void main(String[] args) {
		
		Country countryIndia=new Country("China",50000000);
		
		State mpState=new State("Hubei",1000000);
		State maharastraState=new State("Henan",2000000);
		
		countryIndia.getListOfStates().add(mpState);
		countryIndia.getListOfStates().add(maharastraState);
				
		Configuration configuration=new Configuration();
		configuration.configure();
		ServiceRegistry sr= new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		SessionFactory sf=configuration.buildSessionFactory(sr);
		Session ss=sf.openSession();
		
		ss.beginTransaction();
		ss.save(countryIndia);
		ss.getTransaction().commit();
		ss.close();
		
	}

}
