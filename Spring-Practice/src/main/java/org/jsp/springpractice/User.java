package org.jsp.springpractice;

public class User {
	
	private String name;
	private int age;
	
	public User() {
		System.out.println("User() called");
	}
	
	public User(String name, int age) {
		System.out.println("User(String,int)");
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println("User name : " + name);
		System.out.println("Age : " + age);
	}
}
