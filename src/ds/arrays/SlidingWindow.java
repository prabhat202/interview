package ds.arrays;

public class SlidingWindow {
	public static void main(String[] args) {
		int [] arr = {1, 2 ,3 ,4 ,5, 6, 7, 1};
		int k =3;
		int[] result = new SlidingWindow().bruteForce(arr, k);
		
		System.out.println(result[0]+"-"+result[1]+"-"+result[2]);
	}

	public int[] bruteForce(int [] arr, int k) {
		int sum = 0;
		int max = 0;
		int [] result = new int[k];
		
		for (int i = 0; i < arr.length - k+1; i++) {
			sum = 0;
			for (int j = i; j  <i+k; j++) {
				sum += arr[j];
				
			}
			if (sum > max) {
				max = sum;
				result[0] = arr[i];
				result[1] = arr[i+1];
				result[2] = arr[i+2];
			}
		}
		return result;
	}
}
