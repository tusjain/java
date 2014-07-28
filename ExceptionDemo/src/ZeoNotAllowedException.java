public class ZeoNotAllowedException extends RuntimeException{
//public class ZeoNotAllowedException extends Exception{
	
	String details = " This is details of ZeroNotAllowedException";
	ZeoNotAllowedException(String details){
		this.details = details;
	}
	
   public String toString(){
	  return "This is to string version of ZeoNotAllowedException" ;
   }
   
   public String getMessage(){
	  return "This is to getMessage version of ZeoNotAllowedException";
   }
   
   public void printStackTrace(){
	  System.out.println(" Here is stackstrace print of ZeoNotAllowedException");
   }
}