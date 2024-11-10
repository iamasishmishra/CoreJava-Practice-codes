package Arrays;

import java.util.Scanner;

public class _1TakingArrayAsInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the array elements: ");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
