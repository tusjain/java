public class TryCatchThrow {
	float addition (float a, float b){
		System.out.println(" I am in addition float & float");
		return a+b;
	 }
	 
	 //float addition (String a, String b) {
		 //throw new NullPointerException("Sorry zeros are not allowed");
	 float addition (String a, String b) throws NumberFormatException, NullPointerException  {
		System.out.println(" I am in addition string & string");
		Float fa = new Float(a);
		float a1 = fa.floatValue();
		float b1 =  (new Float(b)).floatValue();
		 
		if (a1 == 0.0f || b1 == 0.0f){
			 System.out.println(" addition with zeo is not allowed");
			 throw new NullPointerException("Sorry zeros are not allowed");
			 //throw new RuntimeException(" who can stop me !!");
			 //throw new Exception("I can not throw Exception");
		 }
		
		return a1 + b1;
	 }
	 
	 public static void main(String[] args){
		 TryCatchThrow tet = new TryCatchThrow();
		 //System.out.println("addition of two strings is : " + tet.addition("0.0", "3.6"));
		 try{
			 //System.out.println( "addition of two float numbers is : " + tet.addition(1.0f, 2.4f));
			 //System.out.println("addition of two strings is : " + tet.addition("2.0", "3.6"));
			 System.out.println("addition of two strings is : " + tet.addition("0.0", "3.6"));
			 //System.out.println("addition of two strings is : " + tet.addition("Hello", "3.6")); 
		 }catch(NumberFormatException nfe){
			 System.out.println(" I am handing number format exception");
		 }catch (NullPointerException npe){
			 System.out.println(" I am handling null pointer exception");
			 //npe.printStackTrace();
		 }catch(Exception e){
			 System.out.println(" I am handling all exceptions");
		 }finally{
			 System.out.println(" I am in finally to relcaim all resources");
		 }
	}
}