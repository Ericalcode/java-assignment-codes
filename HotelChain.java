//ct100/g/21350/24
//ERIC MAINA
//Week 6 3D array
import java.util.Random;

public class HotelChain {
    public static void main(String[] args) {
        int[][][] chain = new int[3][5][10];
        Random rand = new Random();

        int totalOccupied = 0;

        // Assign random occupancy
        for (int b = 0; b < 3; b++) {
            for (int f = 0; f < 5; f++) {
                for (int r = 0; r < 10; r++) {
                    chain[b][f][r] = rand.nextInt(2);

                    if (chain[b][f][r] == 1) {
                        totalOccupied++;
                    }
                }
            }
        }

        // Output result
        System.out.println("Total occupied rooms across all branches: " + totalOccupied);
    }
}
