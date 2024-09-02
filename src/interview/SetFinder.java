package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SetFinder {
	public static void main(String[] args) {
		Integer[] arr = { 2, 4, 6, 10};
		Integer[] result = new Integer[arr.length+2];
		
		List<Integer> list = Arrays.asList(arr);
		Collections.sort(list);
		int diff;
		int index = 0;
		
		int  max= Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length -1 ; i++) {
			diff = list.get(i+1) - list.get(i);
			if (max > diff) {
				max = diff;
			}
		}
		for (int i = 0; i < arr.length -1 ; i++) {
			diff = list.get(i+1) - list.get(i);
			if (diff == max) {
				result[index++] = list.get(i);
				result[index++] = list.get(i+1);
			} 
			
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]+" ");
		}
	}

}
