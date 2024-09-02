package java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {

		String str = "abc abc aaad";
		// String str1[] = str.split(" ");
		str = str.replaceAll(" ", "");
		Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() > 1).forEach(e -> {
					System.out.println(e.getKey() + "-" + e.getValue());
				});

	}

}
