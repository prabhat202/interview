package interview;

public class TableWithData {

	public static void main(String[] args) {
		int[] A = { 4, 35, 80, 123, 12345, 44, 8, 5, 24, 3, 33, 11, 3, 888888 };
		int K = 4;
		new TableWithData().solution(A, K);
	}

	public void solution(int[] A, int K) {
		// Implement your solution here
		int max = 0;
		int numOfElem = A.length;
		int noOfRow = numOfElem / K;
		int extraItem = numOfElem % K;
		StringBuilder sb = new StringBuilder();
		String arr[] = new String[A.length];

		for (int i = 0; i < A.length; i++) {
			String s = "" + A[i];
			int len = s.length();
			if (len > max) {
				max = len;
			}
		}
		for (int i = 0; i < A.length; i++) {
			String s = "" + A[i];
			int len = s.length();
			s = appendSpace(s, max - len);
			arr[i] = s;
		}
		int index = 0;
		for (int row = 0; row < noOfRow; row++) {
			prepareLine(sb, K, max);
			sb.append("|");
			for (int col = 0; col < K; col++) {
				sb.append(arr[index++]);
				sb.append("|");
			}
			sb.append("\n");
		}
		if (numOfElem > K) {
			prepareLine(sb, K, max);
		} else {
			prepareLine(sb, extraItem, max);
		}

		// print remaing item
		if (extraItem > 0) {
			while (index < A.length) {
				sb.append("|");
				sb.append(arr[index++]);
			}
			sb.append("|");
			sb.append("\n");
			prepareLine(sb, extraItem, max);
		}

		System.out.print(sb.toString());

	}

	public String appendSpace(String s, int n) {
		String space = " ";
		for (int i = 0; i < n; i++) {
			s = space + s;
		}
		return s;
	}

	public void prepareLine(StringBuilder sb, int K, int max) {
		for (int i = 0; i < K; i++) {
			sb.append("+");
			for (int j = 0; j < max; j++) {
				sb.append("-");
			}
		}
		sb.append("+");
		sb.append("\n");

	}
}
