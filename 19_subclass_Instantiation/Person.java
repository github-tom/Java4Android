class Person {
    String name;
    int age;

    Person() {
        System.out.println("Person 的无参数构造函数");
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person 的有参数构造函数");
    }

    void eat() {
        System.out.println("eat");
    }
}
