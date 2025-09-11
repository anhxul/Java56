package UNIT_3;
import java.util.HashMap;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> mp=new HashMap<>();
    mp.put("First",1);
    mp.put("Second",2);
    mp.put("Third",3);
        System.out.println(mp.get("First"));
        System.out.println(mp.containsKey("Second"));
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.containsValue(2));


    }
}
