package Strings;

public class _11DecimalToBinary {
	public static void main(String[] args) {
		int n=13;
		String bin="";
		int reminder=0;
		
		while(n!=0) {
			reminder=n%2;
			bin=reminder+bin;
			n=n/2;
		}
		System.out.println(bin);
//		System.out.println(13/2);
	}

}
