package Strings;

public class _5RearrAlphaNumSpec {
	public static void main(String[] args) {
		
		String s = "4r43ffr5697#$%";
		
		String alpha="", numeric="", special="";
		for (int i = 0; i <s.length(); i++) {
			char c = s.charAt(i);
			if(c>='A' && c<='Z' || c>='a' && c<='z') {
				alpha=alpha+c;
			}
			else if(c>='0' && c<='9' ) {
				numeric = numeric+c;
			}
			else {
				special = special+c;
			}
		}System.out.println(alpha+numeric+special);
	}

}
