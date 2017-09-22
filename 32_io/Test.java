import java.io.*;

class Test {
    public static void main(String args []) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("from.txt");
            fos = new FileOutputStream("to.txt");

            byte [] buffer = new byte[100];
            int temp = fis.read(buffer, 0, buffer.length);

            String s = new String(buffer);
            s = s.trim();
            System.out.println(s + " " + temp);

            fos.write(buffer, 0, temp);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

}
