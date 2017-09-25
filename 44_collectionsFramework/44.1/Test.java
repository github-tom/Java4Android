public class Test {
	public static void main(String args []) {
		User u1 = new User();
		User u2 = new User();
		User u3 = u1;

		boolean b1 = u1 == u2;
		boolean b2 = u1 == u3;

		System.out.println(b1);
		System.out.println(b2);
	}
}
