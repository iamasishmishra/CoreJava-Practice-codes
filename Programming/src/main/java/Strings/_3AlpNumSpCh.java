package Strings;

public class _3AlpNumSpCh {
	public static void main(String[] args) {
		String s = "As7895%^&";
		int countAlpha=0, countNum=0, countSp=0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122) {
				countAlpha++;
			}
			else if (s.charAt(i)>=48 && s.charAt(i)<=57) {
				countNum++;
			}
			else {
				countSp++;
			}
		}
		
		System.out.println("No of alpha : "+ countAlpha + " No of Numbers : "+ countNum+ " No of Specal: "+ countSp);
	}

}
