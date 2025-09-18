package UNIT_3;

public class StudentComparator implements Comparable<StudentComparator> {
    int age;
    String name;
    int roll_no;

    public StudentComparator(int age, String name, int roll_no) {
        this.age = age;
        this.name = name;
        this.roll_no = roll_no;
    }

    public int compareTo(StudentComparator st) {
        if (this.age == st.age) {
            return 0;
        } else if (this.age > st.age) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return "Roll No: " + roll_no + ", Name: " + name + ", Age: " + age;
    }
}
