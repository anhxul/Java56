package UNIT_3;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList <Integer> a=new ArrayList<>();
        a.add(12);
        a.add(13);
        a.add(24);
        a.add(45);
        a.add(67);
        for(int alist:a){
            System.out.print(alist+" ");
        }
    }
}
