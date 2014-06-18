package genericMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericMethod {
	public <T> T addAndReturn(T element, Collection<T> collection){
	    collection.add(element);
	    return element;
	}

	public static void main(String[] args) {
		
		GenericMethod gm = new GenericMethod();
		
		String stringElement1 = "stringElement";
		List<String> stringList = new ArrayList<String>();
		String theElement1 = gm.addAndReturn(stringElement1, stringList);    


		Integer integerElement1 = new Integer(123);
		List<Integer> integerList = new ArrayList<Integer>();
		Integer theElement2 = gm.addAndReturn(integerElement1, integerList);
		
		String stringElement2 = "stringElement";
		List<Object> objectList = new ArrayList<Object>();
		Object theElement = gm.addAndReturn(stringElement2, objectList);    

		/*
		 // is this possible?
		Object objectElement = new Object();
		List<String> stringList2 = new ArrayList<String>();
		Object theElement = addAndReturn(objectElement, stringList2);
		*/
		
	}
}
