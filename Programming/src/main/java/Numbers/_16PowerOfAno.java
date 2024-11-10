package Numbers;

public class _16PowerOfAno {
	public static void main(String[] args) {
		int base=2, exponential=3;
		int result=1;
		
		while(exponential!=0) {
			result=result*base;
			exponential--;
		}
		System.out.println(result);
	}

}
