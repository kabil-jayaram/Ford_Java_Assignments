package Collections2.Question9;

import java.util.*;

class Student {
    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGPA() {
        return gpa;
    }
}

class GPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if(student1.getGPA() > student2.getGPA())
            return 1;
        else if(student1.getGPA() < student2.getGPA())
            return -1;
        else
            return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the Student Name, ID and GPA: ");
        int i;
        for(i = 0;i < size;i++) {
            String name = scanner.nextLine();
            int id = scanner.nextInt();
            double gpa = scanner.nextDouble();
            scanner.nextLine();
            Student student = new Student(name, id, gpa);
            System.out.println("Student " + name + " added to list");
            studentList.add(student);
        }

        studentList.sort(new GPAComparator());

        System.out.println("Students sorted by GPA");
        for(Student student: studentList)
            System.out.println(student.getName() + " (" + student.getId() + ") - GPA: " + student.getGPA());
        scanner.close();
    }
}