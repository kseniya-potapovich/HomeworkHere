package task15_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private String name;
    private int group;
    private String course;
    private int[] grades;
    private final static List<Student> students = new ArrayList<>();

    public Student(String name, int group, String course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }


    public static void certification(LinkedList<Student> students) {
        List<Student> studentsSendDown = new ArrayList<>();
        double GPA;
        for (int i = 0; i < students.size(); i++) {
            GPA = students.get(i).GPA();
            System.out.println(GPA);
            if (GPA < 3) {
                studentsSendDown.add(students.get(i));
            } else {
                if (students.get(i).course == "4" && GPA >= 3) {
                    students.get(i).course = "Graduate";
                } else {
                    students.get(i).course = String.valueOf(Integer.parseInt(students.get(i).course )+ 1);
                }
            }
        }
        students.removeAll(studentsSendDown);
    }

    private double GPA() {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        return (double) sum / grades.length;
    }

    public static void printStudents(List<Student> students, int course){
        for (int i =0; i< students.size();i++){
            if (students.get(i).course == String.valueOf(course)){
                System.out.println(students.get(i).name);
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                '}';
    }
}
