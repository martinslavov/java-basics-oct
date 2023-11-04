package _05_WhileLoop_EXERCISE;

import java.util.Scanner;

public class _03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int spendRow = 0;
        int all = 0;

        while (true) {
            String name = scanner.nextLine();
            double n = Double.parseDouble(scanner.nextLine());
            all++;

            if(name.equals("save")) {
                currentMoney += n;
                spendRow = 0;

            } else if(name.equals("spend")) {
                currentMoney -= n;
                spendRow++;

                if(currentMoney < 0) {
                    currentMoney = 0;
                }
            }

            if(currentMoney >= tripPrice) {
                System.out.printf("You saved the money for %d days.", all);
                break;
            }

            if(spendRow == 5) {
                System.out.printf("You can't save the money.%n%d", all);
                break;
            }
        }

    }
}