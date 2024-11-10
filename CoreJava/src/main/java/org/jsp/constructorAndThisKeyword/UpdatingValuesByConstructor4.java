package org.jsp.constructorAndThisKeyword;

class Demo4{
	int x=30;
	int y=89;
	Demo4(int arg1, int arg2){
		System.out.println("Running Demo4 1st constructor");
		x=arg1;
		y=arg2;
	}
	
	void updatex(int arg1){
		System.out.println("Modifying x value");
		x=arg1;
		System.out.println("X value is  "+ x);
	}
	
	void updatey(int arg2){
		System.out.println("Modifying y value");
		y=arg2;
		System.out.println("Y value is  "+ y);
	}
}

public class UpdatingValuesByConstructor4 {
	public static void main(String[] args) {
		System.out.println("Main started..");
		Demo4 d4 = new Demo4(33,56);
		System.out.println("x value is : "+ d4.x +" and y value is: "+ d4.y);
		d4.updatex(777);
		d4.updatey(1234);
	}
}
