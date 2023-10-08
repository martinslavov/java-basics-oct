package _02_ConditionalStatements_EXERCISE;

import java.util.Scanner;

public class _02_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        double bonusPoints = 0;

        if (number <= 100) {
            bonusPoints = 5;
        } else if (number <= 1000) {
            bonusPoints = number * 0.20;
        } else if (number > 1000) {
            bonusPoints = number * 0.10;
        }

        if (number % 2 == 0) {
            bonusPoints = bonusPoints + 1;
        } else if(number % 10 == 5) {
            bonusPoints = bonusPoints + 2;
        }

        System.out.println(bonusPoints);
        System.out.println(bonusPoints + number);
    }
}
