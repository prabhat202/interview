package datastructure.serching;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = { 10, 15, 20, 22, 35, 38, 39, 42, 45 };
		int key = 88;
		int start = 0;
		
		int end = arr.length -1;
		
		int index = binarySearch(arr,start, end , key);
		System.out.println(index);
	
	}

	private static int binarySearch(int[] arr, int start, int end, int key) {
		
		if (start > end) {
			return -1;
		}
		int mid = start + (end -start) /2;
		
		if (arr[mid] == key) {
			return mid;
		}
		
		if (key < arr[mid]) {
			return binarySearch(arr, start, mid-1, key);
		} else {
			return binarySearch(arr, mid +1 , end, key);
		}
	}

}
