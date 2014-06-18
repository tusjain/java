public class A  {
	int i;
	String name;
	
	
	void callme(){ 
		System.out.println("A’s Callme");}
	
	final void doNotCallMe(){
		System.out.println("A’s doNotCallMe");
	}
	
	protected void finalize() throws Throwable {
		System.out.println("This is last call before garbage collection");
	}
	
	public String toString(){
		return "The toSting value of A is " + i + "  " + name;
	}
	
}
