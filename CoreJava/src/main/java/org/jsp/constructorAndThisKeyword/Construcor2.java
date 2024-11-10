package org.jsp.constructorAndThisKeyword;

class Demo2{
	int x;
	String name;
	
	Demo2(){
		System.out.println("Running Demo2 constructor..");
		x=12;
		name="Abc";
	}
}
public class Construcor2 {
	public static void main(String[] args) {
		System.out.println("Main Started..");
		
		Demo2 d1 = new Demo2();
		System.out.println("The value of x :" + d1.x);
		System.out.println("The value of name :" + d1.name);
	}

}
