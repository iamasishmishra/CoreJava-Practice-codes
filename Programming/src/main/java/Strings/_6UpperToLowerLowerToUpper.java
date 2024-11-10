package Strings;

public class _6UpperToLowerLowerToUpper {
	public static void main(String[] args) {
		String s = "How are You";
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c>='A' && c <= 'Z') {
				c = (char) (c+32);
			}else if(c>='a' && c<='z') {
				c = (char) (c-32);
			}
			
			ans=ans+c;
		}
		
		System.out.println(ans);
	}

}
