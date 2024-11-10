package Numbers;

public class _8ReverseAno {
	public static void main(String[] args) {
		int n=786765;
		int reminder=0;
		while(n!=0) {
			reminder=n%10;
			System.out.print(reminder);
			n=n/10;
		}
	}

}
