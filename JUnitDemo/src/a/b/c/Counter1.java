package a.b.c;

public class Counter1 {
	private int count = 0;
	public Counter1(){
		count = 0;
	}

	public int increment(){
		return (2+ count);
	}
	
	public int decrement(){
		return --count;
	}
	
	public int getCount(){
		return count;
	}
}
