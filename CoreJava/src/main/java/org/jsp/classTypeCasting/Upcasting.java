package org.jsp.classTypeCasting;

class Demo1 {
	float f = 60.0f;

	void display() {
		System.out.println("Display methods ...");
	}
}

class Sample extends Demo1 {
	char c = 'c';

	void mango() {
		System.out.println("mango method is running...");
	}
}

public class Upcasting {
	public static void main(String[] args) {
		Demo1 d1 = new Sample();
		System.out.println(d1.f);
		d1.display();
		
	}
}
