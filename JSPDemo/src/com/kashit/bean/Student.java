package com.kashit.bean;

public class Student {
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getName() {
		System.out.println("student name getted is:  " + name);
		return name;
	}
	public void setName(String name) {
		System.out.println("student name setted is:  " + name);
		
		this.name = name;
	}
	private int grade;
	private String name;
}