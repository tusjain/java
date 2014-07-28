import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Collections;


public class SetDemo {
	
	public static void main(String[] str){
	
	ArrayList<String> companies=new ArrayList<String>();
	companies.add("IBM");
	companies.add("Apple");
	companies.add("SAP");
    companies.add("Apple");
    companies.add(null);
    companies.add(null);
    companies.add("Oracle");
    Set<String> unique=new HashSet<String>();
    //HashSet<String> unique=new HashSet<String>();
    for(String company:companies){
    	unique.add(company);        
    	}
    //System.out.println(unique);
    
    Object[] objs = unique.toArray();
   /* for(int i=0; i < objs.length; i++){
		System.out.println(" In traditional for loop at " + i + " location:  " + objs[i]);
	}*/
    
    for(Object obj:objs){
    	if(obj != null){
    		System.out.println("Printing using for each loop: " + obj.toString());
    	}
    	/*if(obj.equals(null)){
    		System.out.println(" Not printing");
    	}else{
    		System.out.println("Printing using for each loop: " + obj.toString());
    	}*/
    }    
   /* String obj1 = new String("xyz");
    String obj2 = new String("xyz");
    if(obj1 == obj2){
       System.out.println("obj1==obj2 is TRUE in == ");
    } else{
      System.out.println("obj1==obj2 is FALSE in == ");
    }
    
    if(obj1.equals(obj2)){
    	System.out.println("obj1==obj2 is TRUE in equals ");
    } else{
      System.out.println("obj1==obj2 is FALSE in equals ");
    }*/
    
    
    /*Iterator<String> itr = unique.iterator();
    String str1 = null;
    while(itr.hasNext()){
    	str1=itr.next();
    	System.out.println(str1);
    	//System.out.println("Hello");
    	}*/
    
    Collection syncroUnique = Collections.synchronizedCollection(unique);
    
    Enumeration enu = Collections.enumeration(unique);
    String str2 = null;
    while(enu.hasMoreElements()){
    	System.out.println(" using emumeration : "+ enu.nextElement());
    }
    
	}
}