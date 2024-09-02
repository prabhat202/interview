package codeschool;

public class BinaryTree {
		private Node root;
		
		
	public void add(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
			return;
		}
		Node temp = root;
		
		if (data <= root.data) {
			
		}
		
	}
	
	
	
	static class Node {
		private int data;
		private Node left;
		private Node right;

		/**
		 * @param data
		 * 
		 */
		public Node(int data) {
			super();
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

	}

}
