package _03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class _08_CinemaTicket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.nextLine();

        // Monday, Tuesday, Friday -> 12
        // Wednesday, Thursday -> 14
        // Saturday, Sunday -> 16

        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Friday")) {
            System.out.println(12);
        } else if (dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday")) {
            System.out.println(14);
        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            System.out.println(16);
        }

    }
}
