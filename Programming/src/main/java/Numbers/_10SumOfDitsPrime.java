package Numbers;

public class _10SumOfDitsPrime {
	public static void main(String[] args) {
		int n=47;
		int reminder = 0;
		int sum=0;
		
		while(n!=0) {
			reminder=n%10;
			sum=sum+reminder;
			n=n/10;
		}
		
		int count=0;
		for(int i=1; i<=sum; i++) {
			if(sum%i==0) {
				count++;
			}
		}System.out.println(count==2?"Sum of Digits is Prime":" Not");
	}
}
