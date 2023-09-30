package _03_java.first.steps.in.coding;

import java.util.Scanner;

public class _08_PetShop {

    public static void main(String[] args) {

        double dogFoodBoxPrice = 2.50;
        double catFoodBoxPrice = 4;

        Scanner scanner = new Scanner(System.in);
        int numberOfDogsFood = Integer.parseInt(scanner.nextLine());
        int numberOfCatsFood = Integer.parseInt(scanner.nextLine());

        double price = numberOfDogsFood * dogFoodBoxPrice + numberOfCatsFood * catFoodBoxPrice;

        System.out.println(price + "");

    }
}
