package Numbers;

public class _12_SumOfEvenDigits {
	public static void main(String[] args) {
		int n=12349732;
		int sum=0, reminder=0;
		while(n!=0) {
			reminder=n%10;
			if(reminder%2==0) {
				sum=sum+reminder;
			}n=n/10;
		}
		System.out.println(sum);
	}

}
