package Strings;

public class _9DigitsToWords {
	public static void main(String[] args) {
		int n = 234;
		String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		String s="";
		int reminder = 0;
		while(n!=0) {
			reminder=n%10;
			s=arr[reminder]+s;
			n=n/10;
		}
		System.out.println(s);
	}
}
