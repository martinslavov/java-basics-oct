package _03_ConditionalStatementsAdvanced_EXERCISE;

import java.util.Scanner;

public class _01_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String showType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int seatsAll = rows * columns;

        double finalPrice = 0.0;
        switch (showType) {
            case "Premiere":
                finalPrice = 12.00 * seatsAll;
                break;
            case "Normal":
                finalPrice = 7.50 * seatsAll;
                break;
            case "Discount":
                finalPrice = 5.00 * seatsAll;
                break;
        }

        System.out.printf("%.2f leva", finalPrice);
    }
}