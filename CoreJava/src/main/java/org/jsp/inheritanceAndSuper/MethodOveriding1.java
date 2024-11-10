package org.jsp.inheritanceAndSuper;

class Demo2{
	void test() {
		System.out.println("test() method is running...in super class");
	}
}

class Sample3 extends Demo2{
	@Override
	void test() {
		System.out.println("test() method is running... in sub class");
	}
}

public class MethodOveriding1 {
	public static void main(String[] args) {
		Demo2 d2 = new Demo2();
		d2.test();
		
		Sample3 s3 = new Sample3();
		s3.test();
	}
}
