//WEEK 3 TASK 1
//ERIC MAINA
//REG NO.: ct100/g/21350/24
import java.util.Scanner;

public class ExamEligibilitycheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter student's attendance percentage (e.g., 80): ");
        double attendance = input.nextDouble();

        // 2. Get user input for average marks
        System.out.print("Enter student's average marks: ");
        double averageMarks = input.nextDouble();

        
        if (attendance >= 75 && averageMarks >= 40) {
            System.out.println("\nStatus: Eligible for final exams.");
        } else {
            System.out.println("\nStatus: Not eligible.");
        }

        input.close();
    }
}
