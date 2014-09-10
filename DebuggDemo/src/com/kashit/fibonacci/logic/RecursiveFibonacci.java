package com.kashit.fibonacci.logic;

public class RecursiveFibonacci {
	long ZerothElement = 0;
	long FirstElement = 1L;
	
	public long calculateNthElement(long n){
		/*System.out.println("NthElement :" + n);
		long interMediate = (n-1) + (n-2);
		interMediate = calculateNthElement(n-2) + calculateNthElement(n-1);
		System.out.println("interMediate :" + interMediate);*/
		long interMediate = 0;		
		if(n ==0){
			return 0;
		}
		if(n ==1){
			return 1;
		}
		return calculateNthElement(n-2) + calculateNthElement(n-1);
		
		//return interMediate;
		
		
	}
}