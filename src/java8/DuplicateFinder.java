package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateFinder {
	public static void main(String[] args) {
		String str = "hi howrr are you hi";
//		str = str.replaceAll(" ", "");
//		Map<String, Long> map = Arrays.stream(str.split(""))
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		map.forEach((k, v) -> {
//			if (v > 1) {
//				System.out.println(k + " - " + v);
//			}
//		});

		String s = Stream.of(str.split(" ")).reduce((a, b) -> a.length() > b.length() ? a : b).get();
		String s1 = Stream.of(str.split(" ")).collect(Collectors.maxBy(Comparator.comparingInt(String::length))).get();
		System.out.println(s);
		System.out.println(s1);
	}
}
