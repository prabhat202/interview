package interview1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetBingoNumber {
	public static void main(String[] args) {
		int [] markedRows = new int[] {1, 5, 8};
		int i = 1;
		int t = markedRows[i++]++;
		System.out.println(t);
	}

	public static int getBingoNumber(List<List<Integer>> mat, List<Integer> arr) {
		// Write your code here
		int n = mat.size();
		int m = mat.get(0).size();

		Map<Integer, int[]> numberToPosition = new HashMap<>();
		int[] markedRows = new int[n];
		int[] markedCols = new int[m];

		for (int i = 0; i < n; i++) {
			List<Integer> rowList = mat.get(i);
			for (int j = 0; j < m; j++) {
				int num = rowList.get(j);
				numberToPosition.put(num, new int[] { i, j });
			}
		}

		for (int num : arr) {
			int[] position = numberToPosition.get(num);
			int row = position[0];
			int col = position[1];
			markedRows[row]++;
			markedCols[col]++;
			if (markedRows[row] == m || markedCols[col] == n) {
				return num;
			}
		}

		return -1;

	}
}
