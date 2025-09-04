package UNIT_3;


import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> LL1=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements :");
        int n=sc.nextInt();
        System.out.println("Enter elements :");

        for(int i=0;i<n;i++){
            LL1.add(sc.nextInt());

        }
        Iterator itr=LL1.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Collections.sort(LL1);
        System.out.println("Element in ascending order: " );
        System.out.println(LL1);
        System.out.println("Smallest Element in the list :"+LL1.getFirst());
        System.out.println("Largest Element in the list :"+LL1.getLast());


    }
}
