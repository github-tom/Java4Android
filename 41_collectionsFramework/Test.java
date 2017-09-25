import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String args []) {
        ArrayList<String> arrayList = new ArrayList<String>();

        //add datas
        arrayList.add("abc");
        arrayList.add("bcd");
        arrayList.add("cde");
        arrayList.add("def");

        System.out.println("before remove, arrayList length: "+ arrayList.size());
        //remove element
        arrayList.remove(1);
        System.out.println("after remove, arrayList length: "+ arrayList.size());

        for (int i=0; i<arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
