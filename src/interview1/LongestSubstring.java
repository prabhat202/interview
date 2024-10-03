package interview1;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

	public static void main(String[] args) {
		String str = "abcabcrbb";
		Map<Character, Integer> valueMap = new HashMap<>();
		int start = 0, end = 0;
		int max = 0;
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			Character key = str.charAt(i);
			if (!valueMap.containsKey(key)) {
				valueMap.put(key, i);
				end++;
				count++;
				max = Math.max(max, count);
			} else {
				if (start > i) {
					valueMap.put(key, i);
					start = end - start + 1;
					end++;
					count = 1;
				}
			}
		}
		System.out.println("Max-"+max);

	}

}
