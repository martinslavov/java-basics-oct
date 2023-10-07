package _02_ConditionalStatements;

import java.util.Scanner;

public class _07_AreaOfFigures {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String typeFigure = scanner.nextLine();

        double area = 0;
        if (typeFigure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;
        } else if (typeFigure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
        } else if (typeFigure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = radius * radius * Math.PI;
        } else if (typeFigure.equals("triangle")) {
            double base = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = base * height / 2;
        }

        System.out.println(area);

    }

}