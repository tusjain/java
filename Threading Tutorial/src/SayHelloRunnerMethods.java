public class SayHelloRunnerMethods implements Runnable {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new SayHelloRunner());
		thread.start();
		thread.join();
		System.exit(3);
	}
	@Override
	public void run() {
		int i = 0;
		while(i < 10000){
			System.out.println(i);
			i++;
		}
	}
}