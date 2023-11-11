package _07_ExamPreparation;

import java.util.Scanner;

public class _03_MovieDestination {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budjet = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int numberDays = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        if (season.equals("Summer")){
            switch (destination){
                case "Dubai":
                    totalPrice = numberDays * 40000 - (numberDays * 40000) * 0.30 ;
                    break;
                case "Sofia" :
                    totalPrice = numberDays * 12500 + (numberDays * 12500) * 0.25;
                    break;
                case "London" :
                    totalPrice = numberDays * 20250;
                    break;
            }

        } else {
            switch (destination){
                case "Dubai":
                    totalPrice = numberDays * 45000 - (numberDays * 45000) * 0.30 ;
                    break;
                case "Sofia" :
                    totalPrice = numberDays * 17000 + (numberDays * 17000) * 0.25;
                    break;
                case "London" :
                    totalPrice = numberDays * 24000;
                    break;
            }
        }

        if (budjet >= totalPrice){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", (budjet - totalPrice));
        } else {
            System.out.printf("The director needs %.2f leva more!", Math.abs(budjet - totalPrice));
        }


    }
}
