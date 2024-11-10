package Numbers;

public class _13_DuckNo {
	public static void main(String[] args) {
		int n=1003;
		int reminder=0;
		while(n!=0) {
			reminder=n%10;
			if(reminder==0) {
				System.out.println("Duck No");
				return;
			}
			n=n/10;
		}System.out.println("Not");
	}
}

