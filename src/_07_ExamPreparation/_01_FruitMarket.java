package _07_ExamPreparation;

import java.util.Scanner;

public class _01_FruitMarket {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());

        double bananasQuantity = Double.parseDouble(scanner.nextLine());
        double orangesQuantity = Double.parseDouble(scanner.nextLine());
        double raspberriesQuantity = Double.parseDouble(scanner.nextLine());
        double strawberriesQuantity = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberriesPrice / 2;
        double orangesPrice = raspberriesPrice - raspberriesPrice * 0.40;
        double bananasPrice = raspberriesPrice - raspberriesPrice * 0.80;

        double bananasSum = bananasPrice * bananasQuantity;
        double orange = orangesPrice * orangesQuantity;
        double raspberriesSum = raspberriesPrice * raspberriesQuantity;
        double strawberriesSum = strawberriesPrice * strawberriesQuantity;

        double totalSum = bananasSum + orange + raspberriesSum + strawberriesSum;

        System.out.printf("%.2f", totalSum);




    }
}
