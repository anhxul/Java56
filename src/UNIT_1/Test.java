package UNIT_1;

public class Test {
    void showA() {
        System.out.println("Iam Showing A");
    }


}
class B extends Test {
    void ShowB() {
        System.out.println("Iam Showing UNIT_1.B");

    }
}
class C extends B{
    void ShowC(){
        System.out.println("Iam in UNIT_1.B method called by UNIT_1.C");
    }
    public static void main(String[] args){
        C obj=new C();
        obj.showA();
        obj.ShowB();
        obj.ShowC();
    }

}

