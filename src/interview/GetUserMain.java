package interview;

import java.util.ArrayList;
import java.util.List;

public class GetUserMain {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		userList.add(new User("1", "Prabhat"));
		userList.add(new User("2", "Bharat"));
		userList.add(new User("3", "Ram"));
		userList.add(new User("4", "Krishna"));
		GetUser user = new GetUserMain().method1(userList);
		System.out.println(user.toString());
		
		
	}
	
	public GetUser method1(List<User> list) {
		GetUser u =  id -> {
			for(User user: list) {
				if (id.equalsIgnoreCase(user.getId())) {
					return user;
				}
			}
			return null;
		};
		return u.getUser("3");
		
	}

}
