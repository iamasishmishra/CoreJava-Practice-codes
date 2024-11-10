package org.jsp.introduction;

class Demo{
	static int x=30;
	static void disp() {
		System.out.println("Running disp method...");
	}
}

public class StaticMembers1 {
	public static void main(String[] args) {
		System.out.println("Main method started...");
		System.out.println("The value of x is : " + Demo.x);
		Demo.disp();
	}
}
