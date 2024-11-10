package Arrays;

public class _11MoveNonZeroToRight {
	public static void main(String[] args) {
		
		int arr1[] = {4,0,2,01,3,4,0,0,6,0};
		int arr2[] = new int[arr1.length];
		int k=0;
		
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i]!=0) {
				arr2[k] = arr1[i];
				k++;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
			
		}
	}

}
