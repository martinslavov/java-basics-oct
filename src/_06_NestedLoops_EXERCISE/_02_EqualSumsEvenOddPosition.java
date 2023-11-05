package _06_NestedLoops_EXERCISE;

import java.util.Scanner;

public class _02_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        // For loop for iterating through all numbers between startNum and endNum
        for (int i = startNum; i <= endNum; i++) {
            // Get the current number and work with it
            int currentNum = i;
            // Create 2 variables for even and odd sums
            int sumEvenPositions = 0;
            int sumOddPositions = 0;

            // For loop for iterating through EACH digit in the number
            // NOTE: starting from the last digit (from right to left)
            for (int j = 6; j >= 1; j--) {
                // Get last digit from number
                int lastDigit = currentNum % 10;
                // Remove the last digit from number
                currentNum = currentNum / 10;

                // Check if the last digit is on even or odd position
                // and add it to a sum
                if (j % 2 == 0) {
                    sumEvenPositions += lastDigit;
                } else {
                    sumOddPositions += lastDigit;
                }
            }

            // Check if the sums on odd and even position are equal
            if (sumEvenPositions == sumOddPositions) {
                System.out.print(i + " ");
            }
        }
    }
}