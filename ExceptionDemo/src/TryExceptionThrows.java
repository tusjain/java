public class TryExceptionThrows {
	 float addition (float a, float b){
	 System.out.println(" I am in addition float & float");
		 
		 return a+b;
	 }
	 
	 float addition (String a, String b) throws NumberFormatException, NullPointerException{
		 System.out.println(" I am in addition string & string");
		 Float fa = new Float(a);
		 float a1 = fa.floatValue();
		 fa = null;
		 float b1 =  (new Float(b)).floatValue();
		 return a1 + b1;
	 }
	 
	 public static void main(String[] args){
		 TryExceptionThrows tet = new TryExceptionThrows();
		 System.out.println( "addition of two float numbers is : " + tet.addition(1.0f, 2.4f));
		 System.out.println("addition of two strings is : " + tet.addition("2.0", "3.6"));
		 try{
		 		 System.out.println("addition of two strings is : " + tet.addition("Tomi", "5.9"));
		 		 /**
		 		 try{
		 			 
		 		 }
		 		 catch(ArrayIndexOutOfBoundsException aioe){
		 			 
		 		 }
		 		*/
		 } catch(NumberFormatException nfe){ 
			 System.out.println(" Please provide strings which can be converted into numbers");
		 } catch(NullPointerException npe){ 
			 System.out.println("It is possible to throw this exception as well");
		 }catch(Exception e){
			 System.out.println(" I wll catch all exceptions here");
		 }
	}
}