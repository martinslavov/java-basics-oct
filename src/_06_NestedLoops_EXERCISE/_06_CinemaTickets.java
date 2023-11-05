package _06_NestedLoops_EXERCISE;

import java.util.Scanner;

public class _06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create help variables for getting the overall sold tickets, only for student, standard and kids
        int allTickets = 0;
        int studentCounter = 0;
        int standardCounter = 0;
        int kidCounter = 0;

        // While loop for getting the movie name until a "Finish" command is received
        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String movieName = command;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            // Create a local variable for sold tickets per movie
            int ticketsCounter = 0;

            // While loop for getting the type of a sold ticket
            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")) {

                // Check if the sold ticket is student/standard/kid
                // and increase the counter respectfully
                switch (ticketType) {
                    case "student":
                        studentCounter++;
                        break;
                    case "standard":
                        standardCounter++;
                        break;
                    case "kid":
                        kidCounter++;
                        break;
                }

                // Count the overall sold tickets and the movie based sold tickets
                ticketsCounter++;
                allTickets++;

                // Check if all tickets are sold out = no seats left
                if (ticketsCounter >= freeSeats) {
                    break;
                }

                ticketType = scanner.nextLine();
            }

            // Print out the percentage of sold tickets
            System.out.printf("%s - %.2f%% full.%n", movieName, ((1.0 * ticketsCounter) / freeSeats ) * 100);
            command = scanner.nextLine();
        }

        // Print out sold tickets for all movies and the percentage for student/standard/kid ticket
        System.out.printf("Total tickets: %d%n", allTickets);
        System.out.printf("%.2f%% student tickets.%n", ((1.0 * studentCounter) / allTickets) * 100);
        System.out.printf("%.2f%% standard tickets.%n", ((1.0 * standardCounter) / allTickets) * 100);
        System.out.printf("%.2f%% kids tickets.", ((1.0 * kidCounter) / allTickets) * 100);
    }
}