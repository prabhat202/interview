package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TargetNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int target = 6;
		
		List<Pair> result = new ArrayList();
		result = setMethod(arr, target, result);
		/*
		 * for (int i = 0; i < arr.length; i++) { for (int j = i+1; j < arr.length; j++)
		 * { if (arr[i] + arr[j] == target) { Pair p = new Pair(arr[i], arr[j]);
		 * result.add(p); } } }
		 */
		
		result.stream().forEach(p -> {
			System.out.print(p.num1+"-"+p.num2);
			System.out.println();
		});
	}
	
	private static List<Pair> setMethod(int[] arr, int target, List<Pair> result) {
		Set<Integer> set = new HashSet<>();
		for(int num : arr) {
			int required = target - num ;
			if (set.contains(required)) {
				result.add(new Pair(num, required));
			} else {
				set.add(num);
			}
		}
		return result;
	}

	static class Pair {
		private int num1;
		private int num2;
		/**
		 * @param num1
		 * @param num2
		 */
		public Pair(int num1, int num2) {
			super();
			this.num1 = num1;
			this.num2 = num2;
		}
		
	}

}
