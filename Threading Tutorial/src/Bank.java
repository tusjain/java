public class Bank {
	private int funds = 100;
	public void deposit(int money){
		synchronized (this){
			funds += money;
		}
	}
	public synchronized void withdraw(int money){
		if(funds > money)
			funds -= money;
	}
}