package Strings;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo {
	
	public static String[] mergerArray(String[] arr1, String[] arr2) {
		String arr3[] = new String[arr1.length+arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[i+arr1.length] = arr2[i];
		}
		return arr3;
	}
	
	
	public static void main(String[] args) {
		String[] str1 = {"Ashok","Binod","Ashok","Ravi"};
		String[] str2 = {"James","Ravi","Milan"};
		String[] str3;
		
		Set<String> s1 = new LinkedHashSet<String>(Arrays.asList(str1));
		Set<String> s2 = new LinkedHashSet<String>(Arrays.asList(str2));
		str3 = mergerArray(str1, str2);
		Set<String> s3 = new LinkedHashSet<String>(Arrays.asList(str3));
		
		System.out.println(s3);
		
	}

}
