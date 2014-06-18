public class EqualsDemo {
	String a = "hello";
	String b = "hello";
	
	public void compareStrings(){
		if (a==b){
			System.out.println(" String a == b");
		}else{
			System.out.println(" String a !== b");
		}
		
		if(a.equals(b)){
			System.out.println(" String a equals b");
		}else{
			System.out.println(" String a not equals  b");
		}
	}
	/*
	public void compareClasses(){
		A a= new A();
		B b = new B();
		if (b1==b){
			System.out.println(" Class a == b");
		}else{
			System.out.println(" Class a !== b");
		}
		
		if(a.equals(b)){
			System.out.println(" Class a equals b");
		}else{
			System.out.println(" Class a not equals  b");
		}
	}
	*/
	
	public void compareObjects(){
		A a= new A();
		A a1= new A();
		//a1.s1 = "not Hello";
		a = null;
		a1 = null;
		if (a==a1){
			System.out.println(" Class a == a1");
		}else{
			System.out.println(" Class a !== a1");
		}
		
		if(a.equals(a1)){
			System.out.println(" Class a equals a1");
		}else{
			System.out.println(" Class a not equals  a1");
		}
	}
	
	public static void main(String arg[]){
		EqualsDemo ed = new EqualsDemo();
		//ed.compareStrings();
		ed.compareObjects();
	}

}
