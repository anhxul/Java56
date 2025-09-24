package UNIT_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        ArrayList<String> products = new ArrayList<>();

        System.out.println("Enter product names:");
        for (int i = 0; i < n; i++) {
            products.add(sc.next());
        }
        System.out.println("Products in unsorted order: ");
        System.out.println("Products list: " + products);
        System.out.println("Products in Sorted order: ");

        Collections.sort(products);
        System.out.println(products);
        System.out.println("Element at 3 index: ");
        System.out.println(products.get(3));
    }
}
