public class TryCatchThrowWithCustomException {
	float addition (float a, float b){
		 System.out.println(" I am in addition float & float");
		 return a+b;
	 }
	 
	 float addition (String a, String b) {
	 //float addition (String a, String b) throws ZeoNotAllowedException {
		 System.out.println(" I am in addition string & string");
		 
		 Float fa = new Float(a);
		 float a1 = fa.floatValue();
		 float b1 =  (new Float(b)).floatValue();
		 
		 if (a1 == 0.0f || b1 == 0.0f){
			 System.out.println(" addition with zeo is not allowed");
			 throw new ZeoNotAllowedException("Sorry zeros are not allowed");
			 //System.out.println(" addition with zeo is not allowed");
		 }
		 //throw new RuntimeException(" who can stop me !!");
		  return a1 + b1;
	 }
	 	
	 public static void main(String[] args){
		 TryCatchThrowWithCustomException tet = new TryCatchThrowWithCustomException();
		 try{
			 System.out.println( "addition of two float numbers is : " + tet.addition(1.0f, 2.4f));
			 System.out.println("addition of two strings is : " + tet.addition("2.0", "3.6"));
			 System.out.println("addition of two strings is : " + tet.addition("0.0", "3.6")); 
		 }catch(NumberFormatException nfe){
			 System.out.println(" I am handling number format exception");
		 }catch (ZeoNotAllowedException npe){
			 System.out.println(" I am handling Zeo Not Allowed  exception");
		 }catch(Exception e){
			 System.out.println(" I am handling all exceptions");
		 }finally{
			 System.out.println(" I am in finally to relcaim all resources");
		 }
	 }
}
