
public class HelloWorld {
	
	String s1 = "Hello";

	
	public String myMethod(){
		System.out.println("I am in myMethod");
		System.out.println(s1.length());
		return "I am return String";
	}
	

	public static void main(String[] args) {
		System.out.println("Hello I am here");
		HelloWorld hw = new HelloWorld();
		hw.myMethod();

	}

}
