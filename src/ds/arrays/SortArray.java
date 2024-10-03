package ds.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortArray {
	public static void main(String[] args) {
		int arr[] = { 20, -6, 2, 3, 5, 4 };
		int end = arr.length - 1;
		
		for (int i = 0; i < arr.length; i++) {
			
		}
		
		List<Integer> input = Arrays.asList(1,2,3,2,3,4,5,4,3,3,2,4,5,6);
		Map<Integer, Long> map = input.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);

	}

}
