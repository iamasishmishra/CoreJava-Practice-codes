package Strings;

public class _11FindLength {
	public static void main(String[] args) {
		
		String s = "abc";
		int length=0;
		
		try {
			while(true) {
				char c = s.charAt(length);
				length++;
			}
		}catch (Exception e) {
			System.out.println(length);
		}
	}

}
