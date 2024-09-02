package mydemo;

public class CombinationFinder {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 1, 2, 3, 4, 5 };
		int[] countArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int index = arr[i];

			int count = countArr[index];
			countArr[index] = ++count;

		}
		for (int i = 0; i < countArr.length; i++) {
			if (countArr[i] > 1) {
				System.out.println("Num :" + i + " freq : " + countArr[i]);
			}

		}
	}

}
