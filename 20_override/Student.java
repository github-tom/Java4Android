class Student extends Person {
	String address;

	void introduce() {
		super.introduce();
		System.out.println("my address " + address);
	}
}
