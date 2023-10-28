package _05_While_Lopp;

import java.util.Scanner;

public class _01_ReadText {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // повтаряне: въвеждане на входни данни и отпечатване
        // стоп:  входни данни == "Stop"
        // продължаваме: входните данни != "Stop"

        while (!input.equals("Stop")) {
            System.out.println(input);
            input = scanner.nextLine();
        }

    }
}