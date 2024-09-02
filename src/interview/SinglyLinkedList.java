package interview;

public class SinglyLinkedList<T> {

	private Node root;

	public void add(Node node) {
		if (root == null) {
			root = node;
			System.out.println(node.val + " Added successfully...");
			return;
		}
		Node<T> temp = root;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		System.out.println(node.val + " Added successfully...");
	}
	
//	public void push(Node node) {
//		if(root == null) {
//			System.out.println("List is empty...");
//			return;
//		}
//		
//		root
//	}

	public void delete() {
		if (root == null) {
			System.out.println("List Empty...");
			return;
		}
		Node<T> temp = root;
		while (temp.next.next != null) {
			System.out.println(temp.val + "Deleted successfully...");
			temp.next = null;
		}

	}

	public void display() {

        Node current = root;

        // Traverse the linked list until reaching the end
        // (null)
        while (current != null) {
            // Print the data of the current node
            System.out.print(current.val + " ");

            // Move to the next node
            current = current.next;
        }

        System.out.println();
	}

	
	public void reverseList() {
		
		Node next, prev = null;
		
		while(root != null) {
		next = root.next;
		root.next = prev;
	    prev = root;
	    root = next;
		}
	    root = prev;
		
	}
	static class Node<T> {
		private T val;
		private Node next;

		public Node(T val) {
			super();
			this.val = val;
			this.next = null;
		}

	}

	public static void main(String[] args) {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		list.add(new Node(1));
		list.add(new Node(2));
		list.add(new Node(3));
		list.add(new Node(4));
//		list.add(new Node(5));

		list.display();
		list.reverseList();
		list.display();
	}
}
