package org.jsp.constructorAndThisKeyword;

class Demo6{
	int x;
	
	Demo6(int x){
		this.x=x;
	}
	
	void view() {
		int x=30;
		System.out.println("The value of local variable x is : "+ x);
		System.out.println("The value of instance or object variable x is : "+ this.x);
	}
}

public class ThisKeyword6 {
	public static void main(String[] args) {
		Demo6 d6 = new Demo6(60);
		d6.view();
	}
}
