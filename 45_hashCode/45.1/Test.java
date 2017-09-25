import java.util.*;

public class Test {
	public static void main(String args []) {
		User u = new User("zhangsan", 12);

		System.out.println("hashcode:" + u.hashCode());

		HashMap<User, String> map = new HashMap<User, String>();
		map.put(u, "abc");
		System.out.println("hashcode:" + u.hashCode());

		String s = map.get(new User("zhangsan", 12));
		System.out.println("hashcode:" + u.hashCode() + s);
	}
}
