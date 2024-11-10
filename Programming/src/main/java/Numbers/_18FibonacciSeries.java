package Numbers;

public class _18FibonacciSeries {
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int sum=0;
		int i=100;
		while(i>=1) {
			if(n1<=500) {
				System.out.print(n1+" ");
				sum=n1+n2;
				n1=n2;
				n2=sum;
				i--;
			}
		}
	}

}
