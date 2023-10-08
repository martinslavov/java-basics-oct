package _02_ConditionalStatements_EXERCISE;

import java.util.Scanner;

public class _06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeFor1Meter = Double.parseDouble(scanner.nextLine());

        double timeForSwimming = distance * timeFor1Meter;
        double intervals = Math.floor(distance / 15);
        timeForSwimming = timeForSwimming + (intervals * 12.5);

        if (timeForSwimming < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeForSwimming);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeForSwimming - record);
        }
    }
}
