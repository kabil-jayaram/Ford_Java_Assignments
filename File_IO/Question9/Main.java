package File_IO.Question9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Student implements Serializable {
    private int id;
    private String name;
    private String department;

    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student: " + "Id = " + id + ", Name = " + name + ", Department='" + department;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Student student1 = new Student(1, "Kishore", "IT");
        Student student2 = new Student(2, "Haribala", "BT");
        Student student3 = new Student(3, "Vignesh", "AIML");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        String filePath = "/Users/kjayar18/IdeaProjects/Java-Assignments/src/main/java/File_IO/Question9/Serialized_Objects";

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

            List<Student> deserializedStudentList = (List<Student>) ois.readObject();

            System.out.println("Deserialized Student List");
            deserializedStudentList.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            fos.close();
            oos.close();
            fis.close();
            ois.close();
        }
    }
}
