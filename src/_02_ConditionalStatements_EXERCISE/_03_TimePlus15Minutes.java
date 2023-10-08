package _02_ConditionalStatements_EXERCISE;

import java.util.Scanner;

public class _03_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes = minutes + 15;

        if (minutes >= 60) {
            hours = hours + 1;
            minutes = minutes - 60;
        }

        if (hours > 23) {
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}
