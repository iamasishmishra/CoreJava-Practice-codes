package org.jsp.interfaccePractice;

interface Demo3{
	void m1();
}

interface Demo4 extends Demo3{
	void m2();
}

class Sample3 implements Demo4{
	public void m1() {
		System.out.println("m1 running");
	}
	
	public void m2() {
		System.out.println("m2 running");
	}
}


public class Example3 {
	public static void main(String[] args) {
		Sample3 s3 = new Sample3();
		s3.m1();
		s3.m2();
	}
}
