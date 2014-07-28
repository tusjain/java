import java.util.AbstractList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		//AbstractList<String> v = new Vector<String>();
		v.add("Apple");
		v.add("IBM");
		v.add("MicroSoft");
		v.add(null);
		for(int i=0; i < v.size(); i++){
			System.out.println(" In traditional for loop at " + i + " location" + v.get(i));
		}
		
		Object[] objs = v.toArray();
		for(Object obj:objs){
			System.out.println("Printing using for each loop: " + obj.toString());
		}
		
		Iterator<String> itr=v.iterator();
        String str1 = null;
        while(itr.hasNext()){
        	str1=itr.next();
        	System.out.println(str1);
        	}
        
        Enumeration<String> e1 = v.elements();
        String str2 = null;
        while(e1.hasMoreElements()){
        	System.out.println(" using emumeration : "+ e1.nextElement());
        }
                
        for (Enumeration<String> e = v.elements(); e.hasMoreElements();){
            System.out.println(e.nextElement());
        }
	}
}