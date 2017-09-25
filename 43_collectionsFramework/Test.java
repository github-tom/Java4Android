import java.util.Map;
import java.util.HashMap;


public class Test {
    public static void main(String args []) {
        HashMap<String,String> hashMap = new HashMap<String, String>();
        Map<String, String> map = hashMap;

        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        map.put("5", "e");

        System.out.println("map size: " + map.size());

        String s = map.get("4");
        System.out.println("key:4, value:"+s);
    }
}
