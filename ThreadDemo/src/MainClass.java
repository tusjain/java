
public class MainClass {
	public static void main(String[] args) {
		//PrimeThread pt = new PrimeThread(2);
		try{
			/*
			Runnable h = new PrimeThread(5);
			Thread t1 = new Thread(h);
			Thread t2 = new Thread(h);
			t1.start();
			t1.sleep(10000);
			t2.start();
			*/
			
			PrimeThread h1 = new PrimeThread();
			h1.setStartNumber(30);
			Thread t3 = new Thread(h1);
			t3.start();
			Thread.sleep(1); 
			h1.setStartNumber(3);
			Thread t4 = new Thread(h1);
			t4.start();
			
		}catch(Exception e){
			System.out.println(" I am in exception");
		}
		//pt.run();
	}
}