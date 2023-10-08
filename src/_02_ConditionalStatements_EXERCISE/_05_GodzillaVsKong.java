package _02_ConditionalStatements_EXERCISE;

import java.util.Scanner;

public class _05_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int mutesCount = Integer.parseInt(scanner.nextLine());
        double pricePerMute = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;
        double mutesFinalPrice = mutesCount * pricePerMute;

        if (mutesCount > 150) {
            //mutesFinalPrice = mutesFinalPrice - (mutesFinalPrice * 0.10);
            mutesFinalPrice = mutesFinalPrice * 0.90;
        }

        double totalPrice = decorPrice + mutesFinalPrice;

        double diff = Math.abs(totalPrice - budget);
        if (totalPrice > budget) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", diff);
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", diff);
        }
    }
}
