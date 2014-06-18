import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapDemo {

	public static void main(String[] args) {
		// without Generics
		Map map1 = new HashMap();
		
		Integer key11   = new Integer(123);
		String  value11 = "value 11";
		
		String key12   = "key12";
		String  value12 = "value 12";
		
		map1.put(key11, value11);
		map1.put(key12, value12);
		
		Object value1_1 = map1.get(key11); // do you know data type of value1_1?
		Object value1_2 = map1.get(key12); // do you know data type of value1_2?
		
		// with Generics
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		
		Integer key21   = new Integer(123);
		String  value21 = "value 21";
		
		String key22   = "key22";
		String  value22 = "value 22";
		
		map2.put(key21, value21);
		//map2.put(key22, value22);  // Can you put this in map2?
		
		String value2_1 = map2.get(key21);

		// iterator
		Map<Integer, String> map3 = new HashMap<Integer, String>();
		
		Iterator<Integer> keyIterator   = map3.keySet().iterator();
		while(keyIterator.hasNext()){
		  Integer aKey   = keyIterator.next();
		  String  aValue = map3.get(aKey);
		}
		
		Iterator<String>  valueIterator = map3.values().iterator();
		while(valueIterator.hasNext()){
		  String aString = valueIterator.next();
		}

		//For each loop
		Map<Integer, String> map4 = new HashMap<Integer, String>();

		for(Integer aKey : map4.keySet()) {
		    String aValue = map4.get(aKey);
		    System.out.println("" + aKey + ":" + aValue);
			}

		for(String aValue : map4.values()) {
		    System.out.println(aValue);
			}

		
	}

}
