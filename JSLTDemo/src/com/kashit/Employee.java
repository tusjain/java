package com.kashit;
public class Employee {

	private int id = 1;
	private String name = " Deepika";
	private String role = "Manager";

	public Employee() {
		id = 6;
		name = "Jei";
		role = "Sr. Manager";
				
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
