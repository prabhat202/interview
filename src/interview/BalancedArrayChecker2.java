package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BalancedArrayChecker2 {
	public static void main(String[] args) {
		int arr[] = { -2, 3, 2, -3, 5, -5 };
		Arrays.sort(arr);

		Map<Integer, Integer> map = new HashMap();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				if (!map.containsKey(arr[i])) {
					map.put(arr[i], 1);
				} else {
					int val = map.get(arr[i]);
					map.put(arr[i], val + 1);
				}
			}
			if (arr[i] > 0) {
				if (!map.containsKey(-arr[i])) {
					map.put(arr[i], 1);
				} else {
					int val = map.get(-arr[i]);
					System.out.println("got Key..."+-arr[i]);
					map.put(-arr[i], val - 1);
				}
		}
			System.out.println(map);
		}
	}
}
