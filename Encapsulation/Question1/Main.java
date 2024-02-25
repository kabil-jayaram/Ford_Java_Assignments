package Encapsulation.Question1;

import java.util.Arrays;

class Student {
    private String name;
    private int id;
    private int[] grades;

    public Student(String name, int id, int[] grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        double averageGrade = 0.0;
        for(int grade : grades)
            averageGrade += grade;
        averageGrade /= grades.length;
        return averageGrade;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kabilan",1093, new int[]{85, 90, 78});
        System.out.println("Average Grade: " + student.calculateAverageGrade());
    }
}
