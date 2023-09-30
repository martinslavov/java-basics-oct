package _03_java.first.steps.in.coding;

import java.util.Scanner;

public class _05_GreetingByName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Hello, ");
        System.out.print(name);
        System.out.println("!");
    }
}
