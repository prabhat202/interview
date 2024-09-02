package interview;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
	public static void main(String[] args) {
		Queue<Integer> q1 = new ArrayDeque<>();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);
		System.out.println(q1);
		reverseQueue(q1);
	}

	private static void reverseQueue(Queue<Integer> q1) {
		Stack<Integer> stack = new Stack();
		while (!q1.isEmpty()) {
			stack.push(q1.poll());
		}
		System.out.println(stack);
		System.out.println(q1);
		
	}

}
