package java8;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringOperation {
	public static void main(String[] args) {
		String str = "Hi I am hello. hello";
		str = str.replaceAll("[^a-z A-Z]", "").replaceAll(" ", "").toLowerCase();
		Map<String, Long> ss = Stream.of(str.split("")).collect(Collectors.groupingBy(t -> t, Collectors.counting()));
		System.out.println(ss);
		
	}

}
