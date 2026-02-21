//Eric MAina 
//regno: Ct100/G/21350/24
import java.util.Scanner;

// This class acts as the data blueprint
class StudentRecord {
    int id;
    String name;
    String course;

    // Constructor: Matches the ID as an int
    StudentRecord(int studentID, String name, String course) {
        this.id = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to print the stored data
    void displayInfo() {
        System.out.println(" Student Details-");
        System.out.println("Student ID: " + id);
        System.out.println("Name:       " + name);
        System.out.println("Course:     " + course);
    }
}

// This is the main class that runs the program
public class StudentApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Prompting for data
        System.out.print("Enter Student ID : ");
    
        int id = Integer.parseInt(input.nextLine());

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Course: ");
        String course = input.nextLine();

        // 2. Instantiate the object
        StudentRecord student = new StudentRecord(id, name, course);

        student.displayInfo();

        input.close();
    }
}
