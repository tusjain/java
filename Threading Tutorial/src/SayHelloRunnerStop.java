public class SayHelloRunnerStop implements Runnable {
	private volatile boolean running = true;
	public void stopIt(){
		running = false;
	}
	@Override
	public void run() {
		while(running)
			System.out.println("Hi there!");
	}
}