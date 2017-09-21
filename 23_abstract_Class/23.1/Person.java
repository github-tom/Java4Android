abstract class Person {
	String name;
	int age;

	void introduce() {
		System.out.println("my name is " + name + ", I'm " + age + "years old.");
	}
	abstract void eat();
}
