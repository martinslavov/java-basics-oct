package _04_ForLoop_EXERCISE;

import java.util.Scanner;

public class _08_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matchesCount = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int bonusPoints = 0;
        int wonMatchesCount = 0;
        for (int i = 1; i <= matchesCount; i++) {
            String result = scanner.nextLine();

            switch (result) {
                case "W":
                    wonMatchesCount++;
                    bonusPoints += 2000;
                    // bonusPoints = bonusPoints + 2000;
                    break;
                case "F":
                    bonusPoints += 1200;
                    break;
                case "SF":
                    bonusPoints += 720;
                    break;
            }
        }

        System.out.printf("Final points: %d%n", startingPoints + bonusPoints);
        System.out.printf("Average points: %d%n", bonusPoints / matchesCount);
        System.out.printf("%.2f%%", ((1.0 * wonMatchesCount) / matchesCount) * 100);
    }
}