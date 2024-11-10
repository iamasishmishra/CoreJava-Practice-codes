package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _12SortAnArray {
	
	public static boolean isAnagram(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		else {
			char arr1[] = str1.toCharArray();
			char arr2[] = str1.toCharArray();
			
			return Arrays.equals(arr1,arr2);
		}
	}
	
	public static void main(String[] args) {
		
		String str1 = "ate";
		String str2 = "eat";
		if(isAnagram(str1, str2)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
//		int arr[] = {11,7,4,45,3,5,9};
//		int temp;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if(arr[i]>arr[j]) {
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		
//		int arr[] = {1,2,3,4};
//		for (int i = arr.length-1; i >=0; i--) {
//			System.out.print(arr[i]);
//
//		}
		
//		String str = "hello";
//		for (int i = str.length()-1; i>=0; i--) {
//			System.out.println(str.charAt(i));
//		}
		
//		int a= 10;
//		int b=30;
//		int temp;
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println(a+" "+b+" ");
		
		
//		String s = "level";
//		String reverse = "";
//		for (int i = s.length()-1; i>=0; i--) {
//			reverse = reverse+s.charAt(i);
//		}
//		
//		System.out.println(s.equalsIgnoreCase(reverse)? "Pallindrome": "not");
		
		
//		int arr[] = {1,2,3,2,1};
//		int head = arr[0];
//		int tail = arr[arr.length-1];
//		boolean flag = false;
//		for (int i = 0; i < arr.length; i++) {
//			if(head==tail) {
//				head++;
//				tail--;
//			}
//			else {
//				flag = true;
//				break;
//			}
//		}
//		
//		System.out.println(flag==true?"pallondrome":"not");
		
//		int n = 121;
//		int n1=n;
//		int rev=0;
//		int rem = 0;
//		while(n!=0) {
//			rem = n%10;
//			rev = (rev*10)+rem;
//			n=n/10;
//		}
//		System.out.println(rev==n1?"pal":"not");
		
//		int arr[] = {1,2,3};
//		int max = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if(max<arr[i]) {
//				max = arr[i];
//			}
//			
//		}
//		System.out.println(max);
		
		
//		int arr[] = {3,2,4,6,1,9};
//		int temp;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if(arr[i]>arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//					
//				}
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//		
//		int count = 0;
//		for(Integer ele: arr) {
//			count++;
//		}
//		System.out.println(count);
		
//		int arr[] = {1,2,3};
//		int count = 0;
//		try {
//			while(true) {
//				int i = arr[count];
//				count++;
//			}
//		}catch(Exception e) {
//			System.out.println(count);
//		}
		
		
	}

}
