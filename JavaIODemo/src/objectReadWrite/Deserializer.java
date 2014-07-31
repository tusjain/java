package objectReadWrite;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
 
public class Deserializer{
 
   public static void main (String args[]) {
	   Deserializer deserializer = new Deserializer();
	   Address address = deserializer.deserialzeAddress();
	   System.out.println(address);
   }
 
   public Address deserialzeAddress(){
 	   Address address;
	   try{
 		   FileInputStream fin = new FileInputStream("c:\\address.ser");
		   ObjectInputStream ois = new ObjectInputStream(fin);
		   address = (Address) ois.readObject();
		   ois.close();
 		   return address;
	   }catch(Exception ex){
		   ex.printStackTrace();
		   return null;
	   } 
   } 
}