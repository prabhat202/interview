package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonPrefixFinder {
	public static void main(String[] args) {
		String[] arr = { "prab", "pra", "pra" };
		String result = longestCommonPrefix(arr);
		System.out.println(result);

	}

	public static String longestCommonPrefix(String[] s) {
		Arrays.sort(s);
		String s1 = s[0];
		String s2 = s[s.length - 1];
		int i = 0;
		while (i < s1.length()) {
			if (s1.charAt(i) == s2.charAt(i)) {
				i++;
			} else {
				break;
			}
		}
		return i == 0 ? "" : s1.substring(0, i);
	}
}
