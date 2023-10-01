package _01_FirstStepsInCoding_EXERCISE;

import java.util.Scanner;

public class _07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegMenu = Integer.parseInt(scanner.nextLine());

        double totalPrice = (chickenMenu * 10.35) + (fishMenu * 12.40) + (vegMenu * 8.15);
        double dessertPrice = totalPrice * 0.20;

        double finalPrice = totalPrice + dessertPrice + 2.50;
        System.out.println(finalPrice);
    }
}
