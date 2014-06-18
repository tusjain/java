import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListDemo {

	public static void main(String[] args) {
		// without Generics
		List list1 = new ArrayList();
		list1.add(new Integer(2));
		list1.add("a String");
			//casting is needed
		Integer integer = (Integer) list1.get(0);
		String string   = (String) list1.get(1);

		// with Generics
		List<String> list2 = new ArrayList<String>();
		list2.add("a String");
		//list2.add (new Integer(2));   // Can not add any thing to list but String
		
			// casting is not needed
		String s1 = list2.get(0);
		
		// for each loop
		for(String s2 : list2){
			  System.out.println(s2);
			}

		// iterating a generic list
		List<String> list3 = new ArrayList<String>();
	    Iterator<String> iterator = list3.iterator();
		while(iterator.hasNext()){
		  String aString = iterator.next();
		}


	}

}
