package variable.in.classes;

public class ClassWithVariable {
	
	int i=10;
	public String s1 = "Hello";
	private boolean b1;
	public static int j = 20;
	
	void m1(){
		System.out.println(this.s1);
		System.out.println(i);
		
		int k = 20;
		
		System.out.println(k);
	}
}