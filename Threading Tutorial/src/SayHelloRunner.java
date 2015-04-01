public class SayHelloRunner implements Runnable {
	public static void main(String[] args) {
		new Thread(new SayHelloRunner()).start();
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hi there!");
		}
	}
}