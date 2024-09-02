package interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortByFrequency1 {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 1, 5, 2, 6, 2, 2 };

		int[] result = new int[arr.length];

		Map<Integer, Integer> freqMap = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (freqMap.containsKey(arr[i])) {
				int frequncy = freqMap.get(arr[i]);
				freqMap.put(arr[i], ++frequncy);
			} else {
				freqMap.put(arr[i], 1);
			}
		}

		List<Entry> list = freqMap.entrySet().stream().sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
				.collect(Collectors.toList());
		list.stream().forEach(en -> {
			System.out.println(en.getKey() + " " + en.getValue());
		});
		System.out.println(freqMap);
	}

}
