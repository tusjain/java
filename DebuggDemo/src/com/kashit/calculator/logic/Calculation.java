package com.kashit.calculator.logic;

public class Calculation {
	float number1;
	float number2;
	
	public static float addition(float number1, float number2){
		float sum = number1+ number2;
		System.out.println("Line 1");
		System.out.println("Addition of "+ number1 +" and "+ number2 + " is " + sum);
		System.out.println("Line 3");
		System.out.println("Line 4");
		System.out.println("Line 5");
		System.out.println("Line 6");
		//return number1+number2;
		return sum;
	}
	
	public static float subtraction(float number1, float number2){
		return number1-number2;
	}
	
	public static float multiplication(float number1, float number2){
		return number1*number2;
	}
	
	public static float division(float number1, float number2){
		System.out.println("Line 1");
		/*
		if (number2 == 0.0f){
			System.out.println("Line 2");
			System.out.println("Division by zero is not allowed");
			System.out.println("Line 3");
			throw new NullPointerException();
		}
		System.out.println("Line 4");
		*/
		System.out.println("Line 2");
		System.out.println("Line 3");
		System.out.println("Line 4");
		return number1/number2;
	}
	
	public static double tangent(double angleInRadian){
		return Math.tan(angleInRadian);
	}
}
