package org.jsp.constructorAndThisKeyword;

class Demo5{
	int x;
	String name;
	
	Demo5(int arg1){
		System.out.println("Running int constructor...");
		x=arg1;
	}
	
	Demo5(String arg2){
		System.out.println("Running String name constructor");
		name=arg2;
	}
	
	Demo5(int arg1, String arg2){
		System.out.println("Running int String constructor..");
		x=arg1;
		name=arg2;
	}
	
	void display() {
		System.out.println("X value is : "+ x);
		System.out.println("Name value is : "+ name);
	}
}

public class ConstructorOverloading5 {
	public static void main(String[] args) {
		System.out.println("Main method started..");
		
		Demo5 d5 = new Demo5(55);
		d5.display();
		
		Demo5 d6 = new Demo5("Akash");
		d6.display();
		
		Demo5 d7 = new Demo5(22,"Binod");
		d7.display();
	}

}
