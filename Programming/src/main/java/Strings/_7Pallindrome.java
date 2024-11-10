package Strings;

public class _7Pallindrome {
	public static void main(String[] args) {
		String s = "level";
		String rev="";
		for (int i = s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
		}
		
		System.out.println(s.equalsIgnoreCase(rev)? "Pallindrome": "Not");
	}
}
