package org.jsp.constructorAndThisKeyword;

class Demo1{
	
	Demo1(){
		System.out.println("Demo1 constructor running..");
	}
}

class Sample extends Demo1{
	Sample(){
		System.out.println("Sample constructor running..");
	}
}

class Test extends Sample{
	Test(){
		System.out.println("Test constructor running..");
	}
}


public class ConstructorCalling {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		Sample s1 = new Sample();
		Test t1 = new Test();
		
	}
}
