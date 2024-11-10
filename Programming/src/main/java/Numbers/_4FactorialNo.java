package Numbers;

public class _4FactorialNo {
	public static void main(String[] args) {
		int n=4;
		int factorial=1;
		
		for(int i=1; i<=n; i++) {
			if(n!=0 || n!=1) {
				factorial = factorial*i;
			}else {
				System.out.println("Not");
			}
		}
		System.out.println("Fatotial :"+ factorial);
	}
}
