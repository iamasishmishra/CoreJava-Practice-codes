package Numbers;

public class _19Pallindrome {
	public static void main(String[] args) {
		int n=121;
		int n1=n;
		int reminder=0, reverse=0;
		while(n!=0) {
			reminder=n%10;
			reverse=(reverse*10)+reminder;
			n=n/10;
		}System.out.println(n1==reverse?"Pallindrome":"not");
	}
}
