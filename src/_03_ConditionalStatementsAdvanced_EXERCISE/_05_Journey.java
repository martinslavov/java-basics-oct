package _03_ConditionalStatementsAdvanced_EXERCISE;

import java.util.Scanner;

public class _05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        // create helping variables for destination (Bulgaria/Balkans/Europe),
        // for rest type (Camp/Hotel) and for spent money
        String destination = "";
        String rest = "";
        double spentMoney = 0.0;

        // check if the budget is <= 100 to take holiday in Bulgaria
        if(budget <= 100) {
            destination = "Bulgaria";
            // calc price for holiday regarding the season
            // and define rest type
            if(season.equals("summer")) {
                rest = "Camp";
                spentMoney = budget * 0.30;
            } else if(season.equals("winter")) {
                rest = "Hotel";
                spentMoney = budget * 0.70;
            }
        }
        // check if the budget is <= 1000 to take holiday in Balkans
        else if (budget <= 1000) {
            destination = "Balkans";
            // calc price for holiday regarding the season
            // and define rest type
            if(season.equals("summer")) {
                rest = "Camp";
                spentMoney = budget * 0.40;
            } else if(season.equals("winter")) {
                rest = "Hotel";
                spentMoney = budget * 0.80;
            }
        }
        // check if the budget is > 100 to take holiday in Europe
        else if (budget > 1000) {
            destination = "Europe";
            rest = "Hotel";
            // calc price for holiday regarding the season
            spentMoney = budget * 0.90;
        }

        // print out the destination, rest type and spent money values
        System.out.printf("Somewhere in %s%n%s - %.2f", destination, rest, spentMoney);
    }
}