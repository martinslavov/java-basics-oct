package _05_WhileLoop_EXERCISE;

import java.util.Scanner;

public class _06_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int cakePieces = width * length;

        boolean isCakeEaten = false;

        String command = scanner.nextLine();
        while (!command.equals("STOP")) {
            int pieces = Integer.parseInt(command);

            cakePieces = cakePieces - pieces;
            // cakePieces -= pieces

            if (cakePieces <= 0) {
                isCakeEaten = true;
                break;
            }

            command = scanner.nextLine();
        }

        if (isCakeEaten) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
        } else {
            System.out.printf("%d pieces are left.", cakePieces);
        }
    }
}