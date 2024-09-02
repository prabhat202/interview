package datastructure.serching;

public class SumOfDigit {

	public static void main(String[] args) {
		int num = 1234;
		//int sum = sumRemainder(num);
		//int sum = sumString("1234");
		int sum = sumRecursion(num);
		System.out.println(sum);
	}

	private static int sumRecursion(int num) {
		//Base case
		if (num == 0 ) {
			return 0;
		}
		int rem = num% 10;
		return rem + sumRecursion(num/10);
		
	}

	private static int sumRemainder(int num) {
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum += digit;
			num /= 10;
		}
		return sum;
	}

	private static int sumString(String num) {
		int sum = 0;
		char[] arr = num.toCharArray();
		for(char ch : arr) {
			int i = Integer.valueOf(Character.toString(ch));
			sum += i;
		}
		return sum;
	}

}
