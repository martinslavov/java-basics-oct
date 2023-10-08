package _02_ConditionalStatements_EXERCISE;

import java.util.Scanner;

public class _07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardCount = Integer.parseInt(scanner.nextLine());
        int processorCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double videoPrice = 250.0 * videoCardCount;
        double processorPrice = (videoPrice * 0.35) * processorCount;
        double ramPrice = (videoPrice * 0.10) * ramCount;

        double totalPrice = videoPrice + processorPrice + ramPrice;

        if (videoCardCount > processorCount) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        }

        double diff = Math.abs(budget - totalPrice);

        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
    }
}
