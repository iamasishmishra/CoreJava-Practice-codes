package Arrays;

import java.util.Arrays;

public class _13ArraySorting2 {

	static public int[] mergeArray(int arr1[], int arr2[]) {
		int arr3[] = new int[arr1.length + arr2.length];

		for (int i = 0; i <= arr1.length - 1; i++) {
			arr3[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[i + arr1.length] = arr2[i];
		}
		
		return arr3;
	}

	
	public static void main(String[] args) {
		int arr1[] = { 1, 12, 4, 15, 5, 6, 8 };
		int arr2[] = { 40, 30, 23, 44, 22 };
		int temp;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] > arr1[j]) {
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[i] > arr2[j]) {
					temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}

		int arr3[] = mergeArray(arr1, arr2);

		System.out.println(Arrays.toString(arr3));

	}

}
