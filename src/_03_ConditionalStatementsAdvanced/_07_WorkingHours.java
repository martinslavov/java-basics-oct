package _03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class _07_WorkingHours {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        // отворено: час е [10-18] и ден [Monday - Saturday] - open
        // затвоерено: час < 10 или час > 18 или Sunday - closed

        // Вариант 1
        if (hour < 10 || hour > 18 || dayOfWeek.equals("Sunday")) {
            System.out.println("closed");
        } else {
            System.out.println("open");
        }

//        // Вариант 2
//        if (hour > 10 && hour < 18 || !dayOfWeek.equals("Sunday")){
//            System.out.println("open");
//        } else {
//            System.out.println("close");
//        }


    }
}
