package interview;

import java.util.Collection;

enum Status {
    PENDING(3),
    PROCESSED(4),
    SHIPPED(2),
    DELIVERED(1);

    private final int priority;

    Status(int priority) {
      this.priority = priority;
    }

    public int getPriority() {
      return this.priority;
    }
  }

public class MyTest {
	public static void main(String[] args) {
//		Collection<Status> naturalOrderResult = statuses.stream().sorted().toList();
//			  System.out.println(naturalOrderResult);
			  // Output: [PENDING, PROCESSED, SHIPPED, DELIVERED]
	}
}
