package genericWildcards;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		List<A> listA = new ArrayList<A>();
		List<B> listB = new ArrayList<B>();
		List<C> listC = new ArrayList<C>();
		
		List listA1 = new ArrayList();
		List listB1 = new ArrayList();
		List listC1 = new ArrayList();
		
		listA1.add(new A());
		listA1.add(new C());
		listB1.add(new B());
		
		// is it possible
		listA1 = listB1;
		listB1 = listA1;
		
		// is it possible
		//listA = listB;
		//listB = listA;
		
		//List<B> listB1 = listA;
		
		// The unknown wild card
		//List<?> means a list typed to an unknown type. This could be a List<A>, a List<B>, a List<String> etc.
		List<?> listUknown1 = new ArrayList<A>();  
		 
		// The extends wild card boundry
		//List<? extends A> means a List of objects that are instances of the class A, or subclasses of A (e.g. B and C).
		List<? extends A> listUknown2 = new ArrayList<A>();
		
		// The super wild card boundry
		//List<? super B> means a List of objects that are instance of B, or super class of B (e.g. A)
		List<? super B> listUknown3 = new ArrayList<B>();
		}
	
	public void processElements(List<A> elements){   // this method being called for "A" only not for "B" or "C"
		for(A a : elements){
			System.out.println(a.getValue());
		   }
		}
	
	public void processElements1(List<?> elements){
		/*
		 * The processElements() method can now be called with any generic List as parameter. 
		 * For instance a List<A>, a List<B>, List<C>, a List<String> etc. Here is a valid example: 
		 * 
		 * List<A> listA = new ArrayList<A>();
		 * processElements1(listA);
		 */
	   for(Object o : elements){
		   System.out.println(o);
		   }
		}
	
	public void processElements2(List<? extends A> elements){
		/*
		 * List<? extends A> means a List of objects that are instances of the class A, or subclasses of A
		 * (e.g. B and C). When you know that the instances in the collection are of instances of A or 
		 * subclasses of A, it is safe to read the instances of the collection and cast them to A instances.
		 */
	   for(A a : elements){
		   	System.out.println(a.getValue());
	   		}
	   /*
	    * You can now call the processElements() method with either a List<A>, List<B> or List<C>. 
	    * Hence, all of these examples are valid: 
	    * 
		*	List<A> listA = new ArrayList<A>();
		*	processElements(listA);
		*	
		*	List<B> listB = new ArrayList<B>();
		*	processElements(listB);
		*	
		*	List<C> listC = new ArrayList<C>();
		*	processElements(listC);
		
		* The processElements() method still cannot insert elements into the list, because you don't know 
		* if the list passed as parameter is typed to the class A, B or C. 
	    */
	}
	
	public void processElements3(List<? super A> list){
		/*
		 * List<? super A> means that the list is typed to either the A class, or a superclass of A.
		 * When you know that the list is typed to either A, or a superclass of A, it is safe to 
		 * insert instances of A or subclasses of A (e.g. B or C) into the list. 
		 */
		list.add(new A());
	    list.add(new B());
	    list.add(new C());
	    
	    
	    /*
	     * All of the elements inserted here are either A instances, or instances of A's superclass. 
	     * Since both B and C extend A, if A had a superclass, B and C would also be instances of that superclass.
	     * You can now call insertElements() with either a List<A>, or a List typed to a superclass of A. 
	     * Thus, this example is now valid: 
	     * 
		 *		List<A> listA = new ArrayList<A>();
		 *  	insertElements(listA);
		 *	
		 *		List<Object> listObject = new ArrayList<Object>();
		 *		insertElements(listObject);
		 *	
		 *	The insertElements() method cannot read from the list though, except if it casts the read 
		 *	objects to Object. The elements already present in the list when insertElements() is called 
		 *	could be of any type that is either an A or superclass of A, but it is not possible to know 
		 *	exactly which class it is. However, since any class eventually subclass Object you can read 
		 *	objects from the list if you cast them to Object. Thus, this is valid:
		 *		 
		 *		Object object = list.get(0);
		 *	
		 *  But this is not valid: 
		 *
		 *		A object = list.get(0);				
		 *
	     */
	    
	}
	public static void insertElements(List<? super A> list){
	    list.add(new A());
	    list.add(new B());
	    list.add(new C());
	}


}
