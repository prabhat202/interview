package interview.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringTest {

	public static void main(String[] args) {
		String str = "Hi How ih you";
		String[] arr = str.split(" ");
		Map<String, List<String>> strMap = new HashMap<>();

		for (String s : arr) {
			String temp = s;

			char[] charArr = s.toCharArray();
			Arrays.sort(charArr);
			String key = new String(charArr);
			key = key.toLowerCase();



			if (strMap.containsKey(key)) {
				List l = strMap.get(key);
				l.add(temp);
			} else {
				List ll = new ArrayList<>();
				ll.add(temp);
				strMap.put(key, ll);
			}
			
		}
		strMap.values().forEach(l -> l.stream().forEach(System.out::println));
	}

}
