package Arrays;

import java.util.Arrays;

public class _9MergingTwoArrays {
	
	static public int[] mergeArray(int arr1[], int arr2[]) {
		int arr3[] = new int[arr1.length+arr2.length];
		
		for (int i = 0; i <=arr1.length-1 ; i++) {
			arr3[i] = arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }
		return arr3;
	}
	
	public static void main(String[] args) {
		int arr1[] = {1,2,3};
		int arr2[] = {5,6,7,8};
		int arr3[] = mergeArray(arr1, arr2);
		
		System.out.println(Arrays.toString(arr3));
	}
}
