package Encapsulation.Question4;

class Patient {
    private String name;
    private int age;
    private String[] medicalHistory;
    private static int index = 0;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        medicalHistory = new String[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void updateMedicalHistory(String disease) {
        this.medicalHistory[index++] = disease;
        System.out.println("Medical History of " + name + " has been updated");
    }

    public void displayPatientInfo() {
        System.out.println("Patient Info");
        System.out.println("-------------------------");
        System.out.print("Name: " + name + "\nAge: " + age + "\nMedical History: ");
        for(String disease : medicalHistory) {
            if(disease != null)
                System.out.print(disease + ", ");
        }
        System.out.print("\n-------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Mary",35);
        patient.updateMedicalHistory("Allergies:None");
        patient.displayPatientInfo();
    }
}
