package org.jsp.constructorAndThisKeyword;

class Demo{
	int x=10;
	Demo(){
		System.out.println("Demo constructor is running...");
	}
}

public class Constructor1 {
	public static void main(String[] args) {
		System.out.println("Main started..");
		Demo d1 = new Demo();
		
	}
}
