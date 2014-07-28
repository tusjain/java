import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,Integer> numbers=new HashMap<String,Integer>();
        numbers.put("one",new Integer(1));
        numbers.put("two",2);
        numbers.put("three",3);
        //System.out.println(numbers.get("one"));//1
        //System.out.println(numbers);//{one=1, two=2, three=3} or {two=2, three=3, one=1}
        //System.out.println(numbers.containsKey("two"));//true
        //System.out.println(numbers);//{one=1, two=2, three=3}
        //System.out.println(numbers.containsValue(4));//false
        //System.out.println(numbers.remove("three"));//3
        //System.out.println(numbers);//{one=1, two=2}
        //numbers.clear();
        //System.out.println(numbers);//{}
        
        Map<String,Integer> numbers1=new HashMap<String,Integer>();
        numbers1.put("one1",new Integer(1));
        numbers1.put("two",6);
        numbers1.put("three1",3);
        
        numbers.putAll(numbers1);
        System.out.println(numbers);
        
    /*  Set<String> set = numbers.keySet();
        Iterator<String> itr = set.iterator();
        String str1 = null;
        while(itr.hasNext()){
        	str1=itr.next();
        	System.out.println(str1);
        	}*/
        
        /*Enumeration enu = Collections.enumeration(set);
        String str2 = null;
        while(enu.hasMoreElements()){
        	System.out.println(" using emumeration : "+ enu.nextElement());
        }*/ 
         
     /*  Collection<Integer> coll = numbers.values();
       Iterator<Integer> itr = coll.iterator();
       Integer intr = null;
       while(itr.hasNext()){
    	   intr=itr.next();
       	System.out.println(intr);
       	}*/
       
		for (Map.Entry<String, Integer> entry : numbers.entrySet()){
		    System.out.println(entry.getKey() + "  /  " + entry.getValue());
		}

		ArrayList<String> arrayList1=new ArrayList<String>();
		arrayList1.add("IBM");
		arrayList1.add("Apple");
		arrayList1.add("SAP");
		arrayList1.add("Apple");
		arrayList1.add(null);
		arrayList1.add(null);
		arrayList1.add("Oracle");
		
		ArrayList<String> arrayList2=new ArrayList<String>();
		arrayList2.add("Sears");
		arrayList2.add("Wallmart");
		arrayList2.add("Macys");
		
		ArrayList<String> arrayList3=new ArrayList<String>();
		arrayList3.add("Wallgreans");
		arrayList3.add("CVS");
		arrayList3.add("RiteAid");
	    
	    Map<String,ArrayList> mapConatingOtherCollection=new HashMap<String,ArrayList>();
	    
	    mapConatingOtherCollection.put("TechCompanies", arrayList1);
	    mapConatingOtherCollection.put("DepartmentalStores", arrayList2);
	    mapConatingOtherCollection.put("Pharmacies", arrayList3);
	}

}
