package interview;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6 };
		int n = arr.length + 1;
		int expectedSum = n * (n + 1) / 2;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int missingNum = expectedSum - sum;

		System.out.println("Missing Number :" + missingNum);
	}

}
