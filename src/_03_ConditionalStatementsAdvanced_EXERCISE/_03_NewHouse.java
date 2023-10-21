package _03_ConditionalStatementsAdvanced_EXERCISE;

import java.util.Scanner;

public class _03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double finalPrice = 0.0;
        switch (flowerType) {
            case "Roses":
                finalPrice = 5.0 * countFlowers;

                if (countFlowers > 80) {
                    // finalPrice = finalPrice - (finalPrice * 0.10);
                    finalPrice = finalPrice * 0.90;
                }
                break;
            case "Dahlias":
                finalPrice = 3.80 * countFlowers;

                if (countFlowers > 90) {
                    // finalPrice = finalPrice - (finalPrice * 0.15);
                    finalPrice = finalPrice * 0.85;
                }
                break;
            case "Tulips":
                finalPrice = 2.80 * countFlowers;

                if(countFlowers > 80) {
                    // finalPrice = finalPrice - (finalPrice * 0.15);
                    finalPrice = finalPrice * 0.85;
                }
                break;
            case "Narcissus":
                finalPrice = 3.0 * countFlowers;

                if (countFlowers < 120) {
                    //finalPrice = finalPrice + (finalPrice * 0.15);
                    finalPrice = finalPrice * 1.15;
                }
                break;
            case "Gladiolus":
                finalPrice = 2.50 * countFlowers;

                if (countFlowers < 80) {
                    //finalPrice = finalPrice + (finalPrice * 0.20);
                    finalPrice = finalPrice * 1.20;
                }
                break;
        }

        double diff = Math.abs(budget - finalPrice);
        if (budget >= finalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flowerType, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}