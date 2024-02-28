package File_IO.Question6;

import java.io.*;
import java.util.*;

class Student implements Serializable {
    private int id;
    private String name;
    private String department;

    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student: " + "Id = " + id + ", Name = " + name + ", Department = " + department;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Student student1 = new Student(1, "Ravi", "CSE");
        Student student2 = new Student(2, "Kabilan", "ECE");
        Student student3 = new Student(3, "Vignesh", "AIML");
        String filePath = "/Users/kjayar18/IdeaProjects/Java-Assignments/src/main/java/File_IO/Question6/Serialized_Objects";

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fos = new FileOutputStream(filePath);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(studentList);

            System.out.println("Serialized Successfully");

            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);

            List<Student> deserializedObjects = (List<Student>)ois.readObject();

            System.out.println("Deserialized Objects: ");
            deserializedObjects.forEach(System.out::println);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            oos.close();
            fos.close();
            ois.close();
            fis.close();
        }
    }
}
