package _03_ConditionalStatementsAdvanced_EXERCISE;

import java.util.Scanner;

public class _09_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String grade = scanner.nextLine();

        int nights = days - 1;
        double finalPrice = 0.0;

        if(room.equals("room for one person")) {
            finalPrice = 18.0 * nights;
        }
        else if(room.equals("apartment")) {
            finalPrice = 25.0 * nights;

            if (days < 10) {
                finalPrice  = finalPrice * 0.70;
            } else if (days >= 10 && days <= 15) {
                finalPrice = finalPrice * 0.65;
            } else if (days > 15) {
                finalPrice = finalPrice * 0.50;
            }
        }
        else if(room.equals("president apartment")) {
            finalPrice = 35.0 * nights;

            if (days < 10) {
                finalPrice  = finalPrice * 0.90;
            } else if (days >= 10 && days <= 15) {
                finalPrice = finalPrice * 0.85;
            } else if (days > 15) {
                finalPrice = finalPrice * 0.80;
            }
        }


        switch (grade) {
            case "positive":
                finalPrice = finalPrice * 1.25;
                break;
            case "negative":
                finalPrice = finalPrice * 0.90;
                break;
        }

        System.out.printf("%.2f", finalPrice);

    }
}