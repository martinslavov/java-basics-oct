package _02_ConditionalStatements_EXERCISE;

import java.util.Scanner;

public class _08_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameSeries = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int restTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = restTime / 8.0;
        double pauseTime = restTime / 4.0;

        double timeForWatching = restTime - lunchTime - pauseTime;

        double diff = Math.abs(timeForWatching - episodeTime);

        if (timeForWatching >= episodeTime) {
            System.out.printf("You have enough time to watch %s " +
                    "and left with %.0f minutes free time.", nameSeries, Math.ceil(diff));
        } else {
            System.out.printf("You don't have enough time to watch %s, " +
                    "you need %.0f more minutes.", nameSeries, Math.ceil(diff));
        }
    }
}
