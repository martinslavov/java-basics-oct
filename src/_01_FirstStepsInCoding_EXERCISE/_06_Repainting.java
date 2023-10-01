package _01_FirstStepsInCoding_EXERCISE;

import java.util.Scanner;

public class _06_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int plasticCount = Integer.parseInt(scanner.nextLine());
        int paintLiters = Integer.parseInt(scanner.nextLine());
        int thinnerLiters = Integer.parseInt(scanner.nextLine());
        int hoursWorkers = Integer.parseInt(scanner.nextLine());

        double plasticPrice = (plasticCount + 2) * 1.50;
        double paintPrice = (paintLiters + (paintLiters * 0.10)) * 14.50;
        double thinnerPrice = thinnerLiters * 5.00;

        double totalPrice = plasticPrice + paintPrice + thinnerPrice + 0.40;
        double hourPrice = totalPrice * 0.30;

        double workersFinalPrice = hourPrice * hoursWorkers;
        double finalPrice = totalPrice + workersFinalPrice;

        System.out.println(finalPrice);
    }
}
