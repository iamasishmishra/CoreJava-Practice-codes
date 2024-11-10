package Numbers;

public class _9SumOfDigits {
	public static void main(String[] args) {
		int n=12324;
		int sum=0;
		int reminder=0;
		while(n!=0) {
			reminder=n%10;
			sum=sum+reminder;
			n=n/10;
		}
		System.out.println("Sum is :"+ sum);
	}

}
