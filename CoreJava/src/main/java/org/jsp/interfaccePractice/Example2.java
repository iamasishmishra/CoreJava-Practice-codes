package org.jsp.interfaccePractice;

interface Demo2{
	void m1();
	void m2();
}

abstract class Sample2 implements Demo2{
	public void m1() {
		System.out.println("m1 method running..");
	}
}

class School extends Sample2{
	public void m2() {
		System.out.println("m2 method runnning");
	}
}

public class Example2 {
	public static void main(String[] args) {
		School s1 = new School();
		s1.m1();
		s1.m2();
	}
}
