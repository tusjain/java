package decorator;
import java.util.Random; 
class Number { 
 public void print() { 
 System.out.println(new Random().nextInt()); 
 } 
} 
 
class Decorator { 
 public Decorator() {  
	 System.out.print("Random number: ");//add a description to the number printed 
 new Number().print(); 
 } 
} 
 
class SubNumber extends Number{ 
 public SubNumber() { 
 super(); 
 System.out.print("Random number: "); 
 print(); 
 } 
} 
 
class Test { 
 public static void main(String[] args) { 
 new Decorator(); 
 new SubNumber(); 
 } 
} 
