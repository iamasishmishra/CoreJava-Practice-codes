package Strings;

public class _8CatPresent {
	public static void main(String[] args) {
		
		String s = "abcdecatabcat";
		int count = 0;
		
		for (int i = 0; i < s.length()-2; i++) {
			if(s.charAt(i)=='c' && s.charAt(i+1)=='a' && s.charAt(i+2)=='t') {
				count++;
			}
		}System.out.println(count);
	}

}
