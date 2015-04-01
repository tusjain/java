package com.kashit.customer.services;

public class CustomerService {
	private String name;
	private String url;
	int x = 1;
 
	public void setName(String name) {
		this.name = name;
	}
 
	public void setUrl(String url) {
		
		this.url = url;
	}
 
	public void printName() {
		System.out.println("Customer name : " + this.name);
	}
 
	public void printURL() {
		System.out.println("Customer website : " + this.url);
		/*
		if(x==1){
			throw new IllegalArgumentException();
		}
		*/
	}
 
	public void printThrowException() {
		throw new IllegalArgumentException();
	}
}