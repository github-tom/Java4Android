class Test4 {
    public static void main(String args []) {
        System.out.println(1);
        try {
            System.out.println(2);
            int i = 1/0;
            System.out.println(3);
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(4);
        }
        finally {
            System.out.println("finally");
        }
        System.out.println(5);
    }
}
