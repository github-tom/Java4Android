class Test {
    public static void main(String args[]) {
        Student stu = new Student();
        stu.name = "zhangsan";
        stu.age = 19;
        stu.grade = 8;

        Teacher teacher = new Teacher();
        teacher.name = "lisi";
        teacher.age = 36;

        stu.eat();
        stu.study();
        stu.introduce();
        teacher.introduce();
    }
}
