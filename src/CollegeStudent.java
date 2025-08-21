public class CollegeStudent extends Student {
    public int roll;

    public CollegeStudent(String address, int roll) {
        super(address);
        this.roll = roll;
    }

    public void show_roll(){
        System.out.println("Roll is "+roll);
    }

}
