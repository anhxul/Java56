package UNIT_3;

import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements you want to add to the array:");

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array elements are : ");
        for(int i=0;i<a.length;i++){
            System.out.println("Element at "+i+" Postition is "+a[i]);

        }
    }
}
