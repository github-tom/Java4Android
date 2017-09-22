class Testcheck {
    public static void main(String args []) {
        try {
            Thread.sleep(1000);
            int i = 1 / 0;
        }
        catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
