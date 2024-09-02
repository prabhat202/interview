package codeschool;

public class Stack {
	private final int SIZE;
	private final int[] data;
	private int TOP = -1;

	/**
	 * @param sIZE
	 */
	public Stack(int sIZE) {
		super();
		SIZE = sIZE;
		data = new int[SIZE];
	}

	public boolean push(int data) {
		if (TOP == SIZE) {
			System.out.println("Stack is OVERFLOW");
			return false;
		}
		this.data[++TOP] = data;
		System.out.println(data + " PUSHED SUCCESSFULLY...");
		return true;

	}

	public boolean pop() {
		if (TOP == -1) {
			System.out.println("Stack is EMPTY..");
			return false;
		}
		System.out.println();
		System.out.println(data[TOP--] + " POPPED SUCCESSFULLY...");
		return true;

	}

	public void display() {
		for (int i = 0; i <= TOP; i++) {
			System.out.print(data[i] + " ");
		}
	}

	public static void main(String[] args) {
		Stack st = new Stack(5);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.display();
		st.pop();
		st.display();
		st.push(8);
		st.display();
		
	}
}
