package ds.arrays;

public class StringTransformer {
	public static void main(String[] args) {
		String str = "aaabbc";
		String result = transformMsg(str);
		
		System.out.println(result);
	}

	private static String transformMsg(String str) {
		char[] arr = str.toCharArray();
		char begin = arr[0];
		StringBuilder result = new StringBuilder();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(begin == arr[i]) {
				count++;
			} else {
				result.append(begin).append(count);
				begin = arr[i];
				count = 1;
			}
		}
		if(count > 0) {
			result.append(begin).append(count);
		}
		
		
		return result.toString();
	}

}
