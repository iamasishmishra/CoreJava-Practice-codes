package org.jsp.introduction;

public class BubbleSort {
	
	public static void  bbSort(int arr[]) {
		
		
		for (int i = 0; i <= arr.length-1; i++) {
			
			for (int j = i+1; j<=arr.length-1; j++) {
				if(arr[i]>arr[j]) {
					int temp=0;
					arr[i] = arr[j];
					arr[j] = temp;
					arr[i] = arr[j];
					
				}
			}}
		
		
		
		
	}

	
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub

		int arr [] = {4,5,3,6};
		
		BubbleSort.bbSort(arr);
		
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.println(arr[i]);
		}
	}
}



