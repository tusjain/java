import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.HashSet;


public class SetDemo {

	public static void main(String[] args) {
		
		// without Generics
		Set set1 = new HashSet();
		set1.add("a string");
		set1.add(new Integer(2));
			//casting is needed
		Iterator iterator1 = set1.iterator();
		while(iterator1.hasNext()){
		  Object aobject = iterator1.next();  // do you know data type of aObject?
		}

		
		// with Generics
		Set<String> set2 = new HashSet<String>();
		set2.add("a string");
		//set2.add(new Integer(2));   // Can not add any thing to set but String
		
		// casting is not needed
		Iterator<String> iterator2 = set2.iterator();
		while(iterator2.hasNext()){
		  String aString = iterator2.next();
		}
		
		// For each loop
		Set<String> set3 = new HashSet<String>();
		for(String aString : set3) {
		    System.out.println(aString);
		}
	}
}