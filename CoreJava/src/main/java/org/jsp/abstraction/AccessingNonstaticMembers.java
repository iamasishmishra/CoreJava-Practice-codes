package org.jsp.abstraction;

abstract class Demo5{
	int x=40;
	public void test() {
		System.out.println("Running test method..#########");
	}
}

class Sample3 extends Demo5{
	
}

public class AccessingNonstaticMembers {
	public static void main(String[] args) {
		Sample3 s3 = new Sample3();
		System.out.println("x value is : "+ s3.x);
		s3.test();
	}
}
