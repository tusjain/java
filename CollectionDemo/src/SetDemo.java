import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class SetDemo {
	
	public void m1(){
	
	ArrayList<String> companies=new ArrayList<String>();
	companies.add("Apple");
    companies.add("Apple");
    companies.add(null);
    companies.add(null);
    //Set<String> unique=new HashSet<String>();
    HashSet<String> unique=new HashSet<String>();
    for(String company:companies){
    	unique.add(company);        
    }
    System.out.println(unique);
	}

}
