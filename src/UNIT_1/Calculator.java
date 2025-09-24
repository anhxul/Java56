package UNIT_1;

import java.util.*;



public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x,y,z=0;
        System.out.println("Enter any two numbers: ");


        try{
            x=sc.nextInt();
            y=sc.nextInt();
            z=x/y;
            System.out.println("Exception NOT occurs");
        }


        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }



        finally{
            System.out.println(z);
        }



    }

}
