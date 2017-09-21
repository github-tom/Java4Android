abstract class Person {
	Person() {
		System.out.println("Person 的构造函数");
	}

	Person(String name, int age) {
		this.name = name; 
		this.age = age;
	}

	String name;
	int age;

	void introduce() {
		System.out.println("my name is " + name + ", I'm " + age + " years old.");
	}

	abstract void eat();
}
