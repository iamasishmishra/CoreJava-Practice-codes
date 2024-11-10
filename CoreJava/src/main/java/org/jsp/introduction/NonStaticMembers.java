package org.jsp.introduction;

class Demo1{
	int x=90;
	char c = 'A';
	
	void disp() {
		System.out.println("Disp methos running..");
	}
}
public class NonStaticMembers {
	public static void main(String[] args) {
		System.out.println("Main method started..");
		Demo1 d1 = new Demo1();
		System.out.println("The value of x is : "+ d1.x);
		System.out.println("The value of char c is : "+ d1.c);
		d1.disp();
	}
}
