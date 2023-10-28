package _05_While_Lopp;

import java.util.Scanner;

public class _06_MaxNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int max = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {

            int number = Integer.parseInt(input);

            // правим проверка дали е макс
            if (number > max) {
                max = number;
            }

            input = scanner.nextLine();
        }

        System.out.println(max);

    }
}

