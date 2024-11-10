package org.jsp.inheritanceAndSuper;


class Demo1{
	int x=100;
}

class Sample2 extends Demo1{
	int x=20;
	void test() {
		int x=300;
		System.out.println("The local value of x is: "+ x);
		System.out.println("The instance/object value of x is: "+ this.x);
		System.out.println("The super class value of x is: "+ super.x);
	}
}


public class SuperKeyword {
	public static void main(String[] args) {
		Sample2 s1 = new Sample2();
		s1.test();
	}
}
