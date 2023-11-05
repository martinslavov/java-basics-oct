package _06_NestedLoops_EXERCISE;

import java.util.Scanner;

public class _05_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // Range -> 1111 to 9999
        // Create four nested For loops for iterating through the numbers in between
        // NOTE: no 0 included in the range
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {

                        // Check if the number is special = divisible by each digit in the current num
                        if (n % i == 0 && n % j == 0 && n % k == 0 && n % l == 0) {
                            System.out.print("" + i + j + k + l + " ");
                        }

                    }
                }
            }
        }
    }
}