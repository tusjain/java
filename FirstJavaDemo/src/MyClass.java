public class MyClass {
	public int i;
	private String name;
	

	public int doubleMe(int i){
		return 2*(i);
	}
	
	private int tripleMe(int j){
		return 3*j;
	}
	
	int quadMe(){
		return 4*i;
	}
	
	protected void finalize(){
		System.out.println(" I am in finalize");		
	}
}