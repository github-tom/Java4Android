class Student extends Person {
    int grade;

    Student() {
        super(); 
        System.out.println("Student 的无参数构造函数");
    }

    Student(String name, int age, int grade) {
        //this.name = name;
        //this.age = age;
        super(name, age);
        this.grade = grade;
    }
}
