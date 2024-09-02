package mydemo;

public class Test {

	public static void main(String[] args) {
		new Test().divide(5, 0);
	}

	public void divide(int a, int b) {
		try {
			int c = a / b;

		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
			;
		} finally {
			System.out.println("Inside finally...");
		}
	}

}
