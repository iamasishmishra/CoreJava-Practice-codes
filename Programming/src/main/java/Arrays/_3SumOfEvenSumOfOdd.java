package Arrays;

import java.util.Scanner;

public class _3SumOfEvenSumOfOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int evenSum=0, oddSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 ==0) {
				evenSum = evenSum+arr[i];
			}
			else if (arr[i]%2!=0) {
				oddSum = oddSum+arr[i];
			}
		}
		
		System.out.println("even sum: "+ evenSum+ " Odd sum: "+ oddSum);
	}
}
