package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecuenceFinder {

	public static void main(String[] args) {
		String str = "1 2 3 5 6 7 p 8 9 @ -1 -2 -3 -4";
		str = str.replaceAll("[^-?0-9]", " ").replaceAll("\s+", "\s");

		List<String> list = Arrays.stream(str.split(" ")).collect(Collectors.toList());
		List<Integer> intList = list.stream().map(Integer::valueOf).collect(Collectors.toList());
		List<List<Integer>> resultList = new ArrayList<>();
		
		
		for (int i = 0; i < intList.size() -1; i++) {
			int diff;
			int CONS = intList.get(i+1) - intList.get(i);
			List<Integer> list1 = new ArrayList<>();
			list1.add(intList.get(i));
			for (int j = i + 1; j < intList.size() - 1; j++) {
				diff = intList.get(j) - intList.get(j-1);

				if (diff == CONS) {
					list1.add(intList.get(j));
				} else {
					i = j-1;
					break;
				}
				if(!resultList.contains(list1)) {
					resultList.add(list1);
				}
				
			}
		}
		resultList.stream().forEach(list2 -> {
			list2.stream().forEach(System.out::print);
			System.out.println();
		});
	}

}
