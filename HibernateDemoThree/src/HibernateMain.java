import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateMain {

	public static void main(String[] args) {
		
		Country country=new Country("India");
				
		Language hindiLan=new Language("Hindi");
		hindiLan.getLanguageSpeakingCountries().add(country);
		
		Language engLan=new Language("English");
		engLan.getLanguageSpeakingCountries().add(country);
		
		country.getLanguages().add(hindiLan);
		country.getLanguages().add(engLan);
				
		Configuration configuration=new Configuration();
		configuration.configure();
		ServiceRegistry sr= new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		SessionFactory sf=configuration.buildSessionFactory(sr);
		Session ss=sf.openSession();
		
		ss.beginTransaction();
		ss.save(country);
		ss.getTransaction().commit();
		ss.close();
		
	}
}
