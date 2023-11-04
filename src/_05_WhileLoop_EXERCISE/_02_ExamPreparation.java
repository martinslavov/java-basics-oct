package _05_WhileLoop_EXERCISE;

import java.util.Scanner;

public class _02_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGradesLimit = Integer.parseInt(scanner.nextLine());

        String lastProblem = "";
        int problemsNumber = 0;
        int sumGrades = 0;
        int badGradesCount = 0;
        boolean isBadGradesLimitReached = false;

        String command = scanner.nextLine();
        while (!command.equals("Enough")) {
            String taskName = command;
            int grade = Integer.parseInt(scanner.nextLine());

            sumGrades += grade;
            problemsNumber++;
            lastProblem = taskName;

            if (grade <= 4) {
                badGradesCount++;
            }

            if (badGradesCount >= badGradesLimit) {
                isBadGradesLimitReached = true;
                break;
            }

            command = scanner.nextLine();
        }


        if (isBadGradesLimitReached) {
            System.out.printf("You need a break, %d poor grades.", badGradesCount);
        } else {
            System.out.printf("Average score: %.2f%n" +
                    "Number of problems: %d%n" +
                    "Last problem: %s", 1.0 * sumGrades / problemsNumber, problemsNumber, lastProblem);
        }
    }
}