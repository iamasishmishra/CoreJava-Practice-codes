package Arrays;

import java.util.Scanner;

public class _8SumOfEachDigit {
	
	public static int sumOfDigits(int n) {
//		int n=123;
		int sum=0, reminder=0;
		while(n!=0) {
			reminder=n%10;
			sum=sum+reminder;
			n=n/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the elements : ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=10) {
				arr[i] = sumOfDigits(arr[i]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
