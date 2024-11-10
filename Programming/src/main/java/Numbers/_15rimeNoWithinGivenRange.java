package Numbers;

public class _15rimeNoWithinGivenRange {
//	int n=11;
	public static boolean isPrime(int n) {
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count==2;
	}
	
	
	public static void main(String[] args) {
		int n=100;
		int c=0;
		for(int i=1; i<=n; i++) {
			if(isPrime(i)) {
				System.out.println(i);
				c++;
			}
		}System.out.println("Total no of Prime no are: "+c);
	}
}
