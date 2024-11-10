package Numbers;

public class _17ArmStrongNo {

	public static int count(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		return count;
	}
	
	public static int power(int base, int exponent) {
		int pow=1;
		for(int i=1; i<=exponent; i++) {
			pow=pow*base;
		}
		return pow;
	}
	
	
	public static void main(String[] args) {   
		int n=16345;
		int n1=n;
		int c = count(n);
		int reminder=0;
		int sum=0;
		while(n!=0) {
			reminder=n%10;
			sum=sum+power(reminder, c);
			n=n/10;
		}System.out.println(n1==sum?"Armstrong": "Not");
	}
}
