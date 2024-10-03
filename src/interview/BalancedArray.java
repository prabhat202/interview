package interview;

import java.util.Arrays;

public class BalancedArray {

	public static void main(String[] args) {
		
		//testing for revert
		int arr[] = {-2, 3, 2, -3, 5,-5};
		Arrays.sort(arr);
		boolean balanced  = true;
		int left = 0 ;
		int right = arr.length -1;
		
		while(left < right) {
	
			int sum = arr[left] + arr[right];
			if (sum == 0) {
				left++;
				right--;
				continue;
			} else {
				balanced = false;
				
			}
		}
		if (arr.length % 2 != 0 ) {
			if (arr[left] != 0) {
				balanced = false;
			}
		}
		if (balanced) {
			System.out.println("Balanced...");
		} else {
			System.out.println("Not Balanced");
		}
	}
}
