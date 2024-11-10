package org.jsp.abstraction;

abstract class Demo4{
	static int x = 20;
	static void test() {
		System.out.println("static method is running...");
	}
}

public class AccessingStaticMembers {
	public static void main(String[] args) {
		System.out.println("x value is: "+ Demo4.x);
		Demo4.test();
	}
}
