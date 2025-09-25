import UNIT_3.StudentComparator;

import java.util.*;

public class StudentsAsObjects {

    public static void main(String[] args) {
        List<StudentComparator> students = new ArrayList<>();

        students.add(new StudentComparator(21, "Anshu", 101));
        students.add(new StudentComparator(19, "", 102));
        students.add(new StudentComparator(20, "Priya", 103));
        students.add(new StudentComparator(21, "Divya", 104));
        students.add(new StudentComparator(22, "Shabeena", 105));

        Collections.sort(students);

        for (StudentComparator st : students) {
            System.out.println(st);
        }
    }
}
