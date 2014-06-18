package com.tomi;

//import com.preetha.*;

public class FirtsClassInPac {

	 void m1(){
		 com.preetha.SecondClassInPac secPac = new com.preetha.SecondClassInPac();
		System.out.println("value of 'a' from SecondClassinPac and 'a' is public  : "+ secPac.a);
		
		//System.out.println("value of 'b' from SecondClassinPac and 'b' is private  : "+ secPac.b);
	}
	
	public static void main(String[] args) {
		FirtsClassInPac fPac = new FirtsClassInPac();
		fPac.m1();
		

	}

}
