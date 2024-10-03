package general;

public interface MyInterface {
	
	public default void show() {
		System.out.println("show...");
		show(1,2);
	}
	
	public void show(int a, int b);

}
