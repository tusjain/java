package a.b.c;

public class Counter { 
	int count;
	
	public Counter(){
		this.count = 0;
	}
	
	public void increment (){
		System.out.println("I am in increment");
		System.out.println("counter value before increment  : "+ count);
		++this.count;
		++this.count;
		//++this.count;
		System.out.println("counter value after increment  : "+ count);
	}
	public void decrement (){
		--this.count;
	}
	
	public int getCount (){
		return count;
	}

}
