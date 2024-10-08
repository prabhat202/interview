package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FractionToDecimal {
	
	public static String fractionToDecimal(int numerator, int denominator) {
		if (numerator == 0 ) return "0";
		StringBuilder sb = new StringBuilder();
		
		if (numerator < 0 && denominator > 0 ||
			numerator > 0 && denominator < 0) {
			sb.append("-");
		}
		
		long divisor = Math.abs((long) numerator);
		long dividend = Math.abs((long) denominator);
		long remainder = divisor % dividend;
		sb.append(divisor / dividend);
		
		if (remainder == 0) {
			return sb.toString();
		}
		
		sb.append('.');
		Map<Long, Integer> map = new HashMap<>();
		while(remainder != 0) {
			if(map.containsKey(remainder)) {
				sb.insert(map.get(remainder), "(");
				sb.append(")");
				break;
			}
			
			map.put(remainder, sb.length());
			remainder *= 10;
			sb.append(remainder / dividend);
			remainder %= dividend ;
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String result = fractionToDecimal(783, 7);
		System.out.println(result);
	}

}
