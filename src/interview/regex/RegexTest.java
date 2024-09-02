package interview.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String[] args) {
		String str = "Hello my phone number is 91-480-69-444";
		Pattern pa = Pattern.compile("\\d{2}-\\d{3}-\\d{2}");
		Matcher matcher = pa.matcher(str);
		while(matcher.find()) {
			String str1 = matcher.group();
			System.out.println(str1);
		}
		
	}
}
