package singleton;
public class A {
	private static A a = null;
	private A(){ }
	
	public static A getA(){
		if ( a == null) {
			return new A();
		}
		return a;
	}
}