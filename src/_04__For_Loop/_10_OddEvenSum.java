package _04__For_Loop;

import java.util.Scanner;

public class _10_OddEvenSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        int numbersSumOfEvenPositions = 0;
        int numbersSumOfOddPositions = 0;


        for (int position = 0; position < n; position++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (position % 2 == 0) {
                numbersSumOfEvenPositions += currentNumber;
            } else {
                numbersSumOfOddPositions += currentNumber;
            }

        }

        if (numbersSumOfEvenPositions == numbersSumOfOddPositions) {
            System.out.println("Yes");
            System.out.println("Sum = " + numbersSumOfEvenPositions);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(numbersSumOfEvenPositions - numbersSumOfOddPositions));
        }

    }
}
