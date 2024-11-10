package org.jsp.inheritanceAndSuper;



public class MethodOverloading1 {
	
	static void add(int arr[]) {
		int sum=0;
		for(int i=0; i<=arr.length-1; i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
	
	static void add(double arr[]) {
		double sum=0;
		for(int i=0; i<=arr.length-1; i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		add(arr);
		
		double arr1[] = {1.1,0.0};
		add(arr1);
	}
}
