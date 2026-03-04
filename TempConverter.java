
//week 5 Q3
//Eric Maina
//ct100/g/21350/24
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        System.out.printf("%.1f°F is approximately %.1f°C%n",
                fahrenheit, convertToCelsius(fahrenheit));
        input.close();
    }

    public static double convertToCelsius(double f) {
        // Formula: C = (F - 32) * 5/9
        return (f - 32) * (5.0 / 9.0);
    }
}
