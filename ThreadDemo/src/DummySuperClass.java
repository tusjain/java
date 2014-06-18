
public class DummySuperClass {
	//synchronized int i = 100;
	
	synchronized int  add(int a, int b) { 
		return a+b;
		}
	
	int  dummyAdd(int a, int b) { 
		int c= a+b;
		synchronized(this){
			int d = c+a;
			int e = d+c;
			return e;
		}
	}
		
	synchronized	static int  dummyAdd1(int a, int b) { 
		return a+b;
		}
	
	 int  multiplication(int a, int b) { 
		return a*b;
		}
}