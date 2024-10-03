package interview1;

public class Outer {

	public static int temp1 = 1;
	private static int temp2 = 2;
	private int temp4 = 4;

	public class Inner {
		private int temp5 = 5; // Line 13

		private int getSumof2() {
			return (temp1 + temp2);
		}

		int getSumof4() {
			return (temp1 + temp2 + temp4); // Line 20
		}

		public int getSumof5() {
			return (temp1 + temp2 + temp5); // Line 24
		}
	}

	public static void main(String[] args) {
		
		Outer.Inner obj = new Outer().new Inner(); // Line 30
		System.out.println(obj.getSumof2());
		System.out.println(obj.getSumof4());
		System.out.println(obj.getSumof5());
	}

}
