class Person {
    String name;
    int age;
    String address;

    Person() {
        System.out.println("无参数的构造函数");
    }

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    Person(String name, int age, String address) {
        this(name, age);
        this.address = address;
    }

    void talk() {
        System.out.println("my name is " + name + ", I'm " + age + " yeas old, from " + address);
    }

}
