package org.jsp.inheritanceAndSuper;

public class MethodOverloading2 {
	static void login(String username,String password) {
		System.out.println("username");
	}
	
	static void login(String email,long Phone) {
		System.out.println("Phoneno");
	}
	
	public static void main(String[] args) {
		login("Asishk@123", "7788");
		login("asishkumarmishra688@gmail.com", 8328837699l);
	}
	
}
