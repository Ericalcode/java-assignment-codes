// /CT100/G/21350/24
//Name:Eric Maina
import java.io.*;
import java.util.Scanner;

public class LibraryTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter book title to record: ");
        String bookTitle = input.nextLine();

        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("borrowed_books.txt", true)))) {
            out.println(bookTitle);
            System.out.println("Success: '" + bookTitle + "' has been stored in borrowed_books.txt.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
