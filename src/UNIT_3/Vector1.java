package UNIT_3;
import java.util.Vector;
public class Vector1 {
    public static void main(String[] args) {
        Vector<String> vt=new Vector<>(5,5);
        vt.add("First");
        vt.add("Second");
        vt.add("Third");
        vt.add("Fourth");
        vt.add("Fifth");
        vt.add("Sixth");
        vt.add(2,"APPLE");
        System.out.print("Capacity of the Vector : ");
        System.out.println(vt.capacity());
        System.out.print("Size of the Vector : ");
        System.out.println(vt.size());
        System.out.print("Removing element at 0th index: ");
        System.out.println(vt.remove(0));
        System.out.println(vt);

    }
}
