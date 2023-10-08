package _02_ConditionalStatements_EXERCISE;

import java.util.Scanner;

public class _04_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddiesCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        int toysCount = puzzleCount + dollsCount +
                teddiesCount + minionsCount + trucksCount;

        double totalPrice = (2.60 * puzzleCount) + (3.0 * dollsCount)
                + (4.10 * teddiesCount) + (8.20 * minionsCount)
                + (2.00 * trucksCount);

        if (toysCount >= 50) {
            //totalPrice = totalPrice - (totalPrice * 0.25);
            totalPrice = totalPrice * 0.75;
        }

        totalPrice = totalPrice * 0.90;

        double diff = Math.abs(totalPrice - tripPrice);

        if (totalPrice >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }

    }
}
