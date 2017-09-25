import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Test{
    public static void main(String args []) {
        //Iterator <- Collection <- Set <- HashSet  
        //hasNext() next()

        Set<String> set = new HashSet<String>();
        //boolean b1 = set.isEmpty();
        //System.out.println(b1);

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        //boolean b2 = set.isEmpty();
        //System.out.println(b2);

        /*//
        int i = set.size();
        System.out.println("before clear, length of the object: " + i);
        set.clear();
        int j = set.size();
        System.out.println("after clear, length of the object: " + j);
        //*/

        //*//
        int i = set.size();
        System.out.println("before remove, length of the object: " + i);
        set.remove("a");
        int j = set.size();
        System.out.println("after remove, length of the object: " + j);
        //*/

        //调用Set对象的iterator()方法，会生成一个迭代器对象，该对象用于遍历整个Set
        Iterator<String> it = set.iterator();
        /*//
        boolean b = it.hasNext();
        if (b){
        String s = it.next();
        System.out.println(s);
        }
        //*/
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
