package org.jsp.constructorAndThisKeyword;

class Person{
	
	Person(){
		super();
		System.out.println("Person class no parameterised Constructor.");
	}
	
	Person(int x){
		this();
		System.out.println("Person class Parameterised constructor.");
	}
}

public class ThisMethod {
	public static void main(String[] args) {
		Person p = new Person(4);
	}

}
