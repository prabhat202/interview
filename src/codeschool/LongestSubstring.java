package codeschool;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
	public static void main(String[] args) {
		String str = "abcdebcfghiab";
		// abcdebfghiab

		int start = 0;
		int end = 0;
		int max = 0;
		int len = 0;
		String result = "";
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), i);
			} else if (map.get(str.charAt(i)) >= start) {
				int index = map.get(str.charAt(i));
				start = index + 1;
			}

			len = end - start + 1;
			if (max < len) {
				result = str.substring(start, end +1);
			}
			map.put(str.charAt(i), i);
			end++;
		}
		System.out.println(result);
	}

}
