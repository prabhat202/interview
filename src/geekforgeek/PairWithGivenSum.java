package geekforgeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairWithGivenSum {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 5, -1 };

		int target = 4;
		// List<Pair> pairList = bruteForce(arr, target);
		// List<Pair> pairList = hashSetMethod(arr, target);
		List<Pair> pairList = sortMethod(arr, target);

		pairList.stream().forEach(p -> {
			System.out.println(p.getI() + " , " + p.getJ());
		});

	}

	public static List<Pair> bruteForce(int[] arr, int target) {
		List<Pair> pairList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if (sum == target) {
					pairList.add(new Pair(arr[i], arr[j]));
				}
			}
		}

		return pairList;
	}

	public static List<Pair> hashSetMethod(int[] arr, int target) {
		List<Pair> pairList = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			int complement = target - arr[i];
			if (set.contains(complement)) {
				pairList.add(new Pair(arr[i], complement));
			} else {
				set.add(arr[i]);
			}

		}
		return pairList;

	}

	public static List<Pair> sortMethod(int[] arr, int target) {
		Arrays.sort(arr);
		List<Pair> pairList = new ArrayList<>();
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {
				pairList.add(new Pair(arr[left], arr[right]));
				left++;
				right--;
			} else if (sum > target) {
				right--;
			} else {
				left++;
			}
		}
		return pairList;

	}

	static class Pair {

		int i;
		int j;

		/**
		 * @param i
		 * @param j
		 */
		public Pair(int i, int j) {
			super();
			this.i = i;
			this.j = j;
		}

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}

		public int getJ() {
			return j;
		}

		public void setJ(int j) {
			this.j = j;
		}

	}

}
