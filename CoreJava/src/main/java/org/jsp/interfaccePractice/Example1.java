package org.jsp.interfaccePractice;

interface Demo1{
	int x=30;
	void test();
}

class Sample1 implements Demo1{
	@Override
	public void test() {
		System.out.println("Test method is running...");
	}
}

public class Example1 {
	public static void main(String[] args) {
		Sample1 s1 = new Sample1();
		s1.test();
		System.out.println("The value of x is : "+ Sample1.x);
	}
}
