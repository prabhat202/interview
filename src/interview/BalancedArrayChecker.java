package interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BalancedArrayChecker {
	public static void main(String[] args) {
		int arr[] = {-2, 3, 2, -3, 0, 5,-5};
		Map<Integer, Integer> posMap = new HashMap<>();
		Map<Integer, Integer> negMap = new HashMap<>();
		boolean isBalanced = true;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				if (posMap.containsKey(arr[i])) {
					int val = posMap.get(arr[i]);
					posMap.put(arr[i], val + 1);
				} else {
					posMap.put(arr[i], 1);
				}
			} else if (arr[i] < 0){
				if (negMap.containsKey(arr[i])) {
					int val = negMap.get(arr[i]);
					negMap.put(arr[i], val + 1);
				} else {
					negMap.put(arr[i], 1);
				}
			}
		}
		System.out.println(posMap);
		System.out.println(negMap);

		
		Set<Map.Entry<Integer, Integer>> st = negMap.entrySet();
		Iterator<Map.Entry<Integer, Integer>> itr = st.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, Integer> e = itr.next();
			int key = e.getKey();
			int val = e.getValue();
			
			int val1 =0;
			if(posMap.size() != negMap.size()) {
				isBalanced = false;
				break;
			}
			
			if(posMap.containsKey(Math.abs(key))) {
				val1 = posMap.get(Math.abs(key)); 
			} else {
				isBalanced = false;
				
			}
			if(val1 != val) {
				isBalanced = false;
				
			}
		}
		
		if(isBalanced) {
			System.out.println("Balanced...");
		} else {
			System.out.println("Not Balanced...");
		}

		
	}

}
