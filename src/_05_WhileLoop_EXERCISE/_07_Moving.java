package _05_WhileLoop_EXERCISE;

import java.util.Scanner;

public class _07_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int volume = width * height * length;
        boolean isFreeSpaceLeft = true;

        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            int boxes = Integer.parseInt(command);

            volume -= boxes;

            if (volume <= 0) {
                isFreeSpaceLeft = false;
                break;
            }

            command = scanner.nextLine();
        }

        if (!isFreeSpaceLeft) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
        } else {
            System.out.printf("%d Cubic meters left.", volume);
        }
    }
}