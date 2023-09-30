package _03_java.first.steps.in.coding;

import java.util.Scanner;

public class _06_ConcatenateData {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // име, фамилия, възраст и град
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String city = scanner.nextLine();


        //v1
        // System.out.print("You are ");
        // System.out.print(firstName);
        // System.out.print(" ");
        // System.out.print(secondName);
        // System.out.print(", a ");
        // System.out.print(age);
        // System.out.print("-years old person from ");
        // System.out.print(city);
        // System.out.print(".");

        //v2
        System.out.println("You are " + firstName + " " + secondName + ", a " + age + "-years old person from " + city + ".");
    }

}
