package interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SecondMax {
	
	public static void main(String[] args) {
		int [] arr = {10, 100, 40, 70, 200, 100};
		
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			countMap.put(i, arr[i]);
		}
		
		//get the second Max
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}
		System.out.println(secondMax);
		
//		countMap.entrySet().forEach(e -> {
//			if (e.getValue() == secondMax) {
//				System.out.println("Index:- "+e.getKey());
//			}
//		});
		
		Iterator<Map.Entry<Integer, Integer>> itr = countMap.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer, Integer> en = itr.next();
			int value = en.getValue();
			if (value == secondMax) {
				System.out.println("Index:- "+en.getKey());
				
			}
			
		}
	}

}
