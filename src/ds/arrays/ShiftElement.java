package ds.arrays;

public class ShiftElement {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		int pos = 2;
		int x = 9;
		insertElement(arr, n, x, pos);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	static void insertElement(int arr[], int n, int x, int pos)
	{
	 for (int i = pos; i < arr.length -1; i++) {
		 int temp = arr[i];
		 arr[pos] = x;
		 arr[i+1] = temp;
	}   
	}
}
