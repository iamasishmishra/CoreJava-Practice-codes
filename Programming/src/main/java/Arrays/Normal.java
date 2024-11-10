package Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Normal {
	public static void main(String[] args) {
		String[] str1 = {"Bijay", "Ajay", "Sushama", "Bijay"};
        String[] str2 = {"James", "Birla", "James"};

        Set<String> combinedSet = new LinkedHashSet<>();
        combinedSet.addAll(Arrays.asList(str1));
        combinedSet.addAll(Arrays.asList(str2));

        String[] str3 = combinedSet.toArray(new String[0]);
        System.out.println(Arrays.toString(str3));
		
	}
}
