public class SayHello extends Thread {
	public static void main(String[] args) {
		new SayHello().start();
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hi there!");
		}
	}
}