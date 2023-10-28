package _04__For_Loop;

import java.util.Scanner;

public class _09_LeftAndRightSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            leftSum += number;
        }

        int rightSum = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            rightSum += number;
        }

        if (leftSum == rightSum) {
            System.out.println("Yes, sum = " + leftSum);
        } else {
            int diff = Math.abs(rightSum - leftSum);
            System.out.println("No, diff = " + diff);
        }

    }
}