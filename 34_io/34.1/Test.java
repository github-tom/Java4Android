//生成BufferedReader对象的方法
//BufferedReader in = new BufferedReader(new FileRead("foo.in"));

import java.io.*;

class Test {
    public static void main(String args []) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader("users.txt");
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while(true) {
                line = bufferedReader.readLine();
                if(line == null) {
                    break;
                }
                System.out.println(line);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } 
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }

}
