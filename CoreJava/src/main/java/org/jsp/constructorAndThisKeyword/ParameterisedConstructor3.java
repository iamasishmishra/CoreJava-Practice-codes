package org.jsp.constructorAndThisKeyword;

class Demo3{
	int x;
	double d;
	Demo3(int arg1, double arg2){
		System.out.println("Demo3 constructor is running..");
		x=arg1;
		d=arg2;
		
	}
}

public class ParameterisedConstructor3 {
	public static void main(String[] args) {
		Demo3 d3 = new Demo3(888,1122.99);
		System.out.println("x value is :" + d3.x + " d value is : "+ d3.d);
	}

}
