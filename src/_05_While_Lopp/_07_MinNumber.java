package _05_While_Lopp;

import java.util.Scanner;

public class _07_MinNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int min = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);

            if (number < min) {
                min = number;
            }
            input = scanner.nextLine();
        }

        System.out.println(min);

    }

}
