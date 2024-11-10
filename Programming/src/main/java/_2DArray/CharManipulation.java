package _2DArray;

import java.util.Scanner;

public class CharManipulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		Integer index = 0;
		char ch2 = ' ';
		for (Integer i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
//				if (ch[i] >= 'a' && ch[i] <= 'z')
//					ch[i] = (char) (ch[i] - 32);
				index = i;
				ch2 = ch[i];
			} else if (i == ch.length - 1 && ch[i] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ') {
				if (ch[i] >= 'a' && ch[i] <= 'z') {
					ch[i] = (char) (ch[i] - 32);
				}
				char temp = ch[i];
				ch[i] = ch2;
				ch[index] = temp;
			} else if (ch[i] >= 'A' && ch[i] <= 'Z')
				ch[i] = (char) (ch[i] + 32);

		}
		System.out.println(new String(ch));
		sc.close();
	}
}
