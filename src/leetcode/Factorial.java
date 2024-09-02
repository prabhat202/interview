package leetcode;

public class Factorial {
	
	public static void main(String[] args) {
		int n = 20;
		
		long result = fact(n);
		System.out.println(result);
	}

	private static long fact(long n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		return n * fact(n-1);
		
	}

}
