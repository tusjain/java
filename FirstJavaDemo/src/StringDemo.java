import java.util.Date;

import java.sql.*;

public class StringDemo {
	
	public static void main(String[] args) {
		String a1 = "Hello";
		String a2 = new String("Morning");
			
		System.out.println("a1: " +a1 + "  a2: "+ a2);
		
		String a3 = a2 + a2;
		String a4 = a1.concat(a2);
		
		System.out.println("a3: " +a3);
		System.out.println("a4: " +a4);
		
		System.out.println("Find out index of o: " + a4.indexOf("o"));
		
		a2 = a1;
		
		//StringBuilder q = "Hello";
		StringBuilder q1 = new StringBuilder("Hello");
		
		//StringBuffer z ="Hello";
		StringBuffer z = new StringBuffer("Hello");
		
		//String[5] strArray0 = new String[];
		String[] strArray = new String[5];
		String[] strArray1 = new String[]{"Hello", "Good Morning"};
		String[] strArray2 = {"Hello", "Good Morning"};
		strArray[0]="Good Morning";
		
		
		for(int i =0; i<5 ; i++){
			strArray[i] = "Hello " +i ;
			//break;
		}
		strArray[4] = "Tomi";
		
		
		int[] intArry = new int[2];
		
		int[] zeoSizeArray = new int[0];
		//zeoSizeArray[0] = 4;
		
		//System.out.println("zeoSizeArray[0] = " + zeoSizeArray[0]);
		
		//int[] intArry = {1,2};
		StringBuilder[] strBuilderArray = {new StringBuilder("Hello"), new StringBuilder("Morning")};
		
		String c1 = "Hello";
		
		String c2 = "hello";
		
		if(c1.equals(c2)){
			
			System.out.println(" c1 is eauals to c2");
			
		}
		else{
			System.out.println(" c1 is not eauals to c2");
		}
		
		if(c1.equalsIgnoreCase(c2)){
			
			System.out.println(" Second if c1 is eauals to c2");
			
			
		}
		else{
			System.out.println(" Second else c1 is not eauals to c2");
		}
		
		if(c1==c2){
			
			System.out.println(" third if c1 is eauals to c2");
			
		}
		else{
			System.out.println(" third else c1 is not eauals to c2");
		}
		
		while(c1.equals(c2)){
			System.out.println("I am while");
			break;
			
		}
		
		int x = 1;
		do{
			System.out.println(x);
			x++;
			System.out.println(x);
			++x;
			System.out.println(x);
			//break;
		} while (x<10);
		
		x= 2;
		switch(x){
		
		case(0): System.out.println("In case 0"); 
				break;
		case (1): System.out.println("In case 1"); 
				break;
		case(2):{
			System.out.println("In case 2");
			//break;
		}
		case(3):{
			System.out.println("In case 3");
			//break;
		}
		default: System.out.println("In default");
		
		}
		
	}

}
