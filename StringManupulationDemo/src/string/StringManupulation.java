package string;

public class StringManupulation {
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = new String("Hello");  // not a preferred way because it is 2 step process
		
		str1 = str1 + " California";  // Hello California
		
		String s1 = " Hello it is Java session";
		
		String s2 = " I also know hadoop, Android, iPhone, MongoDB, salesForce, etc";
		
		System.out.println("Length of string: " + s1.length());
		
		System.out.println("part of -  Hello it is Java session -  " + s1.substring(7,17));

		//StringBuffer stBuffer = "Hello";
		//StringBuilder stBuilder = "Hello";
		
		StringBuffer stBuffer = new StringBuffer("Hello");
		StringBuilder stBuilder = new StringBuilder("Hello");
		
		String s3 = "Hello";
		String s4 = "Hello";
		
		if(s3 == s4){
			System.out.println(" Comapring two strings by ==  and strings are same");
		}else{
			System.out.println(" Comapring two strings by ==  and strings are not same");
		}
		
		
		if(s3.equals(s4)){
			System.out.println(" Comapring two strings by equals  and strings are same");
		}else{
			System.out.println(" Comapring two strings by equals and strings are not same");
		}
		
		// String --> Immutable
		// StringBuilder --> Mutable, Not Thread safe
		// StringBuffer --> Mutable, Thread safe
		
		
		StringBuffer stBuffer1 = new StringBuffer("Hello");
		StringBuffer stBuffer2 = new StringBuffer("California");
		//stBuffer2 = stBuffer1 + stBuffer2;
		stBuffer2 = stBuffer2.append(stBuffer1);
	}

}