package interview;

public class ShortingMessage {

	public static void main(String[] args) {
		String msg = "abaacddsssa";
		char[] arr = msg.toCharArray();
		int count = 0;
		StringBuilder sb = new StringBuilder();
		char ch = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(ch == arr[i]) {
				count++;
			} else {
				sb.append(ch).append(count);
				ch = arr[i];
				count = 1;
			}
		}
		sb.append(ch).append(count);
		
		String result = sb.toString();
		result = result.replaceAll("1", "");
		System.out.println(result);
	}

}
