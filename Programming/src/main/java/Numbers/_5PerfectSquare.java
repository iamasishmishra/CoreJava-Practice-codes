package Numbers;

public class _5PerfectSquare {
	public static void main(String[] args) {
		int n =10;
		int count=0;
		for(int i=1; i<=n; i++) {
			if(i*i==n) {
				count++;
			}
		}
		System.out.println(count==1?"Perfect sq. ": " Not");
	}
}
