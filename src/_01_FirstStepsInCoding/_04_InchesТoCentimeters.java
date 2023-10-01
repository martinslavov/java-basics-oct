package _01_FirstStepsInCoding;

import java.util.Scanner;

public class _04_InchesТoCentimeters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double centimeters = Double.parseDouble(scanner.nextLine());
        double inches = centimeters * 2.54;
        System.out.println(inches);
    }

}
