package _04__For_Loop;

import java.util.Scanner;

public class _07_SumNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }

        System.out.println(sum);

    }

}