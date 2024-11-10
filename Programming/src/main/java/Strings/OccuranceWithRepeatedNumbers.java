package Strings;

public class OccuranceWithRepeatedNumbers {

	public static void main(String[] args) {

		String str = "aaabbcccdpa";

		int counts[] = new int[256];
		String res = "";
		for (char ch : str.toCharArray()) {
			counts[ch]++;
		}

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (counts[currentChar] != 0) {
				res += currentChar + String.valueOf(counts[currentChar]);
				counts[currentChar] = 0; // Reset to avoid duplicate entries
			}
		}
		System.out.println(res);

	}
}
