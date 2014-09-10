package convertVarargsToAnArray;

import java.util.Set;
import java.util.Vector;

public class Main {
	  public static void main(String[] args) {
	    printMessage("H", "Y", ", ", "how ", "are ", "you", "?");
	  }

	  public static void printMessage(String... messages) {
	    String[] copiedMessage = messages;
	    for (int i = 0; i < messages.length; i++) {
	      System.out.print(copiedMessage[i]);
	    }
	  }
	  
	  public void m1(){
		  System.out.println(" Method with out any parameters");
	  }
	  public void m2(int i, String str){
		  System.out.println(" Method with one or more  parameters");
	  }
	  
	  public void m3(int i, String[] strs, Vector v){
		  System.out.println(" Method with one or more  parameters in which some may be collection or array");
	  }
	  
	  public void m4(int i, String str, int... j){
		  System.out.println(" Method with one or more  parameters");
	  }
	  public void m5(int i, Set set, int... j){
		  System.out.println(" Method with one or more  parameters");
	  }
	  public void m6(int i, Set... set){
		  System.out.println(" Method with one or more  parameters");
	  }
	 /* public void m7(int... i, Set... set){
		  System.out.println(" Method with one or more  parameters");
	  }*/
	 /* public void m8(int... i, Set set){
		  System.out.println(" Method with one or more  parameters");
	  }*/
	  
}