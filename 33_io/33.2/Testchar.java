//字节输入流: Reader <-- FileReader
//int read(char[], int off, int len)
//字节输出流: Writer <-- FileWriter
//void write(char[], int off, int len)

import java.io.*;

public class Testchar {
    public static void main(String args []) {
        FileReader fr = null; 
        FileWriter fw = null;

        try {
            fr = new FileReader("from.txt");
            fw = new FileWriter("to.txt");

            char [] buffer = new char[100];
            while (true) {
                int temp = fr.read(buffer, 0, buffer.length);

                if (-1 == temp) {
                    break;
                }
                fw.write(buffer, 0, temp);  
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            try {
                fr.close();
                fw.close();
            } 
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
