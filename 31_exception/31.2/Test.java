class Test {
	public static void main(String args []) {
		User user = new User();
		try {
			user.setAge(-20);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
