package com.preetha;

public class SecondClassInPac {
	
	public int a = 10;
	private int b = 20;
	private static int c = 30;
	
	public void m3(){
		//SecondClassInPac secPac = new SecondClassInPac();
		//System.out.println("value of 'a' from SecondClassinPac and 'a' is public  : "+ secPac.a);
		
		//System.out.println("value of 'b' from SecondClassinPac and 'b' is private  : "+ secPac.b);
		
		System.out.println("value of 'b' from SecondClassinPac and 'b' is private  : "+ b);
		System.out.println("value of 'b' from SecondClassinPac and 'b' is private  : "+ this.b);
	}
	
	//private SecondClassInPac(){}
	

}
