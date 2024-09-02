package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SortByFrequency {
	
	public static void main(String[] args) {
		int[] arr = new int[]{1, 1, 5, 2, 6, 2, 2};
		int[] result = new int[arr.length];
		
		Map<Integer, Integer> freqMap = new HashMap();
		
		for (int i = 0; i < arr.length; i++) {
			if(freqMap.containsKey(arr[i])) {
				int frequncy = freqMap.get(arr[i]);
				freqMap.put(arr[i], ++frequncy);
			} else {
				freqMap.put(arr[i], 1);
			}
		}
		
		Set<Entry<Integer, Integer>> entrySet = freqMap.entrySet();
		
		List<Entry<Integer, Integer>> list = new ArrayList<>(entrySet);
		List<Map.Entry<Integer, Integer>> sortedList = list.stream().sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue())).collect(Collectors.toList());
		
		
		sortedList.stream().forEach(e -> {
			System.out.println(e.getKey()+" "+e.getValue());
		});
		int index = 0;
		for(Map.Entry<Integer, Integer> e : sortedList) {
			 Integer count = e.getValue();
			 Integer key = e.getKey(); 
			 while(count != 0) {
				 result[index++] = key;
				 count--;
			 }		
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+",");
		}
	}

}
