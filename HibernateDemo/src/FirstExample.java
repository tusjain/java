import org.hibernate.*;
import org.hibernate.cfg.*;

public class FirstExample {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		try{	
		sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Contact cnt = new Contact();
		cnt.setfName("Sunil");
		cnt.setlName("Gavaskar");
		cnt.seteMail("sunil.gawaskar@indiaCricket.com");
		cnt.setId(1);
		session.save(cnt);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}