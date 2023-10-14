package _03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class _12_TradeCommissions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double commission = 0.00;
        boolean isValid = true;

        switch (city) {
            case "Sofia":
                if (quantity >= 0 && quantity <= 500) {
                    commission = 0.05;
                } else if (quantity > 500 && quantity <= 1000) {
                    commission = 0.07;
                } else if (quantity > 1000 && quantity <= 10000) {
                    commission = 0.08;
                } else if (quantity > 10000) {
                    commission = 0.12;
                } else {
                    isValid = false;
                }
                break;
            case "Varna":
                if (quantity >= 0 && quantity <= 500) {
                    commission = 0.045;
                } else if (quantity > 500 && quantity <= 1000) {
                    commission = 0.075;
                } else if (quantity > 1000 && quantity <= 10000) {
                    commission = 0.10;
                } else if (quantity > 10000) {
                    commission = 0.13;
                } else {
                    isValid = false;
                }
                break;
            case "Plovdiv":
                if (quantity >= 0 && quantity <= 500) {
                    commission = 0.055;
                } else if (quantity > 500 && quantity <= 1000) {
                    commission = 0.08;
                } else if (quantity > 1000 && quantity <= 10000) {
                    commission = 0.12;
                } else if (quantity > 10000) {
                    commission = 0.145;
                } else {
                    isValid = false;
                }
                break;
            default:
                isValid = false;
                break;
        }

        if (isValid) {
            double totalPrice = quantity * commission;
            System.out.printf("%.2f", totalPrice);
        } else {
            System.out.println("error");
        }
    }

}
