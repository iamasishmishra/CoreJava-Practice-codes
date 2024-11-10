package Arrays;

import java.util.Scanner;

public class _2SumOfAllElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements : ");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum=0, product=1;
		for(int i=0; i<=arr.length-1; i++) {
			sum=sum+arr[i];
			product = product*arr[i];
		}
		System.out.println(sum==product? "equal": "not");
	}
}
