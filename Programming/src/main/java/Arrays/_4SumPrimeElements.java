package Arrays;

public class _4SumPrimeElements {
	public static boolean isPrime(int n) {
		int count=0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count==2;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(isPrime(arr[i])) {
				System.out.println(arr[i]);
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}
}
