class Student extends Person {
	String address;

	void study() {
		System.out.println("I'm studing");
	}

	void introduce() {
		super.introduce();
		System.out.println("my address is " + address);
	}
}
