package _01_FirstStepsInCoding_EXERCISE;

import java.util.Scanner;

public class _03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int depositDue = Integer.parseInt(scanner.nextLine());
        double annualInterestPercent = Double.parseDouble(scanner.nextLine());

        double annualInterest = depositSum * (annualInterestPercent/100);
        double monthlyInterest = annualInterest / 12;

        double totalSum = depositSum + depositDue * monthlyInterest;
        System.out.println(totalSum);
    }
}
