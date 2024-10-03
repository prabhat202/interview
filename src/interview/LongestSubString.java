package interview;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
	public static void main(String[] args) {
		String str = "abcbcdbb";
		Set<Character> set = new HashSet();
		int len = 0;
		StringBuilder sb = new StringBuilder();
		int max = 0;
		String result ="";
		
		for (int i = 0; i < str.length(); i++) {
			if (set.add(str.charAt(i))) {
				sb.append(str.charAt(i));
				len++;
			} else {
				set.clear();
				set.add(str.charAt(i));
				if(max < len) {
					max = len;
					result = sb.toString();
					len = 1;
					sb = new StringBuilder();
					sb.append(str.charAt(i));
				}
			}
		}
		
		System.out.println(result);
	}

}
