
//public class PrimeThread implements Runnable{
public class PrimeThread extends Thread{

	float finalNumber;
	int startNumber;
	
    PrimeThread(int number) {
    	startNumber = number;
    }
    PrimeThread(){}

    public float computeFactorial(int number){
    	if (number > 1){
    		return finalNumber= number* (computeFactorial(number-1));
    	}
    	else{
    		System.out.println ("It is complete");
    		return 1;
    	}
    	
    }
    
    public void run(){
    	System.out.println ("Factorial of "+ startNumber + " is:  "+ computeFactorial(startNumber));
    }
}