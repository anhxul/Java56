package UNIT_1;

public class Animal {
    String color;
    int age;
    void initObj(String c,int a){
        color=c;
        age=a;


    }
    public void eat(){
        System.out.print("eating RN babes");
    }
    public static void main(String[] args){
        Animal buzo=new Animal();
        buzo.initObj("Brown and White",12);
        buzo.display();
    }
    public void display(){
        System.out.println("His colour is "+color+" and he is "+age+" old");
    }


}
