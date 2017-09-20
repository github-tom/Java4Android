class Test {
    public static void main(String args []) {
        Person p1 = new Person();
        Person p2 = new Person();

        Person.i = 10;
        System.out.println("p1 的 i 的值为" + p1.i);
        System.out.println("p2 的 i 的值为" + p2.i);


        p1.i = 110;
        System.out.println("p1 的 i 的值为" + p1.i);
        System.out.println("p2 的 i 的值为" + p2.i);
    }
}
