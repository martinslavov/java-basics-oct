package _03_ConditionalStatementsAdvanced_EXERCISE;

import java.util.Scanner;

public class _08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        // calc exam time in minutes => (easier when working only with minutes)
        int timeForExam = (examHour * 60) + examMinutes;
        int timeForArrival = (arrivalHour * 60) + arrivalMinutes;

        // get difference between arrival time and exam time
        int diff = Math.abs(timeForArrival - timeForExam);

        // check if student is late (when timeForArrival > timeForExam)
        if(timeForArrival > timeForExam) {
            System.out.println("Late");

            // more than 1 hour late for the exam
            if(diff >= 60) {
                // convert back into hours/minutes
                int hour = diff / 60;
                int minutes = diff % 60;
                // %02d -> check if minutes are < 10, then insert 0 infront, if not - don't do anything
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            } else{
                System.out.printf("%d minutes after the start", diff);
            }
        }
        // check for arrival on time or earlier, but not more than 30 mins
        else if(timeForExam == timeForArrival || diff <= 30) {
            System.out.println("On Time");

            // check for minutes before the start
            if(diff >= 1 && diff <= 30) {
                System.out.printf("%d minutes before the start", diff);
            }
        }
        else {
            System.out.println("Early");
            // more than 1 hour early for the exam
            if(diff >= 60) {
                // convert back into hours/minutes
                int hour = diff / 60;
                int minutes = diff % 60;
                // %02d -> check if minutes are < 10, then insert 0 infront, if not - don't do anything
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            } else{
                System.out.printf("%d minutes before the start", diff);
            }
        }

    }
}