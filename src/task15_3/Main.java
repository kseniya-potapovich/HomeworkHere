package task15_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Lexa", 7,"3",new int[]{4,6,2}));
        students.add(new Student("Alina", 5,"2",new int[]{7,1,2,3}));
        students.add(new Student("Kirill", 4,"4",new int[]{5,2,3,8}));
        students.add(new Student("Nastya", 3,"1",new int[]{1,1,1,4}));

        System.out.println(students);
        Student.certification();
        System.out.println(students);

    }
}
