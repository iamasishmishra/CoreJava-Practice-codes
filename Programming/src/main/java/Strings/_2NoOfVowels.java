package Strings;

public class _2NoOfVowels {
	public static void main(String[] args) {
		String s = "Asish";
		int c=0;
		
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' ||
					s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				
				c++;
			}
		}
		System.out.println(c);
	}

}
