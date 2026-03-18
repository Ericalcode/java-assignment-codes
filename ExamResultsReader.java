// /CT100/G/21350/24 
//Name:Eric Maina
import java.io.*;

class Student implements Serializable {
    String name;
    String regNumber;
    double marks;

    Student(String name, String regNumber, double marks) {
        this.name = name;
        this.regNumber = regNumber;
        this.marks = marks;
    }
}

public class ExamResultsReader {
    public static void main(String[] args) {
        File file = new File("results.dat");
        
        if (!file.exists()) {
            System.out.println("File results.dat not found. Please ensure it exists.");
            return;
        }

      e
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            System.out.println("-- Student Examination Results ---");
            while (true) {
                try {
                    Student s = (Student) ois.readObject();
                    // iii. Displaying name and marks
                    System.out.println("Name: " + s.name + " | Marks: " + s.marks);
                } catch (EOFException e) {
                    break; // End of file reached
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading binary file: " + e.getMessage());
        }
    }
}
