package interview;

import java.util.ArrayList;
import java.util.List;

public class MaxSumSet {
	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int sum = 0;
		int max = Integer.MIN_VALUE;
		List<Integer> resultSet = new ArrayList();

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				sum = +arr[j];
				if (sum > max) {
					max = sum;
					resultSet.add(arr[j]);
				}
			}

		}
	}

}
