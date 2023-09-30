package _03_java.first.steps.in.coding;

import java.util.Scanner;

public class _03_RectangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine()); // camel case
        int secondNumber = Integer.parseInt(scanner.nextLine()); // camel case
        int area = firstNumber * secondNumber;
        System.out.println(area);
    }

}
