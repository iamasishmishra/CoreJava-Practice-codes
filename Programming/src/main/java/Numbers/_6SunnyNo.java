package Numbers;

public class _6SunnyNo {

	public static void main(String[] args) {
		int n = 9;
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n+1%i==i*i) {
				count++;
				break;
			}
		}
		System.out.println(count==1?"Sunny no": "Not");
	}
}
