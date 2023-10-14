package _03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class _11_FruitShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine(); // плод
        String dayOfWeek = scanner.nextLine(); // ден от седмицата
        double quantity = Double.parseDouble(scanner.nextLine()); // количество

        double price = 0;
        boolean isValid = true;

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                    price = 2.50;
                } else if (fruit.equals("apple")) {
                    price = 1.20;
                } else if (fruit.equals("orange")) {
                    price = 0.85;
                } else if (fruit.equals("grapefruit")) {
                    price = 1.45;
                } else if (fruit.equals("kiwi")) {
                    price = 2.70;
                } else if (fruit.equals("pineapple")) {
                    price = 5.50;
                } else if (fruit.equals("grapes")) {
                    price = 3.85;
                } else {
                    isValid = false;
                }
                break;
            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) {
                    price = 2.70;
                } else if (fruit.equals("apple")) {
                    price = 1.25;
                } else if (fruit.equals("orange")) {
                    price = 0.90;
                } else if (fruit.equals("grapefruit")) {
                    price = 1.60;
                } else if (fruit.equals("kiwi")) {
                    price = 3.00;
                } else if (fruit.equals("pineapple")) {
                    price = 5.60;
                } else if (fruit.equals("grapes")) {
                    price = 4.20;
                } else {
                    isValid = false;
                }
                break;
            default:
                isValid = false;
                break;
        }

        if (isValid) {
            double totalPrice = quantity * price;
            System.out.printf("%.2f", totalPrice);
        } else {
            System.out.println("error");
        }

    }

}
