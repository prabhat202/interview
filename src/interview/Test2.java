package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

record Employee1(int id, String name) {}

public class Test2 {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 4, 5, 2, 4, 4);
		Map<Integer, Long> countingMap  = intList.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println(countingMap);
		
		String str = "hi hello hi you hello hi.";
		List<String> strArr = Arrays.asList(str.split(" "));
		Map<String, Long> countingMap2 = strArr.stream().map(t -> process(t)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(countingMap2);

	}

	private static String process(String t) {
		String regex = "[^a-zA-Z0-9]";
		t = t.replaceAll(regex, "");
		return t;
	}

}
