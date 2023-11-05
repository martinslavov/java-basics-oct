package _06_NestedLoops_EXERCISE;

import java.util.Scanner;

public class _04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juryCount = Integer.parseInt(scanner.nextLine());

        // Create two help variables for storing the overall count and sum of grades
        int allGradesCount = 0;
        double allGradesSum = 0;

        // While loop for getting the presentation name until a "Finish" command is received
        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String namePres = command;

            // Create local variable for storing the sum of grades for each presentation
            double sumGrades = 0.0;

            // For loop iterating through the grades given by the N graders in the jury
            for (int i = 1; i <= juryCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());

                // Add the grade to the local sum of grades for each presentation
                sumGrades += grade;

                // Add the grade to the global sum/counter of grades
                allGradesCount++;
                allGradesSum += grade;
            }

            // Print out the average grade for each presentation
            System.out.printf("%s - %.2f.%n", namePres, sumGrades / juryCount);
            command = scanner.nextLine();
        }

        // Print out the student's final assessment
        System.out.printf("Student's final assessment is %.2f.", allGradesSum / allGradesCount);
    }
}