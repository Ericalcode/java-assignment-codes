//ERIC MAINA 
//CT100/G/21350/24
//week 6 2D array
import java.util.Scanner;

public class RoomOccupancyInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] occupancy = new int[5][10];

        for (int i = 0; i < 5; i++) {
            System.out.println("Floor " + (i + 1));
            for (int j = 0; j < 10; j++) {
                System.out.print("Room " + (j + 1) + " (1=occupied, 0=vacant): ");
                occupancy[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            int occupied = 0, vacant = 0;

            for (int j = 0; j < 10; j++) {
                if (occupancy[i][j] == 1) occupied++;
                else vacant++;
            }

            System.out.println("Floor " + (i + 1) +
                    " -> Occupied: " + occupied +
                    ", Vacant: " + vacant);
        }

        input.close();
    }
}
