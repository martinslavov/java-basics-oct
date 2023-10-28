package _05_While_Lopp;

import java.util.Scanner;

public class _08_Graduation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int counter = 1; // в клас е ученикът
        double sum = 0; // сумата от оценки
        int excluded = 0; // колко пъти е скъсан
        boolean isGraduated = true;

        while (counter <= 12) {
            // четем оценка от конзолата
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4.00) {
                excluded++;
                if (excluded >= 2) {
                    isGraduated = false;
                    System.out.printf("%s has been excluded at %d grade", name, counter);
                    break;
                }
                continue;

            }

            // събиране на оценките
            sum += grade; // sum = sum + grade
            // преминаване в следващият клас
            counter++;
        }

        if (isGraduated) {
            System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
        }

    }


}
