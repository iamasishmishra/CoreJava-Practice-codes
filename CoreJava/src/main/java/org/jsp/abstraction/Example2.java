package org.jsp.abstraction;

abstract class Demo7{
	
	public void test() {
		System.out.println("Running test method..");
	}
	
	abstract public void run();
	
	abstract public void disp();
}

abstract class Sample5 extends Demo7{
	
	public void hi() {
		System.out.println("hii method is running");
	}
}

class Itsme extends Demo7{
	@Override
	public void run() {
		System.out.println("Run method is running ");
	}
	@Override
	public void disp() {
		System.out.println("disp method is running..");
	}
}

public class Example2 {
	public static void main(String[] args) {
		Itsme i1 = new Itsme();
		i1.test();
		i1.disp();
		i1.run();
		
		
		
	}
}
