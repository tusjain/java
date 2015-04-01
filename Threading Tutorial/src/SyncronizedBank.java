public class SyncronizedBank {
	private int funds = 100;
	private Object fundLock;
	private UserDetails details = new UserDetails();
	public void deposit(int money){
		synchronized (fundLock){ //Lock Object needs to be acquired to update funds
			funds += money;
		}
	}
	public void createUsername(){
		synchronized (details){ //Lock on the details object mean that the details object will block, but Bank will not.
			details.setName("Bob");
		}
		System.out.println("His name is Bob");
	}
}