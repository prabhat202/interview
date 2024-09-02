package mydemo;

public class MaxSubarrySum {

	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		// time complexity O(n3)
		//bruteForceApproach(arr);
		optimizedApproach(arr);

	}

	// Method 1
	public static void bruteForceApproach(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		int startIndex = 0, endIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += arr[k];
				}
				if (maxSum < sum) {
					maxSum = sum;
					startIndex = i;
					endIndex = j;
				}
			}
		}
		System.out.println("MaxSum = " + maxSum);
		System.out.print("{");
		for (int i = startIndex; i <= endIndex; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.print("}");
	}

	// Method 2
	public static void optimizedApproach(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		int startIndex = 0, endIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (maxSum < sum) {
					maxSum = sum;
					startIndex = i;
					endIndex = j;
				}
			}
		}
		System.out.println("MaxSum = " + maxSum);
		System.out.print("{");
		for (int i = startIndex; i <= endIndex; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.print("}");
	}
}
