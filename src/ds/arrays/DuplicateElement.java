package ds.arrays;

public class DuplicateElement {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 5, 6, 6, 7 };
		int temp = arr[0];
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (temp != arr[i]) {
				temp = arr[i];
				count = 1;
			} else {
				count++;
				if (count > 1) {
					System.out.println("Duplicate element---"+arr[i]);
				}
			}
		}
		
	}
	

}
