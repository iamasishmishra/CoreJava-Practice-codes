package Strings;

public class _10ReplaceDigit {
	public static void main(String[] args) {
		String s = "hello hi buy";
		char c1='e';
		char c2 = '$';
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c=='e') {
				System.out.print(c2);
			}else {
				System.out.print(c);
			}
		}
	}

}
