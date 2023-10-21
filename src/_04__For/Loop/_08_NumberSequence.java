package _04__For.Loop;

import java.util.Scanner;

public class _08_NumberSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        // начало: 1
        // край: n
        // стъпка: 1

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }

            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }

        }

        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);

    }
}