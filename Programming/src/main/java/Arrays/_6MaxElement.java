package Arrays;

public class _6MaxElement {
	public static void main(String[] args) {
//		int arr[] = {1,55,3,4,22};
//		int max = arr[0];
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(max<arr[i]) {
//				max=arr[i];
//			}
//		}System.out.println(max);
		
		int arr[] = {55,3,4,22,1};
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}System.out.println(min);
	}

}
