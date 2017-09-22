class Test {
    public static void main(String args[]) {
        System.out.println(1);
        try {
            int i = 1/0;    	
        }
        catch (Exception e) {
            System.out.println(e + " ph");
        }
        finally {
            System.out.println("wd");
        }
        System.out.println(2);
    }
}
