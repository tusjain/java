package com.kashit.calculator.client;

import com.kashit.calculator.logic.Calculation;

public class Client {

	public static void main(String[] args) {
		float a = 20.0f;
		float b = 0.0f;
		double angleInRadian = 0;
		
		
		Calculation cal = new Calculation();
		//System.out.println("Lets do addition of " + a + " & " + b + "= "  + cal.addition(a, b));
		
		//System.out.println("Lets do subtraction of " + a + " & " + b + "= "  + cal.subtraction(a, b));
		
		
		//System.out.println("Lets do multiplication of " + a + " & " + b + "= "  + cal.multiplication(a, b));
		
		
		System.out.println("Lets do division of " + a + " & " + b + "= "  + cal.division(a, b));
		
		/*
		try{
			float divResult = Calculation.division(a, b);
			System.out.println(" Division of " + a + " by " + b + " is : " + divResult);
		}catch(NullPointerException npe){
			npe.printStackTrace();
		}catch (Exception e){
			System.out.println(" some thing really wrong here");
			e.printStackTrace();
		}
		
		
		double tanValue = Calculation.tangent(angleInRadian);
		
		System.out.println(" Tangent of " + angleInRadian + " is : " + tanValue );
		
*/

	}

}
