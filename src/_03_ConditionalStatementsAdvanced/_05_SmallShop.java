package _03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class _05_SmallShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine(); // закупени продукти
        String town = scanner.nextLine(); // град
        double quantity = Double.parseDouble(scanner.nextLine()); // количество

        double price = 0;

        // Проверка за града -> Sofia, Varna, Plovdiv
        switch (town) {
            case "Sofia":
                if (product.equals("coffee")) {
                    price = 0.50;
                } else if (product.equals("water")) {
                    price = 0.80;
                } else if (product.equals("beer")) {
                    price = 1.20;
                } else if (product.equals("sweets")) {
                    price = 1.45;
                } else if (product.equals("peanuts")) {
                    price = 1.60;
                }
                break;
            case "Varna":
                if (product.equals("coffee")) {
                    price = 0.45;
                } else if (product.equals("water")) {
                    price = 0.70;
                } else if (product.equals("beer")) {
                    price = 1.10;
                } else if (product.equals("sweets")) {
                    price = 1.35;
                } else if (product.equals("peanuts")) {
                    price = 1.55;
                }
                break;

            case "Plovdiv":
                switch (product) {
                    case "coffee":
                        price = 0.40;
                        break;
                    case "water":
                        price = 0.70;
                        break;
                    case "beer":
                        price = 1.15;
                        break;
                    case "sweets":
                        price = 1.30;
                        break;
                    case "peanuts":
                        price = 1.50;
                        break;

                }
                break;
        }

        double totalPrice = quantity * price;
        System.out.println(totalPrice);

    }
}
