class Chinese extends Person {
	String address;

	Chinese() {
		System.out.println("Chinese 的构造函数");
	}

	Chinese(String name, int age, String address) {
		super(name, age);
		this.address = address;
	}

	void eat() {
		System.out.println("I use chopsticks to eat");
	}
}

