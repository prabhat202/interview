package datastructure.serching;

public class Fibonachi {

	public static void main(String[] args) {

		int n = 35;
		int[] memo = new int[n];
		int num = fibo(n, memo);
		System.out.println(num);

	}

	public static int fibo(int n, int[] memo) {
		if (n < 2) {
			return n;
		}
		int i, j;
		if (memo[n - 1] != 0) {
			i = memo[n - 1];
		} else {
			i = fibo(n - 1, memo);
			memo[n - 1] = i;
		}

		if (memo[n - 2] != 0) {
			j = memo[n - 2];
		} else {
			j = fibo(n - 2, memo);
			memo[n - 1] = j;
		}

		return i + j;
	}
}
