import java.io.*;

class Test {
    public static void main(String args []) {
        FileInputStream fis = null; 
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("from.txt");
            fos = new FileOutputStream("to.txt");

            byte [] buffer = new byte[1024];
            while (true) {
                int temp = fis.read(buffer, 0, buffer.length);
                if (temp == -1) {
                    break; 
                }
                fos.write(buffer, 0, temp);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            try {
                fis.close();
                fos.close();
            } 
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
