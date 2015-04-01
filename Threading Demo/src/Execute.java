public class Execute {

	public static void main(String[] args) {
		try{
		// START: Using Runnable Interface
		 //PrimeThread th = new PrimeThread(34);
		 //new Thread(th).start();
		// System.out.println("It is new thread");
		//END: Using Runnable Interface
		
		//START: Using Thread Class
		PrimeThread th = new PrimeThread(20);
		th.setPriority(10);
		th.start();
		PrimeThread th1 = new PrimeThread(1);
		th1.start();
		//END: Using Thread Class
		
		//System.out.println("It is Daemon thread START");
		//PrimeThread th1 = new PrimeThread();
		//th1.sleep(5000);
		//System.out.println("It is Daemon thread END  :" + th1.computeFactorial(3));
		
 
		}
		catch(IllegalThreadStateException ile){
			ile.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
