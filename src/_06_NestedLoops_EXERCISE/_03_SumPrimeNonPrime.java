package _06_NestedLoops_EXERCISE;

import java.util.Scanner;

public class _03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create two help variables for prime and non prime sums
        int sumPrimeNumbers = 0;
        int sumNonPrimeNumbers = 0;

        // While loop for getting each number until a "stop" command is received
        String command = scanner.nextLine();
        while (!command.equals("stop")) {
            // Convert the number from string to int
            int num = Integer.parseInt(command);
            // Create a variable for storing the count of dividers
            int dividersCount = 0;

            // Check if the current number is negative
            if (num < 0) {
                System.out.println("Number is negative.");
                // Read next number and continue with the next loop iteration
                command = scanner.nextLine();
                continue;
            }

            // For loop for getting the dividers a number can have (% operator)
            for (int i = 1; i <= num; i++) {
                // Check if the current number is divisible and increase the dividers counter
                if (num % i == 0) {
                    dividersCount++;
                }
            }

            // Check if the num is prime or non prime
            // Note: prime = 2 dividers / non prime > 2 dividers
            if (dividersCount > 2) {
                sumNonPrimeNumbers += num;
            } else {
                sumPrimeNumbers += num;
            }

            command = scanner.nextLine();
        }

        // Print out both prime and non prime sums
        System.out.printf("Sum of all prime numbers is: %d%n" +
                "Sum of all non prime numbers is: %d", sumPrimeNumbers, sumNonPrimeNumbers);

    }
}