package java8;

public class SqrtFinder {
	public static void main(String[] args) {
		int [] arr = {6, 2, 4, 8, 15, 7, 24, 17};// 4, 8- 1, 15- 2, 25-2
		int N = arr.length / 2;
		int step = 0;
		
		for(int i = 0; i < arr.length ; i++ ) {
			if((N != 0)) {
				if (isInteger(arr[i])) {
					N--;
				} else {
					if(isInteger(arr[i] - 1)) {
						N--;
						step++;
					}
					if(isInteger(arr[i] +1)) {
						N--;
						step++;
					}
				}
			}
		}
		
		System.out.println(step);		
		
	}

	public static boolean isInteger(int no) {
		double n = Math.sqrt(no);
		if (n != 1 && n % 1 == 0) {
			return true;
		}
		return false;
	}
}
