public class Test {
    public static void main(String args []) {
        User u1 = new User();
        User u2 = new User();
        User u3 = new User();
        User u4 = u1;

        DT dt = new DT();

        u1.name = "zhangsan";
        u1.age = 12;

        u2.name = "lisi";
        u2.age = 12;

        u3.name = "zhangsan";
        u3.age = 12;

        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(u3));
        System.out.println(u1.equals(u4));
        System.out.println(u1.equals(dt));
    }
}
