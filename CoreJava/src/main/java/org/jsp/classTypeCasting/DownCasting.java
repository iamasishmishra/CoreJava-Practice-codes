package org.jsp.classTypeCasting;

class Demo2 {
	double d = 4.5;

	void just() {
		System.out.println("Just method is running..");
	}
}

class Sample2 extends Demo2 {
	String s = "Hello world";

	void freeFire() {
		System.out.println("Frefire method is running..");
	}
}

public class DownCasting {
	public static void main(String[] args) {
		
		Demo2 d2 = new Sample2();
		
		System.out.println(d2.d);
		d2.just();
		
		if (d2 instanceof Sample2) {
            Sample2 s2 = (Sample2) d2;
            s2.freeFire();
        } else {
            System.out.println("Cannot downcast to Sample2");
        }
		
	}
}
