package _04_ForLoop_EXERCISE;

import java.util.Scanner;

public class _02_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num > maxNum) {
                maxNum = num;
            }

            sum = sum + num;
        }

        sum = sum - maxNum;
        if (sum == maxNum) {
            System.out.printf("Yes%nSum = %d", maxNum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(maxNum - sum));
        }

    }
}