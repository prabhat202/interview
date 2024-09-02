package codeschool;

import java.util.Stack;

public class MyLinkedList {

	private Node head;

	public void add(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}

	public void reverse() {
		Node curr = head;
		Node prev = null;
		Node next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;

	}

	public void display() {
		if (head == null) {
			System.out.println("List is empty....");
			return;
		}

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;

		}
	}

	public void displayRecur(Node curr) {
		if (curr.next == null) {
			System.out.println(curr.data);
			return;
		}

		System.out.println(curr.data);
		displayRecur(curr.next);
	}

	public void reverseListRecur(Node curr, Node prev) {
		if (curr == null) {
			head = prev;
			return;
		}

		Node next = curr.next;
		curr.next = prev;
		prev = curr;

		reverseListRecur(next, prev);

	}

	public void reverseListRecur2(Node curr) {
		if (curr.next == null) {
			head = curr;
			return;
		}
		reverseListRecur2(curr.next);
		Node prev = curr.next;
		prev.next = curr;
		curr.next = null;
	}

	public void reverseUingStack() {
		Stack<Node> st = new Stack<>();
	}

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.displayRecur(list.head);
		list.reverseListRecur(list.head, null);
		// list.reverseListRecur2(list.head);
		System.out.println();
		list.displayRecur(list.head);

	}

	static class Node {

		private int data;

		private Node next;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}

	}

}
