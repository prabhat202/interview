package leetcode;

public class RootWordReplacement {
	private static String [] dictonary= {"a","b","c"};
	
	public static void main(String[] args) {
		String str = "aadsfasf absbs bbab cadsfafs";
		String strArr [] = str.split(" ");
		for(String word : dictonary) {
			for (int i = 0; i < strArr.length; i++) {
				if(strArr[i].startsWith(word)) {
					strArr[i] = word;
				}
			}
		}
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i]+" ");
		}
	}

}
