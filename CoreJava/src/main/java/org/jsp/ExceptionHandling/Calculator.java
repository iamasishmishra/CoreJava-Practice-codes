package org.jsp.ExceptionHandling;

public class Calculator {
	
	
	
	public void division(int numerator, int denomitor) {
		int result = 0;
		try {
            result = numerator / denomitor;
        } catch (ArithmeticException e) {
            System.out.println("Cannnot divided by 0");
        }
		System.out.println("result = "+ result);
	}
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.division(20, 0);
	}

}
