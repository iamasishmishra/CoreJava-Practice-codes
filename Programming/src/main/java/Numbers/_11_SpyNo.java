package Numbers;

public class _11_SpyNo {
	public static void main(String[] args) {
//		1412 = 1+4+1+2=8
//				1*4*1*2=8

		int n = 132;
		int sum = 0, reminder = 0, product = 1;
		while (n != 0) {
			reminder = n % 10;
			sum = sum + reminder;
			product = product * reminder;
			n = n / 10;
		}
		System.out.println(product == sum ? "Spy" : "Not");

	}

}
