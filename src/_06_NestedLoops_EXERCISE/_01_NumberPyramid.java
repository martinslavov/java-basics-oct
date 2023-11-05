package _06_NestedLoops_EXERCISE;

import java.util.Scanner;

public class _01_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // Create a num iterator for printing in the pyramid
        int numCounter = 1;
        // Create a flag for signaling that N is reached from numCounter
        boolean isNumLimitReached = false;

        // For loop for iterating through the rows (r = rows)
        for (int r = 1; r <= n; r++) {

            // For loop for iterating through the columns and for printing the current num
            for (int c = 1; c <= r; c++) {
                // Print out the current num
                System.out.printf(numCounter + " ");
                // Increase with 1 the current num
                numCounter++;

                // Check if the current num has reached N and break the NESTED loop
                if (numCounter > n) {
                    isNumLimitReached = true;
                    break;
                }
            }

            // Check for signal/flag from the nested loop and break the MAIN loop
            if (isNumLimitReached) {
                break;
            }
            System.out.println();
        }

    }
}