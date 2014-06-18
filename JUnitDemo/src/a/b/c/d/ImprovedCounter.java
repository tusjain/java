package a.b.c.d;

public class ImprovedCounter {
int count;
	
	public ImprovedCounter(){
		this.count = 0;
	}
	
	public void increment (){
		++this.count;
	}
	public void decrement (){
		if (getCount()==0){
			//do not do any thing
		}
		--this.count;
	}
	
	public int getCount (){
		return count;
	}
}
