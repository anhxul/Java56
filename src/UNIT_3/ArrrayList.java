package UNIT_3;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;


public class ArrrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(12);
        al.add(23);
        al.add(1);
        al.add(-13);
        al.add(0);
        al.add(55);
        al.add(63);
        System.out.println("Array list in Ascending order:");
        Collections.sort(al);
        System.out.println(al);
        System.out.println("Array list in Reverse order:");

        Collections.sort(al, Comparator.reverseOrder());
        System.out.println(al);

    }
}
