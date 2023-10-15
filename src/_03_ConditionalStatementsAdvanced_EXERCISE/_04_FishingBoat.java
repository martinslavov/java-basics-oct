package _03_ConditionalStatementsAdvanced_EXERCISE;

import java.util.Scanner;

public class _04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersCount = Integer.parseInt(scanner.nextLine());

        double boatRent = 0.0;
        if (season.equals("Spring")) {
            boatRent = 3000.0;
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            boatRent = 4200.0;
        } else if (season.equals("Winter")) {
            boatRent = 2600.0;
        }

        if (fishersCount <= 6) {
            boatRent = boatRent * 0.90;
        } else if (fishersCount >= 7 && fishersCount <= 11) {
            boatRent = boatRent * 0.85;
        } else if (fishersCount >= 12) {
            boatRent = boatRent * 0.75;
        }

        if (fishersCount % 2 == 0 && !(season.equals("Autumn"))) {
            boatRent = boatRent * 0.95;
        }

        double diff = Math.abs(budget - boatRent);
        if (budget >= boatRent) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}