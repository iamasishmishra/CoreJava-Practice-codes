package org.jsp.ExceptionHandling;

class CustomException extends Exception{
	public CustomException(String message) {
		super(message);
	}
}

class NumberChecker {
	public void checknumber(int number) throws CustomException{
		if(number<0) {
            throw new CustomException("Number is less than 0");
        }
        System.out.println(number + "is greater than 0");
	}
}
public class CustomExceptionThrowThrows {
	public static void main(String[] args) {
		NumberChecker nc = new NumberChecker();
        try {
            nc.checknumber(30);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
	}

}
