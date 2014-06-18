public class PrimeThread implements Runnable{
//public class PrimeThread extends Thread{
//public class PrimeThread extends DummySuperClass implements Runnable{
	float finalNumber;
	int startNumber;
	int counter =0;
    public void setStartNumber(int startNumber) {
		this.startNumber = startNumber;
	}
	PrimeThread(int number) {
    	startNumber = number;
    }
   PrimeThread(){}
    public float computeFactorial(int number){
    	if (number > 1){
    		counter ++;
    		//System.out.println("Counter is "+ counter);
    		return finalNumber= number* (computeFactorial(number-1));
    	}
    	else{
    		System.out.println ("It is complete");
    		return 1;
    	}
    }
    public void run(){
    	System.out.println ("It is answer:  "+ computeFactorial(startNumber));
    }
}