package Arrays;

public class _7LinearSearch {
	public static void main(String[] args) {
		int arr[] = {2,3,4,5,7};
		int key=11;
		int index=-1;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key) {
				index=i;
				break;
			}
		}
		System.out.println(index);
	}
}
