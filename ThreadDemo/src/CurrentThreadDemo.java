public class CurrentThreadDemo {
	
	public static void main(String args[]){
		
	  Thread t=Thread.currentThread();
	  
	  System.out.println("Current: "+t);
	  
	  try {
		  
		for(int n=0;n<5; n++) {
			
			System.out.println(n);
			Thread.sleep(1000); 
			}
		
		} catch(InterruptedException e){
			System.out.println("Interrupted"); } 
	}//end of main
}//end of class
