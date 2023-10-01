package _01_FirstStepsInCoding_EXERCISE;

import java.util.Scanner;

public class _09_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeInSm = width * height * length;
        // 1l = 1dm3
        // 1dm = 10sm
        // 1dm3 = 10sm^3 = 10sm * 10sm * 10sm = 1000sm3

        double volumeInLiters = volumeInSm / 1000;
        double finalVolume = volumeInLiters - (volumeInLiters * (percent/100));
        System.out.println(finalVolume);
    }
}
