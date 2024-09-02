package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumberPrinter {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
		
		List<Integer> primeNoList = numList.stream().filter(num -> isPrime(num)).collect(Collectors.toList());
		for(int i : primeNoList) {
			System.out.print(i +",");
		}
	}

	private static Boolean isPrime(Integer num) {
		boolean isPrime = true;
		if (num == 1) {
			isPrime = false;
		}
		for(int i = 2 ; i< num ; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}

}
