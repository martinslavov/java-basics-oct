package _01_FirstStepsInCoding_EXERCISE;

import java.util.Scanner;

public class _01_USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double usd = Double.parseDouble(input);

        double bgn = usd * 1.79549;
        System.out.println(bgn);
    }
}
