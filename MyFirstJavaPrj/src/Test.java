import java.util.Arrays;

public class Test implements Range {
	int from;
	int to;
	int[] a = new int[10] ;
	
	public Test(){		
	}
	
	public Test(int from, int to){
		this.from = from;
		this.to = to;
		int i= 0;
		a[0] =to;
		a[9] = from;
		for(int j =1; j<9; j++){
			  a[i] = j;	
			  i++;
		 }
	}
	
	 public Range newRange(int from,int to){
		 return new Test( from,  to);
	 }
	 
	 public boolean isIn(int value){
		 if(value<=to || value >=from){
			 return true;
		 }
		 return false;
	 }

	 public int min(){
		 Arrays.sort(this.a);
		 return this.a[0];
		 
		}
	 public int max(){
		Arrays.sort(this.a);
		return this.a[9];
	 }
	 
	 /**
	    * Add range 'r' to this range, and return 'this'.
	    * 'r' and this may denote disjoint ranges, for instance:
	    *  r.newRange(1.5).add(r.newRange(8,10)) denotes a range
	    * including 1,2,3,4,5,8,9,10
	    */
	 public Range add(Range r){
		 return new Test();
	 }
}