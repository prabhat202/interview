package interview;

public class MyLinkedList {

	private Node head;

	public void add(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;

	}

	public Node remove() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		return null;
	}

	public Node removeAtPosition(int position) {
		if(position < 1) {
			return null;
		}
		Node currentNode = head;
		Node prevNode = head;
		int counter = 1;
		while (currentNode != null) {
			if (position == counter) {
				break;
			}
			counter++;
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
		
		prevNode.next = currentNode.next; 
		
		return currentNode;
	}

	public void traversList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}

	// Driver
	public static void main(String[] args) {
		MyLinkedList myList = new MyLinkedList();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.traversList();
		myList.removeAtPosition(2);
		
		myList.traversList();
	}

	class Node {

		private int data;

		private Node next;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}
