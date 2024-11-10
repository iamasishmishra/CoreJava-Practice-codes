package Strings;

public class ReverseEachWord {
	public static void main(String[] args) {

		String str = "Hi buy hello";
		String arr[] = str.split(" ");
		String rev = "";
		
		for(String s: arr) {
			char ch[] = s.toCharArray();
			for(int i= ch.length-1; i>=0; i--) {
				rev = rev+ ch[i];
			}
			rev = rev+" ";
		}

		System.out.println(rev);
	}
}
