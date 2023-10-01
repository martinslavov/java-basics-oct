package _01_FirstStepsInCoding_EXERCISE;

import java.util.Scanner;

public class _05_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pensCount = Integer.parseInt(scanner.nextLine());
        int markersCount = Integer.parseInt(scanner.nextLine());
        int detergentLiters = Integer.parseInt(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double pensPrice = pensCount * 5.80;
        double markersPrice = markersCount * 7.20;
        double detergentPrice = detergentLiters * 1.20;
        double totalPrice = pensPrice + markersPrice + detergentPrice;

        double finalPriceWithDiscount = totalPrice - (totalPrice * discountPercent/100);
        System.out.println(finalPriceWithDiscount);
    }
}
