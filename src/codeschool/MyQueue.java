package codeschool;

public class MyQueue {

	private int[] data;

	private int front, rear = -1;

	private final int SIZE;

	public MyQueue(int size) {
		SIZE = size;
		data = new int[size];
	}

	public void enqueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full...");
			return;
		}
		data[++rear] = element;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty...");
			return -1;
		} else if (front == rear) {
			int element = data[front];
			front = rear = -1;
			return element;

		} else {
			return data[front++];
		}
	}

	public boolean isEmpty() {
		if (front == -1 && rear == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (rear == SIZE - 1) {
			return true;
		}
		return false;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty...");
			return;
		}
		for (int i = front; i <= rear; i++) {
			System.out.print(data[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		MyQueue q = new MyQueue(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		//q.display();
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.display();
	}
}
