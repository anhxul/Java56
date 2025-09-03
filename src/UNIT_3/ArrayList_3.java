package UNIT_3;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList_3 {
    public static void main(String[] args) {
        ArrayList<String> products=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of products");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            products.add(sc.next());
        }
        Iterator itr=products.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Collections.sort(products);
        System.out.println("Products in Sorted order: ");
        System.out.println(products);
        System.out.println("Smallest Products: "+products.getFirst());
        System.out.println("largest Products: "+products.getLast());
        System.out.println("Adding Products: ");
        System.out.println("Adding Litchi at First...");
        products.addFirst("Litchi");
        System.out.println("Adding Papaya at last... ");
        products.addLast("Papaya");
        System.out.println("Adding Mint at second index... ");
        products.add(2,"Mint");

        System.out.println("Product at second index: "+products.get(2));


    }
}
