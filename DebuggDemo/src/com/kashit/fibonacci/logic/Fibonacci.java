package com.kashit.fibonacci.logic;

public class Fibonacci {
   
    public static void main(String[] args) {
        int FstElement=0, SndElement=1; 
        for (int i=0;i<10;i++) { 
	        // This code is going to be the same regardless of which loop you wrap it in 
	        System.out.println(FstElement); 
	        FstElement=FstElement+SndElement; 
	        SndElement=FstElement-SndElement; 
        } 
    }
}