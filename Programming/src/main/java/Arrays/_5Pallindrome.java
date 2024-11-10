package Arrays;

import java.util.Scanner;

public class _5Pallindrome {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the array size: ");
//		
//		int size = sc.nextInt();
//		int arr[] = new int[size];
//		System.out.println("Enter the numbers : ");
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//	
//		int l=0,h=arr.length-1;
//		boolean flag=true;
//		while(l<h) {
//			if(arr[l]==arr[h]) {
//				l++;
//				h--;
//			}
//			else {
//				flag=false;
//				break;
//			}
//		}
//		
//		if(flag==true) {
//			System.out.println("Pallindrome");
//		}else {System.out.println("Not");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of the array: ");
		int size  = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
//		int arr = [1,2,3,2,1];
		
		int h = 0;
		int t = arr.length-1;
		boolean flag = true;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[h]==arr[t]) {
				h++;
				t--;
			}else {
				flag =false;
			}
		}
		
		if(flag == true) {
			System.out.println("Pallindrome");
		}else {
			System.out.println("Not");
		}
		
		
	}
}
