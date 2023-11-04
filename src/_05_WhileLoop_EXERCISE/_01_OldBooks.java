package _05_WhileLoop_EXERCISE;

import java.util.Scanner;

public class _01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String annysBook = scanner.nextLine();

        int counter = 0;

        String book = scanner.nextLine();
        while (!book.equals("No More Books")) {
            if (book.equals(annysBook)) {
                break;
            }
            counter++;

            book = scanner.nextLine();
        }


        if (book.equals("No More Books")) {
            System.out.printf("The book you search is not here!%n" +
                    "You checked %d books.", counter);
        } else {
            System.out.printf("You checked %d books and found it.", counter);
        }

    }
}