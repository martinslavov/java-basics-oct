package _05_While_Lopp;

import java.util.Scanner;

public class _02_Password {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        // повтаряме: въвеждане на парола
        // стоп: въведена парола == password
        // продължаваме: въведена парола != password

        String enteredPassword = scanner.nextLine();
        while (!enteredPassword.equals(password)) {
            // System.out.println("Wrong password!");
            enteredPassword = scanner.nextLine();
        }

        // въведена парола == password
        System.out.println("Welcome " + username + "!");

    }
}